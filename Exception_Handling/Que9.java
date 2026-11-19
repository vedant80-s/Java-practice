package Exception_Handling;

public class Que9 {
    public static void main(String[] args) {
        Que9.a();
    }
    static void a(){
        Que9.b();
    }
    static void b(){
        Que9.c();
    }
    static void c(){
        Que9.testExceptions();
    }
    static void testExceptions() {
        throw new IllegalArgumentException();
    }
}
