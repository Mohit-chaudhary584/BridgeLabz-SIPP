import java.util.*;

public class Max_of_Three {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3= sc.nextInt();
        find(num1,num2,num3);

    }
    public static void find(int num1,int num2,int num3){
        if(num1>num2&&num1>num3){
            System.out.println(num1+" is greatest");
        } else if (num2>num3&&num2>num1) {
            System.out.println(num2+" is greatest");
        }else {
            System.out.println(num3+" is greatest");
        }
    }
}