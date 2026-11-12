package Task3_ATMInterface;

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
        }
        else {
            balance -= amount;
            System.out.println("Please collect your cash.");
        }
    }

    public void checkBalance() {
        System.out.println("Available Balance: Rs." + balance);
    }
}