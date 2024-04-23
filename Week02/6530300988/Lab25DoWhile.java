import java.util.Scanner;

public class Lab25DoWhile {
    public static void main(String[] args) {
        int i , n ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        n = scan.nextInt();
        i = n;
        do {
            System.out.println(i);
            i--;
        } while (i>=1); 
        scan.close(); 
    }  
}