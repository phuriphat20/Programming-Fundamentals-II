import java.util.Scanner;
public class Lab24While {
    public static void main(String[] args) {
        int i , n ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        n = scan.nextInt();
        i = n;
       /*  while (i >= 1) {
           System.out.println(i);
           i--;
           scan.close();
        }*/

        while (i > 1) {
            if (i%2 == 0) {
                System.out.println(i);
            }
            i--;
        }scan.close();    } 
}