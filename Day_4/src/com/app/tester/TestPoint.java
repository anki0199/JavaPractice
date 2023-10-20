package com.app.tester;
import com.app.geometry.*;
/*3.6 Write TestPoint class ,  with a main method
Accept co ordinates of 2 points from user (Scanner) --p1 & p2

3.7 Use getDetails method to display point details.(p1's details & p2's details)

3.8 Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position)

3.9 Create new point p3 , with the dimensions offset from p1.*/
import java.util.Scanner;
import static java.lang.Math.*;
class TestPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter co-ordinates");
        Point2D cord=new Point2D(sc.nextDouble(),sc.nextDouble());
        System.out.println("Co-ordinates "+cord.getDetails());
        System.out.println("Again Enter Co-ordinates: ");
        Point2D p1=new Point2D(sc.nextDouble(),sc.nextDouble());
        System.out.println(cord.checkEqual(p1)?"Same":"Different");
        System.out.println("Enter new co-ordinates");
        Point2D p2=p1.createNewPoint(sc.nextDouble(),sc.nextDouble());
        System.out.println("New Points : "+p2.getDetails());
        System.out.println("Distance "+cord.calculateDistance(p1));
        sc.close();
    }
    
}
