package inheritence_que;
class Animal {
    void eat(){
        System.out.println("Eat");
    }
}
class Mamal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}
class Dog extends Mamal{
}
public class Que3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.walk();
    }
}
