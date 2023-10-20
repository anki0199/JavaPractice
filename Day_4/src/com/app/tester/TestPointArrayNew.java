package com.app.tester;
import java.util.Scanner;
import com.app.core.Point2D;
//import java.util.Arrays;
public class TestPointArrayNew {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Points to Plot");
		Point2D[] point=new Point2D[sc.nextInt()];
		boolean flag=true;
		while(flag) {
			System.out.println("1. Plot a new point 2.  Display all points plotted so far. 3. Test equality of 2 points 4. Calculate Distance");
			System.out.println("Choose any number");
			int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter Index");
					int ind=sc.nextInt();
					if(ind<point.length) {
						if(point[ind]==null) {
							System.out.println("Enter Points");
							point[ind]=new Point2D(sc.nextDouble(),sc.nextDouble());
						}
						else {
							System.out.println("Index not null");
						}
					}
					break;
				case 2:
					for (Point2D p1 : point) {
						if(p1!=null)
							System.out.println(p1.getDetails());
					}
					break;
				case 3:
					System.out.println("Enter Index no to check equality");
					int ind1 = sc.nextInt();
					int ind2 = sc.nextInt();
					if (ind1 < point.length && ind2 < point.length) {
						System.out.println(point[ind1].checkEqual(point[ind2]) ? "Same" : "Different");
					} else {
						System.out.println("Invalid Index");
					}
					break;
				case 4:
					System.out.println("Enter Index number to calculate distance");
					int ind3 = sc.nextInt();
					int ind4 = sc.nextInt();
					if (ind3 < point.length && ind4 < point.length) {
						System.out.println(point[ind3].calculateDistance(point[ind4]));
					} else {
						System.out.println("Invalid Index");
					}
					break;
				case 10:
					flag=false;
					break;
				default:
					System.out.println("Enter Valid choice");
					break;
				}
			}
		sc.close();
	}

}
