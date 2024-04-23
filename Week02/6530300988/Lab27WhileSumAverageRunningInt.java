import java.util.Scanner;

public class Lab27WhileSumAverageRunningInt {
   public static void main(String[] args) {
    int Lower,Upper,sum = 0;
    double count = 0;
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter The lower bound value :");
    Lower = scan.nextInt();
    System.out.print("Enter The upper bound value :");
    Upper = scan.nextInt();

    int i = Lower;
    while (i <= Upper ) {
        sum += i;
        i++;
        count++;
    }
    System.out.printf("The sum of %d to %d is %d ",Lower,Upper,sum);
    System.out.printf("\nThe average is %.1f ",(sum/count));
    scan.close();
   }
    
}