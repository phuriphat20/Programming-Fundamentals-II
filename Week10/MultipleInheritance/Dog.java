package MultipleInheritance;

public class Dog 
{
    private String name ;
    public Dog()
    {
        this.name =null ;
    }

    public Dog(String name)
    {
        this.name = name ;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void bark()
    {
        System.out.println("Woof   Woof");
    }
}