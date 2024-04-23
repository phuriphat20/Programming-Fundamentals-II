package Lab06_6530300988;

public class ComparableCircle extends Circle implements Comparable
{
    public ComparableCircle(double radius)
    {
        super(radius);
    }

    public int compareTo(Object o)
    {
        if(getArea() > ((ComparableCircle)o).getArea())
        {
            return 1;
        }else  if(getArea() < ((ComparableCircle)o).getArea())
               {
                  return -1;
               }else
               {
                 return 0 ;
               }
    }
}