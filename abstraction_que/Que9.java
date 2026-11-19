// Encapsulation
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Abstraction
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Que9{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Rahul");
        System.out.println(p.getName());

        Animal a = new Dog();
        a.sound();
    }
}