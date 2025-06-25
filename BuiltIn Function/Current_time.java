import java.time.*;
import java.util.*;
public class Current_Time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ZonedDateTime gmt=ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(gmt);
        System.out.println(ist);
        System.out.println(pst);
    }
}