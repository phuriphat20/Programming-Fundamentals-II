package Homework7;

/*
 * Written by : Phuriphat   Nokkhumthong
 * ID : 6530300988
 */

public abstract class Quadrilateral 
{
     //Attribute
    private Point[] endpoint;
    
    //constructor
    public  Quadrilateral(Point p0 , Point p1 , Point p2 , Point p3)
    {
        this.endpoint = new Point[]{p0,p1,p2,p3};
    }

    //Method
    public double getArea()
    {
        return 0.0;
    }
    
    public Point getEndpoint(int index) 
    {
        return endpoint[index];
    }

}