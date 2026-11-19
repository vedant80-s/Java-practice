package inheritence_que;
class Vehicle{
    void start(){
        System.out.println("Start");
    }
}
class Car extends Vehicle{
}
public class Que2 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}
