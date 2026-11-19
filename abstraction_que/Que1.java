abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Que1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}