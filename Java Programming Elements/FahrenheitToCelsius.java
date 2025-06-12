import java.util.Scanner;
public class FahrenheitToCelsius{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float farenheit = sc.nextFloat();
		float celsius = (farenheit - 32) * (5 / 9);
		System.out.print("The " + farenheit + " fahrenheit is " + celsius + " celsius");
	}
}