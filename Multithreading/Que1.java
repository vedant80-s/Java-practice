package Multithreading;


class Example extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++){
            System.out.println(i);
        }
        // try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
    }
}

class ExampleByRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(i);
        }
    }
}


public class Que1 {

    public static void main(String[] args) throws InterruptedException {
        Example example = new Example();
        example.start();
        example.join();
        System.out.println("Task Complete");
    }
}