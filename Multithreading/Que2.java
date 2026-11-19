package Multithreading;

public class Que2 {

    public static void main(String[] args) throws InterruptedException {
        ExampleByRunnable e = new ExampleByRunnable();
        Thread t = new Thread(e);
        t.start();
        t.join();
        System.out.println("Task Complete");
    }
}