public class BankAccount {

    	// Static variable shared across all accounts
    
	static String bankName = "Future Bank";
    	private static int totalAccounts = 0;

    	// Final variable to prevent overriding
    	
	private final int accountNumber;
    	private String accountHolderName;

    	// Constructor using 'this' to resolve ambiguity

    	public BankAccount(String accountHolderName, int accountNumber) {
        	this.accountHolderName = accountHolderName;
        	this.accountNumber = accountNumber;
        	totalAccounts++;
    	}

   	// Static method to display total number of accounts

    	public static int getTotalAccounts() {
        	return totalAccounts;
    	}

    	// Display account details if object is instance of BankAccount

    	public void displayDetails() {
        	if (this instanceof BankAccount) {
            		System.out.println("Bank Name: " + bankName);
            		System.out.println("Account Holder: " + accountHolderName);
            		System.out.println("Account Number: " + accountNumber);
        	} else {
            		System.out.println("Invalid");
        	}
    	}

    // Main method

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001);
        BankAccount acc2 = new BankAccount("Bob", 1002);

        acc1.displayDetails();
        System.out.println("------------------------------");
        acc2.displayDetails();
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}