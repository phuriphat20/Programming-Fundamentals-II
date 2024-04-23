package Homework10;

public class PlanPayment extends Payment
{
    private Payment[] payments ;
    
    public PlanPayment(double amount , int numberOfInstallments)
    {
        super(amount);
        this.payments = new Payment[numberOfInstallments];
    }

    public void setInstallment(int installment , Payment payment)
    {
        try 
        {
           if (payment.getClass().isAssignableFrom(PlanPayment.class)) 
           {
                new Exception("can't be SetInstallment as PlanPayment");
           } else 
           {
                this.payments[installment] = payment ;
           }
        } catch (Exception e) 
        {
           System.out.println(e.toString()); 
        }
    }

    public Payment getInstallment(int installment)
    {
        return payments[installment];
    }
    @Override
    public String toString() 
    {
        String print = (String.format("Amount : %.2f  Installment : %d \n",super.getAmount(),payments.length));
        try
        {
            for (int i = 0 ; i < payments.length ; i++)
            {
                print += "Installment " + i + ":" + payments[i].toString();
            }
        }catch(Exception exception)
        {
            return print ;
        } 
        return print ;    
    }
}