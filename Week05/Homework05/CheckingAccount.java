package Homework05;

public class CheckingAccount extends BankAccount
{
    double overdraftFee ; 

    public CheckingAccount (String customerName , String accountNumber , double balance , double overdraftFee )
    {
        super(customerName, accountNumber, balance);
        this.overdraftFee = overdraftFee ;
    }

    public double getOverdraftFee() 
    {
        return overdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) 
    {
        this.overdraftFee = overdraftFee;
    }

    public void withdraw(double amount)
    {
        if ((amount + getOverdraftFee()) < getBalance()) 
        {
            balance -= (amount + getOverdraftFee()) ;
            System.out.println("Withdraw Complete!!");
            System.out.println(getAccountNumber() +  " "  + getCustomerName() + " " + "Withdraw" + " " + amount + " " + "Fee" + formatFee.format(overdraftFee) + " " + "Balance" +  " " + getBalance() + "\n ########### \n"); 
        } else 
        {  
            System.out.println("Withdraw fail!! >>>>> can't Withdraw more than the available amount \n ########## \n"); 
        }
    }
}