import org.w3c.dom.css.CSSStyleDeclaration;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Prime_check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        if(isPrime(num)){
            System.out.println("Prime");
        }else {
            System.out.println("Non-prime");
        }
    }
    public static boolean isPrime(int number){
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}