package Homework7;

/*
 * Written by : Phuriphat   Nokkhumthong
 * ID : 6530300988
 */

public class Trapezoid extends Quadrilateral
{
    
    //attribute area
    private double area ;
    
    //constructor Trapezoid
    public Trapezoid(Point topLeft ,Point bottomLeft ,Point topRight , Point bottomRight)
    {
        super(topLeft, bottomLeft, topRight, bottomRight);
    }

    //override method getArea
    @Override
    public double getArea() 
    {
        double height = Math.abs(getEndpoint(2).getY() - getEndpoint(3).getY()) ;
        double topLength = Math.abs(getEndpoint(2).getX() - getEndpoint(0).getX());
        double bottomLength = Math.abs(getEndpoint(3).getX() - getEndpoint(1).getX());
        area = 0.5 * (topLength + bottomLength) * height ; 
        return area;
    }
}