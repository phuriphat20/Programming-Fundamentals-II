import java.util.Scanner;

public class Lab49MatrixReturn 
{
    static Scanner scan = new Scanner( System.in);

    public static int[][] readMatrix(int numRow , int numCols)
    {
        int [][] matrix = new int[numRow][numCols];
        for(int i = 0 ; i < matrix.length ; i++ )
        {
            for( int j = 0 ; j < matrix[i].length ; j++)
            {
                System.out.printf("Enter element [%d,%d] : ", i+1 , j+1);
                matrix[i][j] = scan.nextInt();
            } 
        }
        return matrix;
    }

    public static void showMatrix(int[][] matrix,int numRow , int numCols)
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

    public static void main(String[] args) 
    {
       int numRow , numCols ; 
       int [][] A;

       System.out.print("How many rows : ");
       numRow = scan.nextInt();

       System.out.print("How many columns : ");
       numCols = scan.nextInt();


       A = readMatrix(numRow, numCols);

       System.out.println("Matrix A is ");
       showMatrix(A, numRow, numCols);
    }
}
