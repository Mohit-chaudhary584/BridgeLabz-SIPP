import java.util.Scanner;
class StringOutOfBoundsException{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try{
			generate(s);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
		}
	}
	public static void generate(String s){
		int i  = s.length();
		char a = s.charAt(i);
	}
	
}