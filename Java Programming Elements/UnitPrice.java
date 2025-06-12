import java.util.Scanner;
class UnitPrice{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int unitPrice = sc.nextInt();
		int quantity = sc.nextInt();
		int totalPrice = unitPrice * quantity;
		System.out.print("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and the unit price is INR " + unitPrice );
	}
}