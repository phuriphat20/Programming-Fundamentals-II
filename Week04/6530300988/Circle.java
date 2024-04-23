public class Circle { 

    // private instance variable, not accessible from outside this class
    private double radius; 
    private String color; 

    // The default constructor with no argument. 
    public Circle() 
    { 
           this(1.0,"red"); 
    } 

    // 2nd constructor with given radius, but color default 
    public Circle(double radius) 
    { 
           this(radius,"red"); 
    } 

    // 3nd constructor with given radius s, and color 
    public Circle(double radius, String color) 
    { 
           this.radius = radius; 
           this.color = color; 
    } 

    // A public method for retrieving the radius 
    public double getRadius() 
    { 
           return this.radius; 
    } 
    public void setRadius(double radius) 
    { 
           this.radius = radius; 
    } 
    // A public method for retrieving the radius 
    public String getColor() 
    { 
           return this.color; 
    } 
    public void setColor(String color) 
    { 
           this.color = color; 
    } 

    // Return a description of this instance Circle[radiu s=r,color=c] 
    public String toString() 
    { 
           return "Circle[radius=" + this.radius + " color=" + this.color + "]"; 
    } 

    // A public method for computing the area of circle 
    public double getArea() 
    { 
           return this.radius * this.radius * Math.PI; 
    } 
}