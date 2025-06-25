import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose operation: \n1. Add \n2. Subtract \n3. Multiply \n4. Divide");
        int choice=sc.nextInt();
        System.out.println("Enter first number:");
        double a=sc.nextDouble();
        System.out.println("Enter seconde number:");
        double b=sc.nextDouble();
        switch(choice){
            case 1:
                System.out.println("Result :"+add(a,b));
                break;
            case 2:
                System.out.println("Result :"+subtract(a,b));
                break;
            case 3:
                System.out.println("Result :"+multiply(a,b));
                break;
            case 4:
                if(b!=0)
                System.out.println("Result :"+divide(a,b));
                else System.out.println("Error");
                break;
            default:
            System.out.println("Invalid Choice");

        }
    }
    static double add(double x,double y){
        return x+y;
    }
    static double subtract(double x,double y){
        return x-y;
    }
    static double multiply(double x,double y){
        return x*y;
    }
    static double divide(double x,double y){
        return x/y;
    }
}