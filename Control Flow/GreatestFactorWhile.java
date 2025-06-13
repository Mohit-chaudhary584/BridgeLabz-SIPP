import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int greatestFactor = 1;

        int counter = number - 1;

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;  // Exit loop after finding greatest factor
            }
            counter--;
        }

        System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);
    }
}
