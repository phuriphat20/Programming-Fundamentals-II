public class Lab32Arrays {
    public static void main(String[] args) {
        float[] score = new float[] {80.2f , 67.5f , 70.0f , 68.5f , 82.7f , 55.5f , 78.8f};
        float sum = 0.0f ;
        int i ;
        
        for(i = 0 ; i < score.length ; i++)
        {
            sum += score[i] ;
            System.out.printf("score[%d] = %.2f : sum = %.2f\n",i,score[i],sum);
        }
        System.out.printf("\nAverage : %.2f",sum/score.length);





        /*int i ;
        int[] data = new int[] {30 , 20 , 15 , 0 , 9};

        for(i =0 ; i < data.length ; i++)
        {
            System.out.println(data[i]);
        }
        System.out.println("Your Data : ");

        for(i =0 ; i < data.length ; i++)
        {
            System.out.printf("data[%d] = %d \n",i,data[i]);
        } */
    }
}
