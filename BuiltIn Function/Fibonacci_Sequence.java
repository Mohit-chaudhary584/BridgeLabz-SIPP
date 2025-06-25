import java.util.*;
public class Fibonacci_Sequence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int terms=sc.nextInt();
        generate(terms);
    }
    public static void generate(int n){
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.println(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}