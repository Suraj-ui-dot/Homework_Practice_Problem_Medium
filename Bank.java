public class Bank {
    public String accountHolderName;
    public String accountNumber;
    private double balance;

        public Bank(String accountHolderName, String accountNumber, double balance) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;
    }
    

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

  

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal amount exceeds balance.");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Bank account = new Bank("Suraj Khanal", "12910017205635", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
    }
}