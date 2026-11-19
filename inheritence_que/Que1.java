package inheritence_que;
class Animal{
    void eat(){
        System.out.print("eat");
    }
}
class Dog extends Animal{
}

public class Que1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}