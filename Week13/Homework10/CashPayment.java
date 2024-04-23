package Homework10;

public class CashPayment extends Payment
{
    private double tendered ;

    
    public CashPayment(double amount , double tendered)
    {
        super(amount);
        this.tendered = tendered ;
    }

    public double getTendered() 
    {
        return tendered;
    }

    public double getChange()
    {
        return tendered - super.getAmount() ;
    }

    @Override
    public String toString() 
    {
        return String.format("Amount : %.2f  Tendered : %.2f  Change : %.2f\n",super.getAmount(),getTendered(),getChange());
    }
    
}