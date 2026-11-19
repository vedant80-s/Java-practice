package polymorphism_que;

class Vehicle{
    void start(){
        System.out.println("Vehicle Starting............");
    }
}

class Car720 extends Vehicle{
    @Override
    void start() {
        System.out.println("Car Starting................");
    }
}

public class Que4 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();
        Vehicle v1 = new Car720();
        v1.start();
    }
}
