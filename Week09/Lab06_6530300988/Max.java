package Lab06_6530300988;

public class Max 
{
    public static Comparable max (Comparable o1,Comparable o2)
    {
        if(o1.compareTo(o2) > 0)
        {
            return o1;
        }else
        {
            return o2;
        }
    }
}
