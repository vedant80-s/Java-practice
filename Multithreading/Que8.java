package Multithreading;

class ProCon{
    private int produced ;
    int count = 0 ;
    synchronized void isProduce() throws InterruptedException{
        while(produced != 0){
            wait();
        }
        produced++ ;
        System.out.println("Produced " + count);
        notifyAll();
    }

    synchronized void isConsume() throws InterruptedException{
        while(produced == 0) {
            wait();
        }
        produced-- ;
        System.out.println("Consumed " + count);
        notifyAll();
    }
    int getProduced(){
        return produced;
    }
}

public class Que8 {

    public static void main(String[] args) throws InterruptedException {
        ProCon pro = new ProCon();
        ProThread proThread = new ProThread(pro);
        ConThread conThread = new ConThread(pro);

        proThread.setName("FF");
        conThread.setName("FFF");    
    
        proThread.start();
        conThread.start();

        proThread.join();
        conThread.join();
    }
}