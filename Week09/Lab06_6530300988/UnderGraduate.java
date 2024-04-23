package Lab06_6530300988;

public class UnderGraduate extends Student
{
    public UnderGraduate(int score) 
    { 
        super(50); 
    } 
     public String calculateGrade() 
    { 
        int score = getScore(); 
        if(score >= 50) 
        { 
        return "PASS"; 
        } 
    else 
        { 
        return "FALL"; 
        } 
    }    
}
