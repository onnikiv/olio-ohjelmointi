package task01;

public class BankAccount {

    public static int totalAccounts = 0;
    private int accountBalance;
    private int accountNumber;

    // Your variable declarations and code here
    public BankAccount(int accountBalance) {
        this.accountBalance = accountBalance;
        this.accountNumber += totalAccounts;
    }
    
    public int getAccountNumber() {
        return totalAccounts;
    }

    public double  getAccountBalance() {
        return accountBalance;
    }

    public void deposit(int money) {
        this.accountBalance =+ money;
    }

    public void withdraw(int money) {
        this.accountBalance =- money;
    }

    public int getBalance() {
        return accountBalance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}