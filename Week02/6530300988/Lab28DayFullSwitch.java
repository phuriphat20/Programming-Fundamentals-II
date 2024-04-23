import java.util.*;

public class Lab28DayFullSwitch {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter data (Monday , Tuesday , Wednesday , Thursday , Friday , saturday , Sunday) : ");
      String dateFull = sc.nextLine();
      String dateBrev = "";

      switch (dateFull) {
        case "Monday" :
                 dateBrev = "Mon";
                 break;
        case "Tuesday" :
                 dateBrev = "Tue";
                 break;
        case "Wednesday" :
                 dateBrev = "Wed";
                 break;
        case "Thursday" :
                 dateBrev = "Thu";
                 break;
        case "Friday" :
                 dateBrev = "Fir";
                 break;
        case "Saturday" :
                 dateBrev = "Sat";
                 break;
        case "Sunday" :
                 dateBrev = "Sun";
                 break;
      
        default:
            dateBrev = "Invalid";
            break;
      }
      System.out.println("The abbreviation of "+dateFull+" is "+dateBrev+".");
      sc.close();
    }
}