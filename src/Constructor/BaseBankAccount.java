package Constructor;

public class BaseBankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BaseBankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient Balance");
    }

    public double getBalance() {
        return balance;
    }
}

class BankSavingsAccount extends BaseBankAccount {
    BankSavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance());
    }

    public static void main(String[] args) {
        BankSavingsAccount sa = new BankSavingsAccount(1001, "Ramesh", 5000);
        sa.displayDetails();
        sa.deposit(2000);
        sa.displayDetails();
        sa.withdraw(1000);
        sa.displayDetails();
    }
}
