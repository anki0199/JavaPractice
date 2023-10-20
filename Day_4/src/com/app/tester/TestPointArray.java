package com.app.tester;
import com.app.geometry.*;
import java.util.Scanner;

public class TestPointArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many point to plot");
		Point2D[]point=new Point2D[sc.nextInt()];
		boolean exit=false;
		while(!exit) {
			System.out.println("1.plot points 2. display 3.check equal and calculate distance 4.exit");
			System.out.println("Enter choice");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter the index of array");
				int ind=sc.nextInt();
				if(ind<point.length) {
					if(point[ind]==null) {
						System.out.println("Enter Points");
						Point2D p1=new Point2D(sc.nextDouble(), sc.nextDouble());
					}
					else {
						System.out.println("Fullll");
					}
				}
				break;
			case 2:
				for(Point2D p:point) {
					if(p!=null)	
						System.out.println(p.getDetails());
				}
				break;
			case 3:
				System.out.println("Enter index number to check equality and calculate distance");
				int ind1=sc.nextInt();
				int ind2=sc.nextInt();
				if(ind1<point.length && ind2<point.length) {
					if(point[ind1]!= null && point[ind2]!=null) {
						System.out.println(point[ind1].checkEqual(point[ind2])?"same":"Different");
						System.out.println("Distance -"+point[ind2].calculateDistance(point[ind1]));
					}
				}
				break;
			case 4:
				exit=true;
				break;
			default:
				System.out.println("Enter valid");
			}
		}
		sc.close();
	}

}
