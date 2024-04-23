public class Lab31Arrays {
   public static void main(String[] args) {
      int[] score = new int[] {0 , 10 , 20 , 30 , 40 };
      int i, sum = 0 ;

      for(i = 0 ; i < 5 ; i++)
      {
          sum += score[i];
          System.out.printf("score[%d] = %d : sum = %d\n",i,score[i],sum);
      }
      System.out.println("Final sum : " + sum);

   } 
}
