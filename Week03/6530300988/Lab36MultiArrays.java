public class Lab36MultiArrays {
    public static void main(String[] args) {
        int[][] MatrixA = new int[][]{
                {90 , 5 , 12 , -3},
                {-8 , 23 , -7 , 52},
                {0 , 23 , -8 , 1}
        };

        System.out.println("Matrix A is ");
        
        for(int i = 0 ; i < MatrixA.length ; i++ )
        {
             for(int j = 0 ; j < MatrixA[i].length ; j++ )
             {
                    System.out.print(MatrixA[i][j] + "\t");
             }
             System.out.println();
        }
    }
}
