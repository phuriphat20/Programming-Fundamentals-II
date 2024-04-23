import java.util.Scanner;

public class Lab23IfClass {
    public static void main(String[] args) {
        int age,height;

        System.out.print("Please input your Age : ");
        Scanner scan_age = new Scanner(System.in);
        age = scan_age.nextInt();
        System.out.print("Please input your Height : ");
        Scanner scan_height = new Scanner(System.in);
        height = scan_height.nextInt();

        if (age <=10){
            if (height <= 100 ) {
                System.out.println("Your ticket price is 0 Bath.");
            }else{
                System.out.println("Your ticket price is 890 Bath.");
            }
        }
        else{
            System.out.println("Your ticket price is 1190 Bath.");
            scan_age.close();
            scan_height.close();
        }
        }
    }

    
