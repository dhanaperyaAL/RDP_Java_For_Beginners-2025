import java.util.Scanner;

public class simpleint
{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println( "Enter the orginal amt borrowed:" );
double p = sc.nextDouble();
System.out.println( "Enter the annual interest ate:" );
double r = sc.nextDouble();
System.out.println( "Enter the time period in a year:" );
double t = sc.nextDouble();

double si = (p * r * t)/100;

System.out.println("The Simple interest amount is :" +si);
}

}
