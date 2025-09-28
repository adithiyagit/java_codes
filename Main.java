import java.util.Scanner;

public class BankApp {

    // --- Transaction class ---
    static class Transaction {
        private String fromAccount;
        private String toAccount;
        private double amount;
        private boolean status;

        public Transaction(String fromAccount, String toAccount, double amount, boolean status) {
            this.fromAccount = fromAccount;
            this.toAccount = toAccount;
            this.amount = amount;
            this.status = status;
        }

        public void printReceipt() {
            System.out.println("\n--- Transaction Details ---");
            System.out.println("From   : " + fromAccount);
            System.out.println("To     : " + toAccount);
            System.out.println("Amount : INR " + amount);
            System.out.println("Status : " + (status ? "Successful" : "Failed"));
        }
    }

    // --- BankAccount class ---
    static class BankAccount {
        private String accountHolder;
        private double balance;
        private static int accountCount = 0;

        public BankAccount(String name, double initialDeposit) {
            this.accountHolder = name;
            this.balance = initialDeposit;
            accountCount++;
        }

        public static int getAccountCount() {
            return accountCount;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public boolean withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

        public Transaction transferTo(BankAccount receiver, double amount) {
            boolean success = this.withdraw(amount);
            if (success) {
                receiver.deposit(amount);
            }
            return new Transaction(this.accountHolder, receiver.getAccountHolder(), amount, success);
        }

        public void display() {
            System.out.println(accountHolder + "'s Balance: INR " + balance);
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create first account
        System.out.print("Enter name for Account 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter initial deposit for " + name1 + ": INR ");
        double balance1 = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        BankAccount account1 = new BankAccount(name1, balance1);

        // Create second account
        System.out.print("\nEnter name for Account 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter initial deposit for " + name2 + ": INR ");
        double balance2 = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        BankAccount account2 = new BankAccount(name2, balance2);

        // Show initial balances
        System.out.println("\n--- Initial Balances ---");
        account1.display();
        account2.display();

        // Transfer money from account1 to account2
        System.out.print("\nEnter amount to transfer from " + account1.getAccountHolder() + " to " + account2.getAccountHolder() + ": INR ");
        double transferAmount = scanner.nextDouble();

        Transaction transaction = account1.transferTo(account2, transferAmount);
        transaction.printReceipt();

        // Updated balances
        System.out.println("\n--- Updated Balances ---");
        account1.display();
        account2.display();

        // Total accounts
        System.out.println("\nTotal Bank Accounts: " + BankAccount.getAccountCount());

        scanner.close();
    }
}
