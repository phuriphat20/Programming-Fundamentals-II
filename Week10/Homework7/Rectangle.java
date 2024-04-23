package Homework7;

/*
 * Written by : Phuriphat   Nokkhumthong
 * ID : 6530300988
 */

public class Rectangle extends Quadrilateral
{
    //attribute area
    private double area ;

    //constructor Rectangle
    public Rectangle(Point topLeft ,Point bottomLeft ,Point topRight , Point bottomRight)
    {
        super(topLeft, bottomLeft, topRight, bottomRight);
    }

    //override method getArea
    @Override
    public double getArea() {
        double height = Math.abs(getEndpoint(0).getY() - getEndpoint(1).getY());
        double wide = Math.abs(getEndpoint(3).getX() - getEndpoint(1).getX());
        area = wide * height ;
        return area;
    }
}