package Lab06_6530300988;

public class Lab64MaxTest 
{
    public static void main(String []  args)
    {
        ComparableRectangle rec1 = new ComparableRectangle(4, 5);
        ComparableRectangle rec2 = new ComparableRectangle(3, 6);
        Rectangle r = (Rectangle)Max.max(rec1, rec2);
        
        System.out.println(r.getArea());

        ComparableCircle cir1 = new ComparableCircle(4);
        ComparableCircle cir2 = new ComparableCircle(5);
        Circle c = (Circle)Max.max(cir1, cir2);

        System.out.println(c.getArea());

    }
}
