import java.util.Scanner;

class NaturalNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int sumFormula = n * (n + 1) / 2;

            int sumLoop = 0, i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }

            System.out.println("Sum computed using formula: " + sumFormula);
            System.out.println("Sum computed using while loop: " + sumLoop);

            if (sumFormula == sumLoop) {
                System.out.println("The result is correct.");
            } else {
                System.out.println("Mismatch");
            }
        }
    }
}