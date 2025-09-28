abstract class BankAccount {
private double balance; // Encapsulation

   
public BankAccount(double initialBalance) {
this.balance = initialBalance;
}

    
public double getBalance() {
return balance;
}

  
protected void setBalance(double balance) {
this.balance = balance;
}

    
public abstract void deposit(double amount);
public abstract void withdraw(double amount);
}


class SavingsAccount extends BankAccount {

public SavingsAccount(double initialBalance) {
super(initialBalance);
}

    
public void deposit(double amount) {
if (amount > 0) {
setBalance(getBalance() + amount);
System.out.println("Deposited ₹" + amount + " to Savings Account. New Balance: ₹" + getBalance());
} else {
System.out.println("Invalid deposit amount.");
}
}

    
public void withdraw(double amount) {
if (amount > 0 && amount <= getBalance()) {
setBalance(getBalance() - amount);
System.out.println("Withdrew ₹" + amount + " from Savings Account. New Balance: ₹" + getBalance());
} else {
System.out.println("Insufficient funds or invalid amount.");
}
}
}


class CurrentAccount extends BankAccount {
private final double overdraftLimit = 10000.0;

public CurrentAccount(double initialBalance) {
super(initialBalance);
}

    
public void deposit(double amount) {
if (amount > 0) {
setBalance(getBalance() + amount);
System.out.println("Deposited ₹" + amount + " to Current Account. New Balance: ₹" + getBalance());
} else {
System.out.println("Invalid deposit amount.");
}
}

public void withdraw(double amount) {
if (amount > 0 && (getBalance() + overdraftLimit >= amount)) {
setBalance(getBalance() - amount);
System.out.println("Withdrew ₹" + amount + " from Current Account. New Balance: ₹" + getBalance());
} else {
System.out.println("Overdraft limit exceeded or invalid amount.");
}
}
}

public class BankSystem {
public static void main(String[] args) {
SavingsAccount savings = new SavingsAccount(5000);
CurrentAccount current = new CurrentAccount(3000);

savings.deposit(2000);
savings.withdraw(1000);

current.deposit(5000);
current.withdraw(13000);  
current.withdraw(3000);  
}
}
