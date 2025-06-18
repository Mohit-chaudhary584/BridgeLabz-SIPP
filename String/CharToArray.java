import java.util.Scanner;

class CharToArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] manual = new char[s.length()];
		manual = charArray(s, manual);
		char[] builtIn = s.toCharArray();
		System.out.println(compare(builtIn, manual));
		
	}

	public static char[] charArray(String s, char[] manual){
		for(int i = 0; i < manual.length; i++){
			manual[i] = s.charAt(i);
		}
		return manual;
	}
	
	public static boolean compare(char[] builtIn , char[] manual){
		for(int i = 0; i< manual.length; i++){
			if(builtIn[i] != manual[i]){
				return false;
			}
		}
		return true;
	}

}