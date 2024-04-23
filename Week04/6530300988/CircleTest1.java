public class CircleTest1 
{
    public static void main(String[] args)
    {
        Circle1 c1 = new Circle1();
        double radius,area; 

        radius = c1.getRadius(); 
        area = c1.getArea();
        System.out.printf("The circle has Radius of %.2f \n", radius); 
        System.out.printf("The circle has Area of %.2f \n \n", area); 

        Circle1 c2 = new Circle1(); 
        radius = c2.getRadius(); 
        area = c2.getArea(); 

        System.out.printf("The circle has Radius of %.2f \n",radius); 
        System.out.printf("The circle has Area of %.2f \n",area);
    }
}
