interface Payment1 {
    void pay();
}

class CreditCardPayment implements Payment1 {
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

public class Que5{
    public static void main(String[] args) {
        Payment1 p = new CreditCardPayment();
        p.pay();
    }
}