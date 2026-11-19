package polymorphism_que;

class Parent23{
    void parentMethod(){
        System.out.println("Parent Method");
    }
}

class Child34 extends Parent23 {
    @Override
    void parentMethod() {
        System.out.println("Child Method");
    }
}

public class Que5 {
    public static void main(String[] args) {
        Parent23 p23 = new Child34();
        System.out.println(p23.toString());
        p23.parentMethod();
    }
}
