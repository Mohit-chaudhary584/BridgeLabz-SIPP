public class NullPointerDemo {

    public static void generateNullPointer() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }

    public static void handleNullPointer() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating NullPointerException...");
        try {
            generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nHandling NullPointerException...");
        handleNullPointer();
    }
}
