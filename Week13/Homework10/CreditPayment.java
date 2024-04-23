package Homework10;

public class CreditPayment extends Payment
{
    private String cardNumber ;

    public CreditPayment(double amount , String cardNumber)
    {
        super(amount);
        this.cardNumber = cardNumber ;
    }

    public String getCardNumber() 
    {
        return cardNumber;
    }


    @Override
    public String toString()
     {
        return String.format("Amount : %.2f  Card Number : %s\n",super.getAmount() , getCardNumber());
    }

}