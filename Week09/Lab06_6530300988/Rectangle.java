package Lab06_6530300988;

public class Rectangle 
{
    private double width;
    private double hight;

    public Rectangle(double width , double hight)
    {
        this.width = width;
        this.hight = hight;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getHight() 
    {
        return hight;
    }

    public void setHight(double hight) 
    {
        this.hight = hight;
    }

    public double getArea()
    {
        return width*hight;
    }
}
