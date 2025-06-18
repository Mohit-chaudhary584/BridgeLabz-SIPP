import java.util.Scanner;

class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        try {
            generate(s);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        handleWithCatch(s);

    }

    public static void generate(String s) {
        if (s.length() < 5) {
            throw new IllegalArgumentException("Input string must be at least 5 characters long.");
        }
        String str = s.substring(0, 3);
        System.out.println("First 3 characters: " + str);
    }

    public static void handleWithCatch(String s) {
        try {
            if (s.length() < 5) {
                throw new IllegalArgumentException("Input string must be at least 5 characters long.");
            }
            String str = s.substring(0, 3);
            System.out.println("First 3 characters: " + str);
        } catch (IllegalArgumentException e) {
            System.out.println("Handled inside method: " + e.getMessage());
        }
    }
}
