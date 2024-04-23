public class Lab45MethodArrays2 {
 
    public static void showMatrix(int matrix[][])
    {
        for( int i = 0 ; i < matrix.length ; i++ )
        {
            for(int j = 0 ; j < matrix[i].length ; j++)
            {
            System.out.printf("%5d",matrix[i][j]);
            }
            System.out.println("");  
        } 
    }

    public static void showAddMatrix( int [][]A , int [][] B)
    {
        for( int i = 0 ; i < A.length ; i++ )
        {
            for(int j = 0 ; j < A[i].length ; j++)
            {
                int sum = A[i][j] + B[i][j];
                System.out.printf("%5d",sum);
            }
        System.out.println();            
        }

    }

    public static void main (String[] args)
    {
        int [][] A = {
                       {-3 , 5 , 6},
                       { 5 , 0 , -2}
        };

        int [][] B = {
            {9 , 0 , -5},
            { -3 , -2 , -1}
        };

        System.out.println("Matrix A : ");
        showMatrix(A);

        System.out.println("Matrix B : ");
        showMatrix(B);

        System.out.println("Matrix A+B : ");
        showAddMatrix(A,B);
    }
}
