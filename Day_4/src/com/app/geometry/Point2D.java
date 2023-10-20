package com.app.geometry;
public class Point2D {
    private double x_coord,y_coord;
    public Point2D(double x,double y){
        x_coord=x;
        y_coord=y;
    }


public String getDetails(){
    return "x and y co-ordinates are " +x_coord+ " " +y_coord;
}
 
public boolean checkEqual(Point2D cord){
    return this.x_coord==cord.x_coord && this.y_coord==cord.y_coord;
    }

public Point2D createNewPoint(double New_x,double New_y){

    return new Point2D(this.x_coord+New_x, this.y_coord+New_y);

}
public double calculateDistance(Point2D p){
    return Math.sqrt(Math.pow(p.x_coord-this.x_coord,2)+Math.pow(p.y_coord-this.y_coord,2));
}

}


