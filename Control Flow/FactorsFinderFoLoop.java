import java.util.Scanner;

public class FactorsFinderFoLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
            return;
        }

        System.out.println("Factors of " + number);

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
