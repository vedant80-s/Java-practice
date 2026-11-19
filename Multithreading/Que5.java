package Multithreading;

public class Que5 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread() + "Start");
        }, "Thread1");
        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread() + "Start");
        }, "Thread2");
        Thread thread3 = new Thread(() -> {
            System.out.println(Thread.currentThread() + "Start");
        }, "Thread3");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Thread 1 : " + thread1.getPriority());
        System.out.println("Thread 2 : " + thread2.getPriority());
        System.out.println("Thread 3 : " + thread3.getPriority());
    }
}
