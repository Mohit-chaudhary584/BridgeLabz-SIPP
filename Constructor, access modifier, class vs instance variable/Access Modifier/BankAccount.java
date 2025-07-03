class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number (public): " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
        System.out.println("Balance (private via method): ₹" + getBalance());
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("AC123456", "Mohit Sharma", 10000.0);

        acc.displayAccountDetails();
        System.out.println("\n--- Transactions ---");
        acc.deposit(2500.0);
        acc.withdraw(1200.0);
        System.out.println("Updated Balance: ₹" + acc.getBalance());
    }
}