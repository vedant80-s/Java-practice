package Multithreading;

class TestThread {
    private int count ;

    synchronized void inc(){
        count++;
    }

    synchronized void incr(){
        count++;
    }

    int get(){
        return count;
    }
}


public class Que6 {

    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        Example2 example2 = new Example2(testThread);
        Example2 example3 = new Example2(testThread);
        Example2 example4 = new Example2(testThread);
        example2.start();
        example3.start();
        example4.start();
        example3.join();
        example2.join();
        example4.join();
        System.out.println(testThread.get());
    }
}