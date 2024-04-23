package Homework7;

/*
 * Written by : Phuriphat   Nokkhumthong
 * ID : 6530300988
 */

public class QuadrilateralTest 
{
    public static void main(String[] args) 
    {
        //Find area of Trapezoid
        Trapezoid trapezoid = new Trapezoid(new Point(2, 4), new Point(0, 0) , new Point(6, 4) , new Point(8, 0));
        System.out.println("Area of Trapezoid is : " + trapezoid.getArea());  

        //Find area of Parallelogram
        Parallelogram parallelogram = new Parallelogram(new Point(2, 2) , new Point(0, 0) ,new Point(8, 4) , new Point(6,0));
        System.out.println("Area of parallelogram is :  " + parallelogram.getArea()); 

        //Find area of Rectangle 
        Rectangle rectangle = new Rectangle(new Point(0, 4) , new Point(0, 0) , new Point(6, 4) , new Point(6, 0));
        System.out.println("Area of Rectangle is :  " + rectangle.getArea());

        //Find area of Square
        Square square = new Square(new Point(0, 4), new Point(0, 0), new Point(4, 4), new Point(4, 0));
        System.out.println("Area of Square is :  " + square.getArea());   
            
    }    

}