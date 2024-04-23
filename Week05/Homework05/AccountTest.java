package Homework05;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;


public class AccountTest 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in) ;
        BankAccount Bob , Mary ;
        CheckingAccount Jane , Max ;
        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>() ;
        ArrayList<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>() ;
        DecimalFormat fee = new DecimalFormat("0.####") ;


        bankAccounts.add(Bob = new BankAccount("Bob", "55879", 101.5));
        bankAccounts.add(Mary = new BankAccount("Mary", "48573", 100824.5));
        checkingAccounts.add( Jane = new CheckingAccount("Jane", "25837", 1253, 15));
        checkingAccounts.add( Max = new CheckingAccount("Max", "52428", 12.251523, 0.0007));
        
        for(int i =0 ; i < bankAccounts.size() ; i++)
        {
            System.out.printf("#%d BankAccount %d\n",i+1,i+1);
            System.out.println("Name : " + bankAccounts.get(i).getCustomerName());
            System.out.println("ADDR : " + bankAccounts.get(i).getAccountNumber());
            System.out.println("Balance : " + bankAccounts.get(i).getBalance());
            System.out.println();
        }
        System.out.println();

        for(int i =0 ; i < checkingAccounts.size() ; i++)
        {
            System.out.printf("#%d CheckingAccount %d \n",i+3,i+1);
            System.out.println("Name : " + checkingAccounts.get(i).getCustomerName());
            System.out.println("ADDR : " + checkingAccounts.get(i).getAccountNumber());
            System.out.println("Balance : " + checkingAccounts.get(i).getBalance());
            System.out.println("Fee : " + fee.format(checkingAccounts.get(i).getOverdraftFee()));
            System.out.println();
        }
        System.out.print("\n\n");

        for(int i = 0 ; i < 3 ; i++)
        {
            System.out.print("Choose Account :");
            String Acc = scan.nextLine() ;
            System.out.print("Choose Action ( 1. Withdraw 2. Deposit ) : ");
            int Act = scan.nextInt() ;
            System.out.print("Value : ") ;
            double value = scan.nextDouble() ;  
            scan.nextLine();

            for(int j = 0 ; j < 2 ; j++)
            {
                if (Acc.equals(bankAccounts.get(j).accountNumber)) 
                {
                    Acc = bankAccounts.get(j).getCustomerName();

                } 

            }

            
            for(int j = 0 ; j < 2 ; j++)
            {
                if (Acc.equals(checkingAccounts.get(j).accountNumber)) 
                {
                    Acc = checkingAccounts.get(j).getCustomerName();

                }
            }    

            switch (Acc) 
            {
                case "Bob":
                    {
                        if (Act == 1)
                        {
                            bankAccounts.get(0).withdraw(value);

                        } else
                        {
                            bankAccounts.get(0).deposit(value);  

                        }

                        break;

                    }

                case "Mary":
                    {
                        if (Act == 1)
                        {
                            bankAccounts.get(1).withdraw(value);

                        } else
                        {
                            bankAccounts.get(1).deposit(value);  

                        }

                        break;

                    }

                case "Jane":
                    {
                        if (Act == 1)
                        {
                            checkingAccounts.get(0).withdraw(value);

                        } else
                        {
                            checkingAccounts.get(0).deposit(value);  

                        }

                        break;

                    }

                case "Max":
                    {
                        if (Act == 1)
                        {
                            checkingAccounts.get(1).withdraw(value);

                        } else
                        {
                            checkingAccounts.get(1).deposit(value);  

                        }

                        break;

                    }
                        
                default:
                    break;
            }
            
        }
            
    }

}