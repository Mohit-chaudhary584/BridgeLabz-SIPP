import java.util.Scanner;

public class ArrayExceptionDemo {

    public static void generateException(String[] names, int index) {
        System.out.println("Accessing name at index " + index + ": " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Accessing name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Alice", "Bob", "Charlie", "Diana"};

        System.out.print("Enter the index to access (larger than " + (names.length - 1) + " to see the exception): ");
        int index = scanner.nextInt();

        System.out.println("\n--- Generating Exception (without handling) ---");
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main to prevent crash: " + e.getMessage());
        }

        System.out.println("\n--- Handling Exception using try-catch ---");
        handleException(names, index);
    }
}
