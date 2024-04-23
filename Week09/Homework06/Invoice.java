package Homework06;
import java.util.ArrayList;

/*
 * Written  By Phuriphat  Nokkhumthong
 * ID : 6530300988
 */

public class Invoice 
{
    //Attributes of Invoice
    private String id;
    private Customer customer;
    private ArrayList<LineItem> item = new ArrayList<>() ;
    
    //Constructor method
    public Invoice (String id , Customer customer)
    {
        this.id = id ;
        this.customer = customer ;
    }

    //Method 
    public void addItem(Product product , int quantity)
    {
        item.add(new LineItem(product , quantity));
    }

    public String getId() 
    {
        return id;
    }

    public Customer getCustomer() 
    {
        return customer;
    }

    public LineItem getLineItem(int i) 
    {
        return item.get(i);
    }

    public double getTotalPrice()
    {
        double TotalPrice = 0 ;
        for(int i = 0 ; i < item.size() ; i++ )
        {
            TotalPrice = TotalPrice + item.get(i).getTotalPrice();
        }
        return TotalPrice ;
    }

    public void print()
    {

        System.out.printf("INVOICE : # %s\n",getId());
        System.out.printf("CUSTOMER : %s   %s\n",getCustomer().getFirstName(),getCustomer().getLastName());
        System.out.printf("ITEM : \n");
        
        for(int i = 0 ; i < item.size() ; i++)
        {
            System.out.printf("%d. %s   x   %d= %f\n",i+1,item.get(i).geProduct().getName(),item.get(i).getQuantity(),item.get(i).getTotalPrice());
        }

        System.out.printf("\nTOTAL : %.2f\n#####################\n\n",getTotalPrice());
        
    }

}