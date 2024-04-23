package MultipleInheritance;

public class MyDog extends Dog implements CanBark,CanFetch,CanSwim 
{
   public MyDog(String name)
   {
       super(name);
   } 
   
   @Override
   public void swim() 
   {
       System.out.printf("%s is swimming.\n", super.getName());   
   }

   @Override
   public void fetch() 
   {
       System.out.printf("%s is fetching.\n", super.getName());    
   }
}