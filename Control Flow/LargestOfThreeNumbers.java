import java.util.Scanner;
class LargestOfThreeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		boolean condition1 = false;
		boolean condition2 = false;
		boolean condition3 = false;
		if(num1 > num2 && num1 > num3) condition1 = true;
		if(num2 > num1 && num2 > num3) condition2 = true;
		if(num3 > num1 && num3 > num2) condition3 = true;
		System.out.println("Is the first number the largest? " + condition1);
		System.out.println("Is the second number the largest? " + condition2);
		System.out.println("Is the third number the largest? " + condition3);
	}
}