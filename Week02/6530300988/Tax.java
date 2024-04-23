/*
 *  Writhen : Phuriphat Nokkhumthong
 *  ID : 6530300988
 */
import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Enter Salary : ");
        int salary = scan.nextInt();                         /*input salary */

        System.out.print("Enter Year cost :");
        int cost = scan.nextInt();                           /*input Year Cost */

        System.out.print("Enter Tax deduction :");
        int tax_deduction = scan.nextInt();                  /*input Tax Deduction */
        scan.nextLine();                                     /*Flush the new line*/
        
        System.out.print("You have other income?");
        String other_income_Y_N = scan.nextLine();           /*input Other income as string is Yes or No */
        char Y_or_N = other_income_Y_N.charAt(0);      /*convert  Other income as character*/

        int total_income;
           if (Y_or_N == 'Y') {                               /*if Other income = Yes */
                System.out.print("Input other income :");   
                int other_income = scan.nextInt();            /*input Other income as int */
                int income = (salary*12) - cost - tax_deduction + other_income;  /*Calculate income from the formula */
                System.out.printf("Income : (%d*12) - %d - %d + %d = %d\n",salary,cost,tax_deduction,other_income,income);
                total_income = income;
           } else {                                           /*if Other income = No */
                int income = (salary*12) - cost - tax_deduction ;    /*Calculate income from the formula */
                System.out.printf("Income : (%d*12) - %d - %d = %d\n",salary,cost,tax_deduction,income);
                total_income = income;
           }

        int sum,tax,tax1,tax2,tax3,tax4,tax5,tax6,tax_total;   /*Create a variable */
        System.out.printf("Tax is ");
        if (total_income <= 150000) {                         
            System.out.println("0%");
            System.out.print("Your Tax = Free Tax");
        } else
        {if (total_income <= 300000) {
            System.out.println("5%\n");
            sum = total_income - 150000;
            tax = (sum *5)/100;

            System.out.println("Cal Tax " + total_income + " - 150000 = " + sum + "*5% = " + tax);
            System.out.println("Your Tax = " + tax + " BTH");

        } else 
        {if (total_income <= 500000) {
            System.out.println("10%\n");
            sum = total_income - 300000;  /*total income -150000 = total income -150000 */
            tax1 = (150000 *5)/100;
            tax2 = (sum*10)/100;
            tax_total = tax1 + tax2;

            System.out.println("Step 2");
            System.out.println("Cal Tax " + total_income + " - 300000 = " + sum + "*10% = " + tax2);
            System.out.println("Step 1");
            System.out.println("Cal Tax 150000 * 5% = " + tax1);
            System.out.println("Your Tax = " + tax_total+ " BTH");

        } else 
        {if (total_income <= 750000) {
            System.out.println("15%\n");
            sum = total_income - 500000;    /*total income -150000 = total income -150000 total= income -200000*/
            tax = (150000 *5)/100;
            tax1 = (200000 *10)/100;
            tax2 = (sum *15)/100;
            tax_total = tax + tax1 + tax2;

            System.out.println("Step 3");
            System.out.println("Cal Tax " + total_income + " - 500000 = " + sum + "*15% = " + tax2);
            System.out.println("Step 2");
            System.out.println("Cal Tax 200000 * 10% = " + tax1);
            System.out.println("Step 1");
            System.out.println("Cal Tex 150000 * 5 = " + tax);
            System.out.println("Your Tax = " + tax_total+ " BTH");

        } else 
        {if (total_income <= 1000000) {
            System.out.println("20%\n");
            sum = total_income - 750000;     
            /*total income -150000 = total income -150000 =total income -200000 =total income -250000*/
            tax = (150000 *5)/100;           
            tax1 = (200000 *10)/100;
            tax2 = (250000 *15)/100;
            tax3 = (sum *20)/100;
            tax_total = tax + tax1 + tax2 + tax3;

            System.out.println("Step 4");
            System.out.println("Cal Tax " + total_income + " - 750000 = " + sum + "*20% = " + tax3);
            System.out.println("Step 3");
            System.out.println("Cal Tax 250000 * 15% = " + tax2);
            System.out.println("Step 2");
            System.out.println("Cal Tax 200000 * 10% = " + tax1);
            System.out.println("Step 1");
            System.out.println("Cal Tax 150000 * 5% = " + tax);
            System.out.println("Your Tax = " + tax_total+ " BTH");

        } else 
        {if (total_income <= 2000000) {
            System.out.println("25%\n");
            sum = total_income - 1000000;
            /*total income -150000 = total income -150000 =total income -200000 =total income -250000 =total income -250000*/
            tax = (150000 *5)/100;
            tax1 = (200000 *10)/100;
            tax2 = (250000 *15)/100;
            tax3 = (250000 *20)/100;
            tax4 = (sum *25)/100;
            tax_total = tax + tax1 + tax2 + tax3 + tax4;

            System.out.println("Step 5");
            System.out.println("Cal Tax " + total_income + " - 1000000 = " + sum + "*25% = " + tax4);
            System.out.println("Step 4");
            System.out.println("Cal Tax 250000 * 20% = " + tax3);
            System.out.println("Step 3");
            System.out.println("Cal Tax 250000 * 15% = " + tax2);
            System.out.println("Step 2");
            System.out.println("Cal Tax 2000000 * 10% = " + tax1);
            System.out.println("Step 1");
            System.out.println("Cal Tax 150000 * 5% = " + tax);
            System.out.println("Your Tax = " + tax_total+ " BTH");

        } else 
        {if (total_income <= 5000000) {
            System.out.println("30%\n");
            sum = total_income - 2000000;
            /*total income -150000 = total income -150000 =total income -200000 =total income -250000 =total income -250000
             * =total income -1000000
            */
            tax = (150000 *5)/100;
            tax1 = (200000 *10)/100;
            tax2 = (250000 *15)/100;
            tax3 = (250000 *20)/100;
            tax4 = (1000000 *25)/100;
            tax5 = (sum *30)/100;
            tax_total = + tax + tax1 +tax2 +tax3 +tax4 +tax5;

            System.out.println("Step 6");
            System.out.println("Cal Tax " + total_income + " - 2000000 = " + sum + "*30% = " + tax5);
            System.out.println("Step 5");
            System.out.println("Cal Tax 1000000 * 25% = " + tax4);
            System.out.println("Step 4");
            System.out.println("Cal Tax 250000 * 20% = " + tax3);
            System.out.println("Step 3");
            System.out.println("Cal Tax 250000 * 15% = " + tax2);
            System.out.println("Step 2");
            System.out.println("Cal Tax 2000000 * 10% = " + tax1);
            System.out.println("Step 1");
            System.out.println("Cal Tax 150000 * 5% = " + tax);
            System.out.println("Your Tax = " + tax_total+ " BTH");

        } else 
        {if (total_income <= 9999999) {
            System.out.println("35%\n");
            sum = total_income - 5000000;
            /*total income -150000 = total income -150000 =total income -200000 =total income -250000 =total income -250000
             * =total income -1000000 =total income -3000000
            */
            tax = (150000 *5)/100;
            tax1 = (200000 *10)/100;
            tax2 = (250000 *15)/100;
            tax3 = (250000 *20)/100;
            tax4 = (1000000 *25)/100;
            tax5 = (3000000 *30)/100;
            tax6 = (sum *35)/100;
            tax_total = + tax + tax1 +tax2 +tax3 +tax4 +tax5 +tax6;

            System.out.println("Step 7");
            System.out.println("Cal Tax " + total_income + " - 5000000 = " + sum + "*35% = " + tax6);
            System.out.println("Step 6");
            System.out.println("Cal Tax 3000000 * 30% = " + tax5);
            System.out.println("Step 5");
            System.out.println("Cal Tax 1000000 * 25% = " + tax4);
            System.out.println("Step 4");
            System.out.println("Cal Tax 250000 * 20% = " + tax3);
            System.out.println("Step 3");
            System.out.println("Cal Tax 250000 * 15% = " + tax2);
            System.out.println("Step 2");
            System.out.println("Cal Tax 2000000 * 10% = " + tax1);
            System.out.println("Step 1");
            System.out.println("Cal Tax 150000 * 5% = " + tax);
            System.out.println("Your Tax = " + tax_total+ " BTH");

         }    
        }   
       }    
      }    
     }    
    }      
   }
  }
        
  scan.close();
 }

}