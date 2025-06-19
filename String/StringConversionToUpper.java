import java.util.Scanner;
class StringConversionToUpper{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String manual = "";
		for(int i = 0; i < s.length();i++){
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				ch = (char)(ch - 32);
				manual = manual+ch;
			}
		}

		String builtIn = s.toUpperCase();
		System.out.println(check(manual, builtIn));
		
	}
	public static boolean check(String manual, String builtIn){
		for(int i = 0 ; i < manual.length() ; i++){
			if(manual.charAt(i) != builtIn.charAt(i)){
				return false;
			}
		}
		return true;
	}
}