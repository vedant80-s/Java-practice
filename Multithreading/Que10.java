package Multithreading;

public class Que10 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        AtMThread atMThread1 = new AtMThread(atm , 300);
        AtMThread atMThread2 = new AtMThread(atm , 100);
        AtMThread atMThread3 = new AtMThread(atm , 50);
        AtMThread atMThread4 = new AtMThread(atm , 600);
        AtMThread atMThread5 = new AtMThread(atm , 300);


        atMThread1.start();
        atMThread2.start();
        atMThread3.start();
        atMThread4.start();
        atMThread5.start();
        
    }   
}