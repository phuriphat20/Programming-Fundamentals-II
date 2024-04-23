import java.util.Scanner;

public class Lab03ForLoop {
    public static void main(String[] args) {
        
        int i, N;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter N : ");
        N = scan.nextInt();

        /*for(i = 0 ; i >= N ; i--)
        {
            System.out.println(i);
        }*/

        for(i = 0 ; i <= N ; i+=7)
        {
            if(N % 7 ==0) { System.out.println(i);}
        }
        scan.close();
    }
}
