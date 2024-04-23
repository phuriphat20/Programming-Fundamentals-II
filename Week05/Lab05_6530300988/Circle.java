package Lab05_6530300988;

public class Circle extends GeometricObject
{
    private double radius ;

    Circle()
    {
        this(0.0);
    }
    public Circle(double radius)
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
}