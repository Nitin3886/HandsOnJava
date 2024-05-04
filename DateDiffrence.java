import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first date: ");
        String date1=scanner.next();
        System.out.println("Enter the Second date: ");
        String date2=scanner.next();
        LocalDate localDate1=LocalDate.parse(date1);
        LocalDate localDate2=LocalDate.parse(date2);
        long days=ChronoUnit.DAYS.between(localDate1,localDate2);
        if(days>0){
            System.out.println("The diffrence between the two dates is "+Math.abs(days)+"days.");
        }else{
            System.out.println("The two dates are similar");
        }
        
    }
}
