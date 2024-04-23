package Lab06_6530300988;

public class Circle1 extends GeometricObject
{
    private double radius ;

    Circle1()
    {
        this(0.0);
    }
    public Circle1(double radius)
    {
        this.radius = radius ;
    }

    public double getRadius() 
    {
        return radius;
    }

    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius ;
    }

    public String toString() 
    {
        return "Color : " + super.getColor() + " , isFilled : " + super.isFilled() + " , radius : " + radius ;
    }

    public double getDiameter() 
    { 
        return 2*Math.PI*radius; 
    }
    
}