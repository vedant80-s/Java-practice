package Multithreading;

public class Que4 {
    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        } , "Re");
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        } , "Vedant");
        thread1.start();
        thread1.join();
        System.out.println(thread1.getName() + " Complete");
        thread2.start();
        thread2.join();
        System.out.println(thread2.getName() + " Complete");
    }
}
