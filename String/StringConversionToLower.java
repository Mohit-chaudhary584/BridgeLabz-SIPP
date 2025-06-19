import java.util.Scanner;
class StringConversionToLower{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String manual = "";
		for(int i = 0; i < s.length();i++){
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z'){
				ch = (char)(ch + 32);
				manual = manual+ch;
			}
		}

		String builtIn = s.toLowerCase();
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