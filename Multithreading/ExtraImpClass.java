package Multithreading;

/*
 * Que 8 me use kiya hai esko 
 *
 * 
 */
class ProThread extends Thread {
    ProCon proCon;

    ProThread(ProCon proCon) {
        this.proCon = proCon;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                proCon.isProduce();
            } catch (InterruptedException e) {
                System.out.println("Exception Aa Gayi");
            }
        }
    }
}

class ConThread extends Thread {
    ProCon proCon;

    ConThread(ProCon proCon) {
        this.proCon = proCon;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                proCon.count++;
                proCon.isConsume();
            } catch (InterruptedException e) {
                System.out.println("Exception Aa Gayi");
            }
        }
    }
}
/*
 * -----------------------------------------------------------------------------
 * ---------------------
 */

/*
 * Que 6 me eska use kiya hai
 *
 */

class Example2 extends Thread {

    TestThread testThread ;

    Example2(TestThread testThread) {
        this.testThread = testThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            testThread.inc();
        }
    }
}

/*
 * -----------------------------------------------------------------------------
 * -------------------------------
 */

/*
 * Que 7 me eska Use kara hai
 *
 */
class Example3 extends Thread {

    TestThread testThread;

    Example3(TestThread testThread) {
        this.testThread = testThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            testThread.incr();
        }
    }
}
/*
 * -----------------------------------------------------------------------------
 * --------------------------
 */

/*
 * 
 * Que 9 me eska use hua hai
 * ye deadlock hai
 * esko solve karne ke liye
 * synchronised block laaga de
 * bas re
 * 
 */

class Pen {
    Paper paper;

    synchronized void writeWithPen() {
        System.out.println("Writing with Pen");
        paper.writeOnPaperFinish();
    }

    synchronized void writeWithPenFinish() {
        System.out.println("Writing With Pen Finish");
    }
}

class Paper {
    Pen pen;

    synchronized void writeOnPaper() {
        System.out.println("Writing On Paper");
        pen.writeWithPenFinish();
    }

    synchronized void writeOnPaperFinish() {
        System.out.println("Writing On Paper Finish");
    }
}

class DeadlockThread1 extends Thread {

    Pen pen;
    Paper paper;

    DeadlockThread1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPen();
    }
}

class DeadlockThread2 extends Thread {

    Pen pen;
    Paper paper;

    DeadlockThread2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    /*
     * Ye deadlock nahi hone dega
     * 
     * public void run() {
     * synchronized(pen){
     * paper.writeOnPaper();
     * }
     * }
     * 
     */

    // Ye deadlock dega
    @Override
    public void run() {
        paper.writeOnPaper();
    }
}

/*
 * 
 * -----------------------------------------------------------------------------
 * ---------------------------------------
 * 
 */

/*
 * 
 * Que 10 me eska use hua haI
 * 
 */

class ATM {
    private int balance = 1000;

    void pay(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Payment Hogaya Re " + balance);
        } else {
            System.out.println("Khate Me Paise Nahi hai Re " + balance);
        }
    }
}

class AtMThread extends Thread {
    ATM atm;
    int amout;

    AtMThread(ATM atm, int amout) {
        this.atm = atm;
        this.amout = amout;
    }

    @Override
    public void run() {
        atm.pay(amout);
    }
}

/*
 * 
 * -----------------------------------------------------------------------------
 * ---------------------------------------
 * 
 */