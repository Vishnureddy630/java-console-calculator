import java.util.Scanner;
class BasicCalculator
{
static Scanner sc= new Scanner(System.in);
static float a=0,b=0;
public static void add()
{
		
		System.out.println("Additon of two numbers are :"+(a+b));
}
public static void sub()
{
		
		System.out.println("Subtraction of two numbers are :"+(a-b));
}public static void mult()
{

		System.out.println("Multiplication of two numbers are :"+(a*b));
}public static void div()
{
		
		if(b==0)
		{
			System.out.println("Cannot divide by zero");
			return;
		}
		System.out.println("Division of two numbers are :"+(a/b));

}
public static void input()
{
    System.out.println("Enter the First value: ");
	a=sc.nextFloat();
	System.out.println("Enter the Second value: ");
	b=sc.nextFloat();
    
}
public static void main(String[] args)
	{

		

		while(true)
{
		System.out.println("Press + for addition, - for  subtraction, * for  multiplication, / for  division, 0 for terminated");	
		char operation=sc.next().charAt(0);
		
		switch(operation)
{
	case '+':
	    input();
		add();
		break;

	case '-':
	    input();
		sub();
		break;

	case '*':
	    input();
		mult();
		break;

	case '/':
	    input();
		div();
		break;
	case '0':
	    System.out.println("Program is terminated...");
		sc.close();
		System.exit(0);
	default :
	    System.out.println("Please enter the valid symbol");
	 
}
}
	}
}
