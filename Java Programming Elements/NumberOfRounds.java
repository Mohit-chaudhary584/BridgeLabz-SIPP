import java.util.Scanner;
class NumberOfRounds{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		int perimeter = side1 + side2 + side3;
		int distance = 5000;
		int numberOfRounds = perimeter / distance;
		System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km");
	}
}