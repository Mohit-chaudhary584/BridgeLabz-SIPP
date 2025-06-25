import java.time.LocalDate;
import java.util.*;

public class Date_Comparision {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int year=sc.nextInt();
        System.out.println("Enter month");
        int month=sc.nextInt();
        System.out.println("Enter dd");
        int dd=sc.nextInt();
        System.out.println("Enter year");
        int year_2=sc.nextInt();
        System.out.println("Enter month");
        int month_2=sc.nextInt();
        System.out.println("Enter dd");
        int dd_2=sc.nextInt();
        LocalDate date_1=LocalDate.of(year,month,dd);
        LocalDate date_2=LocalDate.of(year_2,month_2,dd_2);
        if(date_1.isBefore(date_2)){
            System.out.println(date_1+" is before "+date_2);
        } else if (date_1.isAfter(date_2)) {
            System.out.println(date_1+" is after "+date_2);
        }else if(date_1.isEqual(date_2)){
            System.out.println("Both dates are same");
        }
    }
}