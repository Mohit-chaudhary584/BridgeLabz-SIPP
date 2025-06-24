class PalindromeChecker{
	String text;
	
	PalindromeChecker(String text){
		this.text = text;
	}
	public boolean check(){
		String dummy = "";
		for(int i = text.length() - 1; i >= 0; i--){
			dummy += text.charAt(i);
		}
		return dummy.equals(text);
	}
	public void display(){
		String n1 = "";
		if(check() == false){
			System.out.println("The given string: " + text + " is not a palindrome");
		}else{
			System.out.println("The given string: " + text + " is a palindrome");
		}
	}
	public static void main(String[] args){
		PalindromeChecker str1 = new PalindromeChecker("abba");
		PalindromeChecker str2 = new PalindromeChecker("abcd");
		str1.display();
		System.out.println("-------------------------------------------");
		str2.display();
	}
}