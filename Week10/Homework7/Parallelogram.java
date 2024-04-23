package Homework7;

/*
 * Written by : Phuriphat   Nokkhumthong
 * ID : 6530300988
 */

public class Parallelogram extends Quadrilateral
{
    //attribute area
    private double area ;
    
    //constructor Parallelogram
    public Parallelogram(Point topLeft ,Point bottomLeft ,Point topRight , Point bottomRight)
    {
        super(topLeft, bottomLeft, topRight, bottomRight);
    }

    //override method getArea
    @Override
    public double getArea() {
        double height = Math.abs(getEndpoint(2).getY() - getEndpoint(3).getY());
        double base = Math.abs(getEndpoint(3).getX() - getEndpoint(1).getX());
        area = base * height ;
        return area;
    }
}