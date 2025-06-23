import java.util.Scanner;
class BasicCalculator
{
static Scanner sc= new Scanner(System.in);
static int a=0,b=0;
public static void add()
{
		System.out.println("Enter the First value: ");
		a=sc.nextInt();
		System.out.println("Enter the Second value: ");
		b=sc.nextInt();
		System.out.println("Additon of two numbers are :"+(a+b));
}
public static void sub()
{
		System.out.println("Enter the First value: ");
		a=sc.nextInt();
		System.out.println("Enter the Second value: ");
		b=sc.nextInt();
		System.out.println("Subtraction of two numbers are :"+(a-b));
}public static void mult()
{
		System.out.println("Enter the First value: ");
		a=sc.nextInt();
		System.out.println("Enter the Second value: ");
		b=sc.nextInt();
		System.out.println("Multiplication of two numbers are :"+(a*b));
}public static void div()
{
		System.out.println("Enter the First value: ");
		a=sc.nextInt();
		System.out.println("Enter the Second value: ");
		b=sc.nextInt();
		if(b==0)
		{
			System.out.println("Cannot divide by zero");
			return;
		}
		System.out.println("Division of two numbers are :"+(a/b));

}
public static void main(String[] args)
	{

		

		while(true)
{
		System.out.println("Press + for addition, - for  subtraction, * for  multiplication, / for  division, # for exit");	
		char operation=sc.next().charAt(0);
		switch(operation)
{
	case '+':
		add();
		break;

	case '-':
		sub();
		break;

	case '*':
		mult();
		break;

	case '/':
		div();
		break;
	case '#':
		sc.close();
		System.exit(0);
}
}
	}
}
