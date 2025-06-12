import java.util.Scanner;
class Income{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int balance = sc.nextInt();
		int income = salary + balance;
		System.out.println("The salary is INR " + salary + " and the bonus is INR " + balance + " . Hence Total Income is INR " + income );
	}
}