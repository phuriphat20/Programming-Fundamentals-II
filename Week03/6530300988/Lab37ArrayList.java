import java.util.ArrayList;

public class Lab37ArrayList {
    public static void main(String[] args) {
        ArrayList<String>  arrayList  =  new ArrayList<String>();

        arrayList.add("Paul");
        arrayList.add("Pete");
        arrayList.add("John");
        arrayList.add("George");

        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println("At index 1 : Ringo");
        arrayList.add(1,"Ringo");
        System.out.println(arrayList);

        System.out.println("Edit name John -> Johny");
        arrayList.set(2,"Johny");
        System.out.println("\nSize of the band : " + arrayList.size());

        for (String arr : arrayList) 
        { 		      
            System.out.println(arr); 	
        }
        
 }

}