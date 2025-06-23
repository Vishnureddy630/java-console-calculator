import java.util.Scanner;
class  BasicCalculator
{
static Scanner sc= new Scanner(System.in);

public static void add(double a,double b)
{
		
		System.out.println("Additon of two numsbers are :"+(a+b));
}
public static void sub(double a,double b)
{
		
		System.out.println("Subtraction of two numsbers are :"+(a-b));
}public static void mult(double a,double b)
{

		System.out.println("Multiplication of two numsbers are :"+(a*b));
}public static void div(double a,double b)
{
		
		if(b==0)
		{
			System.out.println("Cannot divide by zero");
			return;
		}
		System.out.println("Division of two numsbers are :"+(a/b));

}
public static double[] input()
{
    
    double a,b;
		while(true){
        		try
        		{
        		    System.out.println("Enter the First value: ");
        	        a=sc.nextDouble();
        	    
        	        break;
        		}
        		catch(Exception e){
        		    System.out.println("Enter valid values "+e);
        		     sc.nextLine();
        		}
		
		}
		
		while(true){
        		try{
        	        System.out.println("Enter the Second value: ");
        	        b=sc.nextDouble();
        	        break;
        		}
        		catch(Exception e){
        		    System.out.println("Enter valid values "+e);
        		     sc.nextLine();
        		}
    		}
		return new double[]{a,b};
}
public static void main(String[] args)
	{

		

		while(true)
{
		System.out.println("Press + for addition, - for  subtraction, * for  multiplication, / for  division, 0 for terminated");	
		char operation=sc.next().charAt(0);
		
		if(operation=='0')
		{
		 System.out.println("Program is terminated...");
	     sc.close();
		System.exit(0);
		}
		
		
	 switch (operation) {
                case '+':
                case '-':
                case '*':
                case '/':
                    double[] arr = input();
                    switch (operation) {
                        case '+': add(arr[0], arr[1]); break;
                        case '-': sub(arr[0], arr[1]); break;
                        case '*': mult(arr[0], arr[1]); break;
                        case '/': div(arr[0], arr[1]); break;
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
}
	}
}
