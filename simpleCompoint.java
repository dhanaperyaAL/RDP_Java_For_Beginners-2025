import java.util.Scanner;

public class simpleCompoint
{

public void simpleinterest(double p, double r, double t)
{
	double si = (p * r * t)/100;
	System.out.println("The Simple interest amount is :" +si);
}

public void compoundinterest(double pr, double ra, double ti, double num)
{
	double ci = pr*(Math.pow((1 +ra/100),(ti*num)))-pr;
	System.out.println("The Compound interest amount is :" +ci);

}
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	simpleCompoint obj = new simpleCompoint();
	
	System.out.println( "1. Simple Intrest" );
	System.out.println( "2. Coumpound Interest" );
	System.out.println( "Enter the Choice:" );
	int choice = sc.nextInt();

	switch(choice){
		case 1:
			System.out.println( "Enter the orginal amt borrowed:" );
			double p = sc.nextDouble();
			System.out.println( "Enter the annual interest ate:" );
			double r = sc.nextDouble();
			System.out.println( "Enter the time period in a year:" );
			double t = sc.nextDouble();
			obj.simpleinterest(p,r,t);
			break;
		case 2:
			System.out.println( "Enter the orginal amt borrowed:" );
			double pr = sc.nextDouble();
			System.out.println( "Enter the annual interest ate:" );
			double ra = sc.nextDouble();
			System.out.println( "Enter the time period in a year:" );
			double ti = sc.nextDouble();
			System.out.println( "Enter the Number of times interest is compounded:" );
			double num = sc.nextDouble();
			obj.compoundinterest(pr, ra, ti,num);
			break;
		default:
			System.out.println("Not a valid Choice!!");

}	
sc.close();


}

}
