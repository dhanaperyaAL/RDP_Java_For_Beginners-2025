import java.util.Scanner;

public class tigsimpCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {

            System.out.println("=== Calculator ===");

            System.out.println("Operation are : ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Sine (sin)");
            System.out.println("7. Cosine (cos)");
            System.out.println("8. Tangent (tan)");
            System.out.println("9. Exit");

	    System.out.println("Choose operation : ");
            int choice = sc.nextInt();

            double num1, num2, result = 0;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                    } 
		    else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                   }
                    break;
                case 5:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                    break;
                case 6:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    result = Math.sin(Math.toRadians(num1));
                    System.out.println("sin(" + num1 + ") = " + result);
                    break;
                case 7:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    result = Math.cos(Math.toRadians(num1));
                    System.out.println("cos(" + num1 + ") = " + result);
                    break;
                case 8:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    result = Math.tan(Math.toRadians(num1));
                    System.out.println("tan(" + num1 + ") = " + result);
                    break;
                case 9:
                    keepRunning = false;
                    System.out.println("..........Exiting Calculator............");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

            System.out.println();
        }

        sc.close();
    }
}
