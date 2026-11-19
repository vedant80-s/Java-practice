package inheritence_que;
class Parent{
    int age ;
    void show(){
        System.out.println("Show");
    }
    Parent(){
        age = 24 ;
    }
}
class Child extends Parent{
    int age ;
    @Override
    void show() {
        super.show();
        System.out.println("Child");
        System.out.println("Age: " + super.age);
        System.out.println("Age: " + age);
    }
    Child(){
        age = 34 ;
    }
}
public class Que5 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}