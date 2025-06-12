import java.util.Scanner;
public class HandShake{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		int combination = (numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.print("Number of handshakes " + combination);
	}
}