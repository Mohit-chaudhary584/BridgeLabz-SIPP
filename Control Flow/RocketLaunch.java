import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Blast Off!");
        
	}
}