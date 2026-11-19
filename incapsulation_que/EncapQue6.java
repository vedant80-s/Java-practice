
class BankAccount{
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void diposit(int balance) {
        if(balance > 0){
            this.balance = balance;
            System.out.println("Balance Update Succesfully. \n Balance :- " + balance);
        }
    }
    public void withdraw(int amount){
        if(balance < amount) {
            System.out.println("Withdraw Failed ");
            return ;
        }
        balance = balance - amount;
        System.out.println("Withdraw Successful .\n Remaining Balance :- " + balance);
    }

}
public class EncapQue6 {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.diposit(5400);
        bA.withdraw(5500);
    }
}
