public class Circle1 
{
    // private instance variable, not accessible from outside this class
    private double radius; 
    private String color; 

    // The default constructor with no argument. 
    public Circle1() 
    { 
        radius = 1.0; 
        color = "red"; 
    } 

    // 2nd constructor with given radius, but color default 
    public Circle1(double r) 
    { 
        radius = r; 
        color = "red"; 
    } 

    // A public method for retrieving the radius 
    public double getRadius() 
    { 
        return radius; 
    } 
    
    // A public method for computing the area of circle 
    public double getArea() 
    { 
        return radius*radius*Math.PI; 
    } 
}
