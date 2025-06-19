import java.util.Scanner;
public class VotingEligibility {
    public static int[] generateAges(Scanner inp) {
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = inp.nextInt();
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 0 && ages[i] >= 18) ? "true" : "false";
        }
        return result;
    }

    public static void displayResult(String[][] result) {
        System.out.println("\nAge\tCan Vote?");
        for (int i = 0; i < 10; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] ages = generateAges(inp);
        String[][] result = checkVotingEligibility(ages);
        displayResult(result);
    }
}
