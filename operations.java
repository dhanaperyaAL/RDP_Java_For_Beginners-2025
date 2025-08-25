public class operations{

	int a = 121;
	int b = 11;
	Boolean x = true;
	Boolean y = false;
	int d = 5;
        int e = 9;

 private void showArithmeticVars() 
{
	System.out.println("\n Variables a = " +a+ ", b = " +b);
}

 private void showIncDecVars() 
{
        System.out.println("\n Variables a = " +a);
}

 private void showAssignVars() 
{
        System.out.println("\n Variables a = " +a);
}

 private void showRelationVars() 
{
        System.out.println("\n Variables a = " +a+ ", b = " + b);
}

 private void showLogicalVars() 
{
        System.out.println("\n Variables x = " +x+ ", y = " + y);
}

 private void showBitwiseVars() 
{
        System.out.println("\n Variables d = " +d+ ", e = " + e);
}
 public void arithmetic()
{
	showArithmeticVars(); 
	System.out.println("Addition:"+(a+b));
	System.out.println("Subtraction:"+(b-a));
	System.out.println("Multiply:"+(a*b));
	System.out.println("Division:"+ (b/a));
	System.out.println("Modules:"+(a%b));
	
}

public void P_inc_dec()
{
	showIncDecVars();
	System.out.println("Postincrement:" +(a++));
	System.out.println("Preincrement:" +(++a));
	System.out.println("Postdecrement:" +(a--));
	System.out.println("Predecrement:" +(--a));

}

public void assign()
{
	showAssignVars();
	System.out.println(" a+=3 :"+ (a+=3));
	System.out.println(" a-=2 :" +(a-=2));
	System.out.println(" a *=22 :" +(a*=22));
	System.out.println(" a/=11 :" +(a/=11));
	System.out.println(" a % =2:" +(a%=2));
	System.out.println(" a&= 2:"+(a&= 2));
	System.out.println(" a|=2:" +(a|=2));
	System.out.println(" a^= 2:" +(a^= 2));
	System.out.println(" a<<= 2 :"+ (a<<= 2));
	System.out.println(" a>>= 1:"+( a>>= 1));
	System.out.println(" a>>= 1:"+(a>>>= 1));
}

public void relation()
{
	showRelationVars();
	System.out.println(" a>b :" +(a>b));
	System.out.println(" a<b :"+(a<b));
	System.out.println(" a >=b :"+(a>=b));
	System.out.println(" a<=b: " +(a<=b));
	System.out.println(" a==b :"+(a ==b));
	System.out.println(" a!=b :"+ (a!=b));
	
}

public void logical()
{
	showLogicalVars();
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

}

public void Bitwi()
{
	showBitwiseVars();
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
       
}

}