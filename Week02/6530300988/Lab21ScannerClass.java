import java.util.Scanner;

public class Lab21ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter ID : ");
        String id =  sc.nextLine();
        System.out.print("Enter Birthday(dd/mm/yyyy) : ");
        String brinthday = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.print("Enter GPA : ");
        Float gpa = sc.nextFloat();

        System.out.println("\nMy Name is  " + name);
        System.out.println("Birthday : " + brinthday +"\tAge : " + age);
        System.out.println("ID : " + id + "\t\t\tGPA :  " + gpa);

        sc.close();
    }
}
