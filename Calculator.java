import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expression = sc.nextLine();
	
        double result = evaluate(expression);

	System.out.println("expression:"+expression);
        System.out.println("Result: " + result);
    }

    public static double evaluate(String expr) {
        expr = expr.replaceAll(" ", ""); 

        char[] operators = new char[expr.length()];
        double[] numbers = new double[expr.length()];
        int numIndex = 0, opIndex = 0;

        String temp = "";

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch >= '0' && ch <= '9') {
                temp += ch;
            } 
	    else {
                 numbers[numIndex++] = Double.parseDouble(temp);
                 temp = "";
                 operators[opIndex++] = ch;
                }
        }

        if (!temp.equals(""))
	  {
            numbers[numIndex++] = Double.parseDouble(temp);
          }


        for (int i = 0; i < opIndex; i++) {
            if (operators[i] == '^')
	    {
                numbers[i] = Math.pow(numbers[i], numbers[i + 1]);
                shiftLeft(numbers, i + 1, numIndex);
                shiftLeftChar(operators, i, opIndex);
                numIndex--;
                opIndex--;
                i--; 
            }
        }

       
        for (int i = 0; i < opIndex; i++) 
	{
            if  (operators[i] == '/') 
	    {
                numbers[i] = numbers[i] / numbers[i + 1];
                shiftLeft(numbers, i + 1, numIndex);
                shiftLeftChar(operators, i, opIndex);
                numIndex--;
                opIndex--;
                i--;
            } 
	else if (operators[i] == '*')
	    {
                numbers[i] = numbers[i] * numbers[i + 1];
                shiftLeft(numbers, i + 1, numIndex);
                shiftLeftChar(operators, i, opIndex);
                numIndex--;
                opIndex--;
                i--;
            }
        }

        
        for (int i = 0; i < opIndex; i++) 
	   {
            if (operators[i] == '+')
	      {
                numbers[i] = numbers[i] + numbers[i + 1];
                shiftLeft(numbers, i + 1, numIndex);
                shiftLeftChar(operators, i, opIndex);
                numIndex--;
                opIndex--;
                i--;
              }
	    else if (operators[i] == '-') 
	      {
                numbers[i] = numbers[i] - numbers[i + 1];
                shiftLeft(numbers, i + 1, numIndex);
                shiftLeftChar(operators, i, opIndex);
                numIndex--;
                opIndex--;
                i--;
              }
           } 

        return numbers[0]; 
    }

    
    public static void shiftLeft(double[] arr, int from, int size)
	 {
        for (int i = from; i < size - 1; i++) 
		{
            		arr[i] = arr[i + 1];
        	}
    	 }

    
    public static void shiftLeftChar(char[] arr, int from, int size) {
        for (int i = from; i < size - 1; i++) 
		{
            		arr[i] = arr[i + 1];
        	}
    }
}
