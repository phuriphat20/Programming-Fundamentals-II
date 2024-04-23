package Lab07_6530300988 ;

public class MyInterfaceTest 
{
    public static void main(String[] args) 
    {
        Lab71 L1 = new Lab71();
        L1.m1();

        Lab72 L2 = new Lab72();
        L2.m1();

        Lab74 L4 = new Lab74() {};
        L4.m1();
        L4.m2();

        Lab75 L5 = new Lab75(){
           public void m1() 
            {
                super.m2();
            }
        };
        L5.m2();

        Lab76 L6 = new Lab76() {
            
        };
        L6.m1();
    }
}