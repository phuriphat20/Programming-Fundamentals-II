package Lab06_6530300988;

public class Lab62GeometricTest 
{
    public static void main(String[] args)
    {
        double area = 0.0; 
        GeometricObject objs[] ={new Circle1(5) , new Rectangle1(2, 4)} ;

        for(GeometricObject obj : objs)
        {
            if (obj instanceof Circle1) 
            {
                Circle1 c = (Circle1)obj ;

                double diameter = c.getDiameter();

                System.out.println("Diameter of circle = "+diameter);
            }
        }
    }
}