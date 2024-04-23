package Homework10;

public abstract class Payment 
{
    private double amount ;

    public Payment (double payment)
    {
        if (payment > 0) 
        {
            this.amount = payment ;  
        } else 
        {
            this.amount = 0.00 ;
        }
    }
    public double getAmount() 
    {
        return amount;
    }
}