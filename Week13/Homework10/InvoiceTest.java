package Homework10;

import java.util.Random;

/*
 * Written  By Phuriphat  Nokkhumthong
 * ID : 6530300988
 */

public class InvoiceTest 
{
public static void main(String[] args) 
{
    /*  Customer List */
    Customer[] customers = 
    {
        new Customer("C6530300988", "Phuriphat", "Nokkhumtong"),
        new Customer("C6530300987", "Yamada", "Shintaro"),
        new Customer("C6530300986", "John", "smith"),
        new Customer("C6530300985", "Sincaer", "WhereRU")
    };  

    /* Create Product */
    Product[] products = 
    {
        new Product("P323494", "Chocolate Bar", 20),
        new Product("P323495", "Cookie", 35),
        new Product("P323496", "Brownie", 50),
        new Product("P323497", "Ice Cream", 25),
        new Product("P323498", "Pancake", 65),
        new Product("P313594", "Milk Tea", 55),
        new Product("P313595", "Blue Hawaii", 30),
        new Product("P313596", "Latte Coffee", 50),
        new Product("P313597", "Green Tea", 45),
        new Product("P313598", "Lemonade", 30)
    };

    /*  Create Invoices */
    Invoice[] invoices = 
    {
        new Invoice("549675", customers[0]),
        new Invoice("549676", customers[1]),
        new Invoice("549678", customers[2]),
        new Invoice("549679", customers[3])
    };

    
    /* Processes that Buy random product */
    Random rand = new Random(); /*Declare Class random */
    for(int i = 0 ; i < invoices.length ; i++)/*Loop changes invoices */
    {
        int noItem = rand.nextInt(3,6); /*Random product 3-5 list */
        for(int j = 0 ; j < noItem ; j++) /* Loop add item in invoices */
        {
            invoices[i].addItem(products[rand.nextInt(products.length)], rand.nextInt(1,3)); /*Random product and quantity */
        }
    }

    invoices[0].setPayment(null);
    invoices[1].setPayment(new CashPayment(invoices[1].getTotalPrice(),1000));
    invoices[2].setPayment(new CreditPayment(invoices[2].getTotalPrice(),"1234567887654321"));
    invoices[3].setPayment(new PlanPayment(invoices[3].getTotalPrice(), 10));
    ((PlanPayment) invoices[3].getPayment()).setInstallment(0 , new CashPayment(invoices[3].getTotalPrice()/10, invoices[3].getTotalPrice()/10));
    ((PlanPayment) invoices[3].getPayment()).setInstallment(1 , new CreditPayment(invoices[3].getTotalPrice()/10, "1234567887654321"));
    ((PlanPayment) invoices[3].getPayment()).setInstallment(2 , new CashPayment(invoices[3].getTotalPrice()/10, invoices[3].getTotalPrice()/10));

    /* Print process */
    for(int i = 0 ; i < invoices.length ; i++)
    {
        invoices[i].print();
    }

 }

}