/*
 * writen by Phuriphat Nokkhumthong
 * ID: 6530300988
 */
import java.util.*;

public class AddRandom {
    public static void main(String[] args) {
        Random random = new Random();
        double a = random.nextDouble(0.0,50.0);
        double b = random.nextDouble(0.0,50.0);
        
        double c = a +b ;
        System.out.println("Sum of"+ a + " + " + b + "=" + c );
        
        if(c >= 50){
            System.out.println("Value = PASS ");
        }else {
            System.out.println("Value = Not PASS");
        }
    }
}