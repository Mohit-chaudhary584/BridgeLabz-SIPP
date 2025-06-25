
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Date_Formatting {
    public static void main(String args[]) {
        LocalDate date=LocalDate.now();
        DateTimeFormatter format_1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format_2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format_3=DateTimeFormatter.ofPattern("EEE,MMM dd,yyyy");
        System.out.println("Original :"+date);
        System.out.println(format_1);
        System.out.println(format_2);
        System.out.println(format_1);
    }
}
