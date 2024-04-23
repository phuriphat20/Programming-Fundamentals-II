package Homework06 ;

/*
 * Written  By Phuriphat  Nokkhumthong
 * ID : 6530300988
 */

public class Customer 
{
    
    //Attribute
    private String id ;
    private String firstName ;
    private String lastName ;

    //Constructor
    public Customer(String id , String firstName , String lastName)
    {
        this.id = id ;
        this.firstName = firstName ;
        this.lastName = lastName ;
    }

    //Method
    public String getId()
    {
        return id ;
    }

    public String getFirstName()
    {
        return firstName ;
    }

    public String getLastName()
    {
        return lastName ;
    }

}