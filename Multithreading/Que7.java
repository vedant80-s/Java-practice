package Multithreading;

public class Que7 {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        Example3 example = new Example3(testThread);
        Example3 example1 = new Example3(testThread);
        Example3 example3 = new Example3(testThread);
        example.start();
        example1.start();
        example3.start();

        example.join();
        example1.join();
        example3.join();

        System.out.println(testThread.get());
    }
}