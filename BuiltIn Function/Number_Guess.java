import java.util.*;

public class Number_Guess {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int low=1;
        int high=100;
        while (true){
            int guess=generate(low,high);
            System.out.println(guess+" is correct, high or low");
            String str=sc.next();
            if(str.equalsIgnoreCase("correct")){
                break;
            } else if (str.equalsIgnoreCase("high")) {
                high=guess-1;
            }else{
                low=guess+1;
            }
        }
    }
    public  static int generate(int low,int high){
        int guess=low+(high-low)/2;
        return guess;
    }
}