package com.cdac.core;
import java.lang.Math;

public class Point2D{
	private double x;
	private double y;
	
	//parameterized constructor to accept x & y co-ords.
	public Point2D(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public String show(){
		return "X co-ordinate is: "+x+" and Y co-ordinate is: "+y;
	}
	
	public boolean isEqual(Point2D p2){
		return x==p2.x && y==p2.y;
	}
	
	public double calculateDistance(Point2D p2){
		
		double disx=(p2.x*p2.x)-(x*x);
		double disy=(p2.y*p2.y)-(y*y);
		return Math.sqrt(Math.abs(disx)+Math.abs(disy));
	}
}