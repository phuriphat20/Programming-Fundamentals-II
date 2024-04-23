import java.util.ArrayList;
/*
 * writen : Phuriphat Nokkhumthongb
 * ID     : 6530300988
 */
public class Grader 
{
    //argument
    public String courseName;
    public ArrayList<Double> score = new ArrayList<Double>();

    //constructor
    public Grader(String name)
    {
        courseName = name ;
    }

    //เพิ่มคะเเนนลงใน ArrayList
    public void addScores(double score)
    {
        this.score.add(score);
    }

    //นับจำนวนคนใน Class
    public int countStudents()
    {
        return score.size();
    }

    //หาคะแนนเฉลี่ย
    public double mean()
    {
        double sum = 0 ;
        for(double i : score)
        {
            sum += i;
        }
        return sum / countStudents();
    }

    //หาจำนวนคนที่ได้คะแนนต่ำกว่า Mean
    public int belowMean()
    {
        int countbelow = 0;
        for(double below : score)
        {
            if(below < mean())
            {
                countbelow++;
            }
        }
        return countbelow;
    }

    //หาจำนวนคนที่ได้คะแนนสูงกว่ากว่า Mean
    public int aboveMean()
    {
        int countabove = 0;
        for(double above : score)
        {
            if(above > mean())
            {
                countabove++;
            }
        }
        return countabove;
    }

    //แสดงจำนวนคนในแต่ละ grade 
    public void showGrade()
    {
        int A = 0 , BP = 0 , B = 0 , CP = 0 , C = 0 , DP = 0 , D = 0 , F = 0;
        for(double grade : score)
        {
            if(grade >= 80)
            {
                A++;
            }else if (grade >=75) 
            {
                BP++;
            }else if(grade >= 70)
            {
                B++;
            }else if(grade >= 65)
            {
                CP++;
            }else if(grade >= 60)
            {
                C++;
            }else if(grade >= 55)
            {
                DP++;
            }else if(grade >= 50)
            {
                D++;
            }else 
            {
                F++;
            }
        }
        System.out.printf("Grade : A %d , B+ %d , B %d , C+ %d , C %d , D+ %d , D %d , F %d",A , BP , B , CP , C , DP , D , F );
    }

    //หาชื่อของ Class
    public String getCourseName()
    {
        return this.courseName;

    }
}