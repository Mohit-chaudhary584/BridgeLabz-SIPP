import java.time.LocalDate;
import java.util.*;

public class Date_Arithmetic {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int year=sc.nextInt();
        System.out.println("Enter month");
        int month=sc.nextInt();
        System.out.println("Enter dd");
        int dd=sc.nextInt();
        LocalDate date=LocalDate.of(year,month,dd);
        LocalDate newDate=date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Original date "+date);
        System.out.println("New Date "+newDate);

    }
}