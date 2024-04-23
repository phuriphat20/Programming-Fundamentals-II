public class Lab43MethodV3 
{
    public static void DrawSqure (char C , int Length  )
    {
        for( int i = 0 ; i < Length ; i++)
        {
            for( int j = 0 ; j < Length ; j++)
            {
                System.out.printf("%s\t",C);
            }
            System.out.println();
        }
    }

    public static void main(String [] args) 
    {
        DrawSqure('*', 5);
    }
}
