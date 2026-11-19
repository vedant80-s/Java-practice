package inheritence_que;
final class Parent7{
    final void show(){
        System.out.println("Parent");
    }
}
class Parent77{
    final void show(){
        System.out.println("Parent");
    }
}
class Child extends Parent77{
//    void show() Cannot override the final method from Parent77
}
// class Child extends Parent7 (The type Child cannot subclass the final class Parent7)
public class Que7 { 
}