package Lab10_6530300988;

public class Lab103Throw 
{ 
    public static void main(String[] args) throws Exception 
    { 
        
            int ans = MathDevider3.devider(10, 0); 
            System.out.println(ans);
      
    } 
} 

class MathDevider3 
{ 
    public static int devider(int num1, int num2) throws Exception 
    {
        int result = 0;
        try
        { 
            result = (int)(num1/checkZero(num2)); 
        }
        catch(Exception a)
        {
            System.out.println(a);
        }
        return result; 
    } 

    public static int checkZero(int num2) throws Exception 
    { 
        if(num2 == 0) 
        {
            throw new Exception("Zero Zero");
        } else
        { 
            return num2;
        } 
    } 
}