package com.cdac.tester;
import java.util.Scanner;
import com.cdac.core.Point2D;

class TestPoint{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y coordinates");
		Point2D p1=new Point2D(sc.nextDouble(),sc.nextDouble());
		p1.show();
		System.out.println("Enter x and y coordinates");
		Point2D p2=new Point2D(sc.nextDouble(),sc.nextDouble());
		p2.show();
		boolean ans=p1.isEqual(p2);
		if(ans)
		{
			System.out.println(" point p1 and p2 are equal");
		}
		else
		{
			System.out.println(" point p1 and p2 are not equal");
		}
		double distance=p1.calculateDistance(p2);
		System.out.println(" the distance is : "+ distance);
		
		sc.close();
	}		
}
	