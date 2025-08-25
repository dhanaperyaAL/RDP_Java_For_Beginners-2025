public class largesmall
{
public static void main(String[] args){

int start = 1;
int end = 100;

for( int i =0; i< end/2; i++)
{
	int large = end- i;
	int smaller = start + i;
	System.out.println("The Pairs of large and smaller number is : (" + large + " , " + smaller+" )");
}

}

}
