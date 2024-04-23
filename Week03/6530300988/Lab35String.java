import java.util.Scanner;

public class Lab35String {
    public static void main(String[] args) {
        int cntDigit = 0 ,cntUpper = 0 , cntLower = 0 , cntOther = 0 ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = scan.nextLine();

        for(int i = 0 ; i < s.length() ; i++ )
        {
            if((s.charAt(i) >= '0')  &&  (s.charAt(i) <= '9'))
            {
                cntDigit++;
            }
            else if((s.charAt(i) >= 'A')  &&  (s.charAt(i) <= 'Z'))
            {
                cntUpper++;
            }
            else if((s.charAt(i) >= 'a')  &&  s.charAt(i) <= 'z')
            {
                cntLower++;
            }
            else
            {
                cntOther++;
            }
        }

        System.out.printf("There are %d digit \n",cntDigit);
        System.out.printf("There are %d Upper letters\n",cntUpper);
        System.out.printf("There are %d Lower letters\n",cntLower);
        System.out.printf("There are %d Other letters\n",cntOther);
        scan.close();
    }
}
