package inheritence_que;
class BankAccount12{
    int balance ;
    void balance(){
        System.out.println("Balance: " + balance);
    }
    void addBalance(){
        System.out.println("Balance: " + balance);
    }
    void deleteBalance(){
        System.out.println("Balance: " + balance);
    }
}
class SavingAccount extends BankAccount12{
}
class CurrentAccount extends BankAccount12{
}
public class Que10 {
    public static void main(String[] args) {
        BankAccount12 b1 = new CurrentAccount();
        BankAccount12 b2 = new SavingAccount();
        b1.addBalance();
        b2.addBalance();
    }
}