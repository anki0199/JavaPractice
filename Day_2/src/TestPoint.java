import java.util.*;

class TestCords {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X and Y co-ordinates 123");
		Point2D p1=new Point2D(sc.nextDouble(),sc.nextDouble());
		System.out.println(p1.show());
		System.out.println("Enter another X and Y co-ordinates");
		Point2D p2=new Point2D(sc.nextDouble(),sc.nextDouble());
		System.out.println(p2.show());
		if(p1.isEqual(p2)){
			System.out.println("Same");
		}
		else{
			System.out.println("Different");
		}
		System.out.println("Enter another X and Y co-ordinates to calculate distance");
		Point2D p3=new Point2D(sc.nextDouble(),sc.nextDouble());
		System.out.println(p3.show());
		System.out.println("Distance between this two points are : "+p3.calculateDistance(p1));
		sc.close();
	}
}