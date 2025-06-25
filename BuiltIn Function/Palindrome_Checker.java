
import java.util.Scanner;

public class Palindrome_Checker {
    public static void main(String[] args) {
        String input=getInput();
        boolean result=isPalindrome(input);
        displayResult(input,result);
    }
    public static String getInput(){
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
    public static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public static void displayResult(String str,boolean result){
        if(result)System.out.println(str+" is a palindrome");
        else System.out.println(str+" is npt a palindrome");
    }

}