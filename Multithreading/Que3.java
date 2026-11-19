package Multithreading;

public class Que3 {

    public static void main(String[] args) throws InterruptedException {
        Example example = new Example();
        System.out.println(example.getState());
        example.start();
        System.out.println(example.getState());
        Thread.sleep(10);
        System.out.println(example.getState());
        example.join();
        System.out.println(example.getState());
        System.out.println("Task Complete");
    }
}