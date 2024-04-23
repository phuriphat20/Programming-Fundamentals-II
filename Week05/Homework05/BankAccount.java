package Homework05;

import java.text.DecimalFormat;

public class BankAccount 
{
    public String customerName ;
    public String accountNumber ;
    public double balance ;
    DecimalFormat formatFee = new DecimalFormat("0.####");

    BankAccount(String customerName , String accountNumber , double balance) 
    {
        this.customerName = customerName ;
        this.accountNumber = accountNumber ;
        this.balance = balance ;
    }

    public String getCustomerName() 
    {
        return customerName ;
    }

    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName ;
    }

    public String getAccountNumber() 
    {
        return accountNumber ;
    }

    public void setAccountNumber(String accountNumber) 
    {
        this.accountNumber = accountNumber ;
    }

    public double getBalance() 
    {
        return balance ;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance ;
    }

    public void withdraw(double amount)
    {
        if (amount < balance)
        {
            balance -= amount ;
            System.out.println("Withdraw Complete!!");
            System.out.println(getAccountNumber() +  " " + getCustomerName() +  " " + "Withdraw" + " " + amount +  " " + "Balance" +  " " + getBalance() + "\n ########### \n");  
        } else 

        {
            System.out.println("Withdraw fail!! >>>>> can't Withdraw more than the available amount \n ########## \n");    
        }
        
    }

    public void deposit(double amount)
    {
        
        if (amount > 0) 
        {
            balance += amount ;
            System.out.println("Deposit Compete!!");
            System.out.println(getAccountNumber() +  " " + getCustomerName() +  " " + "Deposit" + " " + amount +  " " + "Balance" +  " " + getBalance()+ "\n ########## \n");     
        } else

        {
            System.out.println("Deposit Fail!! >>>>> can't Deposit negative amount \n ########## \n ");       
        }

    }

}