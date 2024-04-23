public class CircleTest 
{
   public static void main(String[] args) 
   {
        Circle C1 = new Circle();
        Circle C2 = new Circle();

        C1.setRadius(72.0);
        C1.setColor("Green");
        System.out.println(C1.toString());
        System.out.printf("The circle has Area of %.2f \n \n", C1.getArea()); 

        C2.setRadius(2.0);
        C2.setColor("Blue");
        System.out.println(C2.toString());
        System.out.printf("The circle has Area of %.2f \n \n", C2.getArea());

   }
}
