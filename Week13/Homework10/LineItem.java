package Homework10;

/*
 * Written  By Phuriphat  Nokkhumthong
 * ID : 6530300988
 */

public class LineItem 
{
   //Attribute
   private Product item ;
   private int quantity ;

   //Constructor
   public LineItem(Product product , int quantity)
   {
        this.item = product ;
        if (quantity > 0) 
        {
            this.quantity = quantity ;  
        } else 
        {
            this.quantity = 0 ;
        }
   }

   //Method
   public Product geProduct()
   {
       return item ;
   }

   public int getQuantity()
   {
       return quantity ;
   }

   public double getTotalPrice()
   {
       double totalPrice = 0 ;
       totalPrice += (item.getPrice() * quantity);
       return totalPrice;
   }
   
}