import java.util.Scanner;
public class CelsiusToFarenheit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float celsius = sc.nextFloat();
		float farenheit = (celsius * 9 / 5) + 32;
		System.out.print("The " + celsius + " celsius is " + farenheit + " fahrenheit");
	}
}