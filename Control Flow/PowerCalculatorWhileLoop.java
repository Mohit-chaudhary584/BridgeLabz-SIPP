import java.util.Scanner;

public class PowerCalculatorWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int power = scanner.nextInt();

        int result = 1;

        int counter = 0;

        while (counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);

    }
}
