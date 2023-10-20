import java.util.Scanner;

class Calculator{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter 2 numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	boolean exit=false;
	
	while(!exit)
	{
		System.out.println("Enter choice for performing Arithmetic operation\n 1. Addition(+)\n 2. Subtraction(-)\n 3. Multiplication(*)\n 4. Division(/)\n 5. exit");
		int op = sc.nextInt();
			switch(op){
				case 1:
				System.out.println("Addition is: " + (num1+num2));
				break;
				
				case 2:
				System.out.println("subtraction is: " + (num1-num2));
				break;
				
				case 3:
				System.out.println("Multiplication is: " + (num1*num2));
				break;
				
				case 4:
				System.out.println("division is: " + (num1/num2));
				break;
				
				case 5:
				exit=true;
				System.out.println("exited successfully");
				break;
				
				default: 
				System.out.println("Enter a valid input");
				break;
				
			}
	}
	
	sc.close();
	
}
}