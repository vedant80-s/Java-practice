package polymorphism_que;

class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog Sound");
    }
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat Sound");
    }
}
public class Que1 {
    
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal a1 = new Cat();
        a.sound();
        a1.sound();
    }
}
