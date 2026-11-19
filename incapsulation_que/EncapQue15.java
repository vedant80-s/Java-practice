
class ATM {
    private int pin ;

    public ATM() {
        pin = 12345678;
    }

    public void verifyPin(int pin) {
        if(this.pin == pin){
            System.out.println("Pin Verification Successful");
        }else{
            System.out.println("Pin is wrong");
        }
    }
}
public class EncapQue15 {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.verifyPin(12345678);
        a.verifyPin(123456);
    }
}
