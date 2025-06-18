import java.util.Scanner;

public class StringCompare {

    public static boolean compareStrings(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine();

        String string2 = scanner.nextLine();

        boolean manualComparison = compareStrings(string1, string2);

        boolean builtInComparison = string1.equals(string2);

        System.out.println("Manual comparison using charAt(): " + manualComparison);
        System.out.println("Built-in equals() comparison: " + builtInComparison);

        if (manualComparison == builtInComparison) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Mismatch in comparison methods!");
        }
    }
}
