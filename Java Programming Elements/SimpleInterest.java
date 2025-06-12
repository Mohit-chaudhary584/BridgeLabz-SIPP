import java.util.Scanner;
class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int principle = sc.nextInt();
		float rate = sc.nextFloat();
		float time = sc.nextFloat();
		float simpleInterest = (principle * rate * time) / 100;
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principle + " , Rate of Interest  " + rate + " and Time " + time);
	}
}