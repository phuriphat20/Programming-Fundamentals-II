package Lab05_6530300988;

public class Rectangle extends GeometricObject
{
    private double width ;
    private double height ;
    
    public Rectangle()
    {
        this(0.0, 0.0);
    }
    public Rectangle(double width , double height)
    {
        this.width = width ;
        this.height = height ;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    public double getArea()
    {
        return width*height ;
    }

    public String toString() 
    {
       return "Color : " + super.getColor() + " , isFilled : " + super.isFilled() + " , width : " +width + " , height" + height ;
    }
}