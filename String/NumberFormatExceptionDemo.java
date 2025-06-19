import java.util.Scanner;
class NumberFormatExceptionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			int n = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e){
			System.out.println("Handled inside method: " + e.getMessage());
		}
	}
	
}