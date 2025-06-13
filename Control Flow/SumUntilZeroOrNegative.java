import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;        
        System.out.println("Enter numbers to sum (enter 0 or negative number to stop):");

        while (true) {
            double userInput = scanner.nextDouble(); 

            if (userInput <= 0) {
                break;
            }

            total += userInput;
        }

        System.out.println("Total sum: " + total);

    }
}