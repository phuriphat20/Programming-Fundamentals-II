/*
 * writen by Phuriphat Nokkhumthong
 * ID: 6530300988
 */
import java.util.Scanner;
public class Lab6Bmi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input1 Mass (Kg): ");
        double Mass = sc.nextFloat();
       
        System.out.print("Input2 Height (Cm): ");
        double Height = sc.nextFloat();
        double h = Height/100;

        double bmi = Mass/(h*h);
        System.out.printf("Output BMI : %.6f ", bmi );
        sc.close();
    }
}