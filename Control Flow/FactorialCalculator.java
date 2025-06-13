import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is only defined for non-negative numbers.");
        } else {
            int factorial = 1;
            int counter = number;

            while (counter > 0) {
                factorial *= counter;
                counter--;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}