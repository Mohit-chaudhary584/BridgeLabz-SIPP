import java.util.Scanner;
class quotientRemainder{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int num1=sc.nextInt();
        System.out.print("enter second number: ");
        int num2=sc.nextInt();

        int quotient=num1/num2;
        int remainder=num1%num2;
        System.out.println("The quotient is "+quotient+" and the remainder is: "+remainder+" of two numbers "+num1+" and "+num2);
    }
}