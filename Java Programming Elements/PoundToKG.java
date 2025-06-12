import java.util.Scanner;
class PoundToKG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pound = sc.nextInt();
		float poundToKG = 2.2f;
		float kg = pound * poundToKG;
		System.out.print("The weight of the person in pounds is " + pound + " and in kg is " + kg );
	}
}