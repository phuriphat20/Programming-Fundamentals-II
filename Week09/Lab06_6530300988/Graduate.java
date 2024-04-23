package Lab06_6530300988;

public class Graduate extends Student
{
    public Graduate(int score) 
    { 
        super(score); 
    } 
     public String calculateGrade() 
    { 
        int score = getScore(); 
        if(score >= 70) 
        { 
        return "PASS"; 
        } 
    else 
        { 
        return "FALL"; 
        } 
    }    
}
