import java.util.Scanner;
class NumberSwapping{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		int var3 = var1;
		var1 = var2;
		var2 = var3;
		System.out.println("The swapped numbers are " + var1 + " and " + var2 );
	}
}