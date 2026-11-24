// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
        accountNumber = "000";
        balance = 0.0;
    }

    public BankAccount(String AN, double b) {
        accountNumber = AN;
        balance = b;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance > amount) 
            balance -= amount;
        else 
            System.out.println("No suffecient fund");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}



class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("12345", 1000);
        acc1.deposit(500);
        acc1.withdraw(300);

        System.out.println("Account number: " + acc1.getAccountNumber() + " balance: " + acc1.getBalance());
        
    }
}
