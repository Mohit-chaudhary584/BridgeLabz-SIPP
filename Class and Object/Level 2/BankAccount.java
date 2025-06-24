public class BankAccount {
	String accountHolder;
	String accountNumber;
	double balance;

	public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
		this.accountHolder = accountHolder;
        	this.accountNumber = accountNumber;
        	this.balance = initialBalance;
    	}

    	public void deposit(double amount) {
        	if (amount > 0) {
            		balance += amount;
            		System.out.println("Deposited :" + amount);
        	} else {
            		System.out.println("Deposit amount must be positive.");
        	}
    	}

    	public void withdraw(double amount) {
        	if (amount > 0 && amount <= balance) {
            		balance -= amount;
            		System.out.println("Withdrew :" + amount);
        	} else {
            		System.out.println("Insufficient balance or invalid amount.");
        	}
    	}

    	public void displayBalance() {
        	System.out.println("Current Balance: " + balance);
    	}

 
    	public static void main(String[] args) {
        	BankAccount account = new BankAccount("abc", "1234567890", 5000.00);
        	account.displayBalance();
        	account.deposit(1500.00);
        	account.withdraw(2000.00);
        	account.displayBalance();
    	}

}