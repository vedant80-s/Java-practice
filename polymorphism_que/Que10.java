package polymorphism_que;

abstract class Payment{
    abstract void pay();
}

class CreditCard extends Payment{
    @Override
    public void pay() {
        System.out.println("Payment Clear by CreditCard");
    }
}

class UPIPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment Clear by UPI Payment");
    }
}

public class Que10 {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        Payment p2 = new UPIPayment();
        p.pay();        
        p2.pay();        
    }
}