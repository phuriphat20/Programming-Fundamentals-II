package Lab06_6530300988;

public class Lab61GeometricTest { public static void main(String[] args) 
{ 
    double area = 0.0; 
    GeometricObject objs[] ={new Circle1(5) , new Rectangle1(2, 4)} ;

    for( GeometricObject obj : objs)
    { 
         area += obj.getArea(); 
    } 
    System.out.println("Total area = "+area); 

 } 

}