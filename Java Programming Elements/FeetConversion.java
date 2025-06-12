import java.util.Scanner;
class FeetConversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int feet = sc.nextInt();
		float yardToFeet = 3.0f;
		float mileToYard = 1760.0f;
		float feetToYard = feet / yardToFeet;
		float yardToMile = feetToYard / mileToYard;
		System.out.println("The distance in yards is " + feetToYard + " while the distance in miles is " + yardToMile);
	}
}