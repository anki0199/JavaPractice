import java.util.Scanner;
class DoubleAverage{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter 2 numbers");
	
		while(!sc.hasNextDouble())
		{
			System.out.println("Invalid input, expected double type");
			sc.next();
			
		}
		
		double num1 =sc.nextDouble();
		
		while(!sc.hasNextDouble())
		{
			System.out.println("Invalid input, expected double type");
			sc.next();
			
		}
		
		double num2 =sc.nextDouble();
		
		System.out.println("Average of two numbers is: "+ ((num1+num2)/2));
		
	}
	}
