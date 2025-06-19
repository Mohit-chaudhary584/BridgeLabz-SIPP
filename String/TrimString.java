import java.util.Scanner;
public class TrimString {
    public static int[] trimIndices(String str) {
        int start = 0, end = 0;
        while (start < str.length() && str.charAt(start) == ' ') start++;
        end = str.length() - 1;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String getSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = inp.nextLine();

        int[] bounds = trimIndices(input);
        String trimmedByMethod = getSubstring(input, bounds[0], bounds[1]);
        String builtInTrim = input.trim();
        boolean isSame = compareStrings(trimmedByMethod, builtInTrim);

        System.out.println("\nTrimmed using method: [" + trimmedByMethod + "]");
        System.out.println("Trimmed using built-in: [" + builtInTrim + "]");
        System.out.println("Are both equal? " + isSame);
    }
}
