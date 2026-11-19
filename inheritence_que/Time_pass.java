package inheritence_que;
class Parent23{
    void show(Object o) {
        System.out.println("Parent Object");
    }
}

class Child23 extends Parent23 {
    void show(String s) {
        System.out.println("Child String");
    }
}
public class Time_pass {
    public static void main(String[] args) {
        
        Parent23 p = new Child23();
        p.show("Hello");
    }
}