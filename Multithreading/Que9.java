package Multithreading;

public class Que9 {
    public static void main(String[] args) throws InterruptedException {
        Pen pen = new Pen();
        Paper paper = new Paper();
        pen.paper = paper;
        paper.pen = pen;
        DeadlockThread1 deadlockThread1 = new DeadlockThread1(pen, paper);
        DeadlockThread2 deadlockThread2 = new DeadlockThread2(pen, paper);

        deadlockThread1.start();
        deadlockThread2.start();
        System.out.println(deadlockThread1.getState());
        System.out.println(deadlockThread2.getState());
    }   
}