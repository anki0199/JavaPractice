package com.app.core;
public class Point2D {
    private double x_coord,y_coord;
    //3.1 Create a parameterized constructor to accept x & y co-ords.
    public Point2D(double x,double y){
        x_coord=x;
        y_coord=y;
    }

//3.2 Add a method to return string form of  point's x & y co-ords
//Hint :  public String getDetails())
public String getDetails(){
    return "x and y co-ordinates are " +x_coord+ " " +y_coord;
}
//3.3 Add isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise. 
public boolean checkEqual(Point2D cord){
    return this.x_coord==cord.x_coord && this.y_coord==cord.y_coord;//this keyword is optional here
    }
//3.4 Add a method to Point2D class -- to create and return new point having given x & y offset.
//eg : Point2D p1=new Point2D(10,20);
//Point2d p3=p1.createNewPoint(5,-2);
//If user supplies offset of (5, -2) : your method should return a new
//point object placed at (15,18)
Point2D createNewPoint(double New_x,double New_y){
    //return "new x and y co-ordinates are " +New_x+ " " +New_y;
    //Point2D newpoint=new Point2D(this.x_coord+New_x, this.y_coord+New_y);
    //return newpoint;
    return new Point2D(this.x_coord+New_x, this.y_coord+New_y);

}
public double calculateDistance(Point2D p){
    return Math.sqrt(Math.pow(p.x_coord-this.x_coord,2)+Math.pow(p.y_coord-this.y_coord,2));
}
//3.5 Add calculateDistance method to calculate distance between current point & specified point & return the distance to the caller.
//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
}


