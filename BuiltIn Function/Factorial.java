import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int number=getInput();
        int fact=factorial(number);
        displayOutput(number,fact);
    }
    static int getInput(){
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();

    }
    static int factorial(int n){
        if(n<=1)return 1;
        return n*factorial(n-1);
    }
    public static void displayOutput(int n,int fact){
        System.out.println("Factorial of "+n+" is "+fact);
    }
}