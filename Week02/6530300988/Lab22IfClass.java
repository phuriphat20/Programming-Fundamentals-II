import java.util.Scanner;

public class Lab22IfClass {
    public static void main(String[] args) {
        Scanner scan_double = new Scanner(System.in);
        Scanner scan_str = new Scanner(System.in);
        String str;
        char member;
        double price;

        System.out.print("Please input your price : ");
        price = scan_double.nextDouble();
        System.out.print("Are you Member : ");
        str = scan_str.nextLine();
        member = str.charAt(0);

        if (member == 'N') {
            System.out.printf("Your price is %.0f Bath. Thank you. ",price);
        }else{
            System.out.printf("You discount is %.0f",(price*10/100));
            double total_price = price-(price*10/100);
            System.out.printf("\nYour price is %.0f Bath. Thank you.",total_price);
            scan_double.close();
            scan_str.close();
        }
    }
}
