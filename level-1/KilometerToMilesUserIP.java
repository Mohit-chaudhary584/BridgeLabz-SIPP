import java.util.Scanner;
class KilometerToMilesUserIP{
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		double kmToMile = 1.6;
		double mile = km * kmToMile;
		System.out.println("The total miles is " + mile + " mile for the given " + km + " km");
	}
}