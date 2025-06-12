import java.util.Scanner;
class ChocolateDistribution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numberOfChocolates = sc.nextInt();
		int numberOfChildren = sc.nextInt();
		int chocolatePerChild = numberOfChocolates / numberOfChildren;
		int remainingChocolate = numberOfChocolates % numberOfChildren;
		System.out.println("The number of chocolates each child gets is " + chocolatePerChild + " and the number of remaining chocolates is "+  remainingChocolate );
	}
}