import java.util.Scanner;

class FoodMenu{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int qty=0;
		float total=0;
		boolean exit=false;
		
		while(!exit){
		System.out.println("Enter"+ "\n" +"1. Dosa" + "\n" +"2. Idli"+"\n" +"3. Samosa"+"\n" +"4. Pav Bhaji" + "\n" + "5. Tea" + "\n" + "6. Coffee" + "\n" + "7. Vada Pav" + "\n" + "8. Mendu vada" + "\n" + "9. Upama" + "\n" +"10. Generate Bill" );
			int op = sc.nextInt();
			
			if(op>0 && op<10){
				System.out.println("Enter quantity: ");
				qty=sc.nextInt();
			}
			switch(op){
				case 1:
					total += 30*qty;
					break;
				case 2:
					total += 20*qty;
					break;
				case 3:
					total += 10*qty;
					break;
				case 4:
					total += 45*qty;
					break;
				case 5:
					total += 5*qty;
					break;
				case 6:
					total += 15*qty;
					break;
				case 7:
					total += 12*qty;
					break;
				case 8:
					total += 25*qty;
					break;
				case 9:
					total += 35*qty;
					break;
				case 10:
					System.out.println("Total bill is: "+ total);
					exit=true;
					break;
				default:
					exit=true;
					System.out.println("Invalid input");
					break;
			}
		}
		
		sc.close();
	}
}
