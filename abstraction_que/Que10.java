abstract class BankAccount {
    abstract void deposit(int amount);
    abstract void withdraw(int amount);
}

class SavingsAccount extends BankAccount {
    void deposit(int amount) {
        System.out.println("Savings Account Deposit: " + amount);
    }

    void withdraw(int amount) {
        System.out.println("Savings Account Withdraw: " + amount);
    }
}

class CurrentAccount extends BankAccount {
    void deposit(int amount) {
        System.out.println("Current Account Deposit: " + amount);
    }

    void withdraw(int amount) {
        System.out.println("Current Account Withdraw: " + amount);
    }
}

public class Que10 {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount();
        BankAccount acc2 = new CurrentAccount();

        acc1.deposit(1000);
        acc1.withdraw(500);

        acc2.deposit(2000);
        acc2.withdraw(1000);
    }
}