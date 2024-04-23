package Homework7;

/*
 * Written by : Phuriphat   Nokkhumthong
 * ID : 6530300988
 */

public class Square extends Quadrilateral
{
    //attribute area
    private double area ;
    
    //constructor Square
    public Square(Point topLeft ,Point bottomLeft ,Point topRight , Point bottomRight)
    {
        super(topLeft, bottomLeft, topRight, bottomRight);
    }

    //override method getArea
    @Override
    public double getArea() {
        double side = Math.abs(getEndpoint(0).getY() - getEndpoint(1).getY());
        area = Math.pow(side, 2 );
        return area;
    }   
}