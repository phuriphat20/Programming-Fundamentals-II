/*
 * writen : Phuriphat Nokkhumthongb
 * ID     : 6530300988
 */
import java.util.Scanner;

public class GraderTest 
{
    public static void main(String[] args) 
    {
        // ประกาศตัวแปร
        int num ;
        double score ;
        String name ;
        Scanner scan = new Scanner(System.in);

        //รับค่าจาก User
        System.out.print("Enter course name : ");
        name = scan.nextLine();
        Grader grade = new Grader(name);

        //input จำนวนนักเรียน
        System.out.print("Enter number of students : ");
        num = scan.nextInt();
        
        //input คะแนนตามจำนวนนักเรียน
        System.out.print("Input scores : \n");
        for(int i = 0 ; i < num ; i++)
        {
            score = scan.nextDouble();
            grade.addScores(score);
        }

        //แสดง Mean
        System.out.printf("Mean for %s = %.2f \n",grade.countStudents() , grade.mean());
        //แสดงจำนวนคนที่ได้คะแนนต่ำกว่า Mean
        System.out.printf("Below Mean = %d\n",grade.belowMean());
        //แสดงจำนวนคนที่ได้คะแนนสูงกว่ากว่า Mean
        System.out.printf("Above Mean = %d\n",grade.aboveMean());
        //แสดงแสดงจำนวนคนในแต่ละ grade 
        grade.showGrade();
        System.out.println("");

        for(int j = 0 ; j < 20 ; j++)
        {
            System.out.print("#");
        }

        System.out.println("");
        scan.nextLine();   //Flush newline

        /*
         * วิชาต่อไป
         */

        //รับค่าจาก User
        System.out.print("Enter course name : ");
        name = scan.nextLine();
        Grader grade1 = new Grader(name);

        //input จำนวนนักเรียน
        System.out.print("Enter number of students : ");
        num = scan.nextInt();

        //input คะแนนตามจำนวนนักเรียน
        System.out.print("Input scores : \n");
        for(int i = 0 ; i < num ; i++)
        {
            score = scan.nextDouble();
            grade1.addScores(score);
        }

        //แสดง Mean
        System.out.printf("Mean for %s = %.2f \n",grade1.countStudents() , grade1.mean());
        //แสดงจำนวนคนที่ได้คะแนนต่ำกว่า Mean
        System.out.printf("Below Mean = %d\n",grade1.belowMean());
        //แสดงจำนวนคนที่ได้คะแนนสูงกว่ากว่า Mean
        System.out.printf("Above Mean = %d\n",grade1.aboveMean());
        //แสดงแสดงจำนวนคนในแต่ละ grade
        grade1.showGrade();
        System.out.println("");

        for(int j = 0 ; j < 20 ; j++)
        {
            System.out.print("#");
        }
        scan.close();
        
    }
}