import java.util.*;
import java.lang.Math;
class Point2D{
	private double x_cord;
	private double y_cord;
	Point2D(double x,double y){
		x_cord=x;
		y_cord=y;
	}
	String show(){
		return "X co-ordinate is :"+x_cord+" and Y co-ordinate is "+y_cord;
	}
	boolean isEqual(Point2D p){
		return this.x_cord==p.x_cord && this.y_cord==p.y_cord;
	}
	double calculateDistance(Point2D d){
		double d1=Math.sqrt(Math.pow((d.x_cord-this.x_cord),2)+Math.pow((d.y_cord-this.y_cord),2));
		return d1;
		
	}
}