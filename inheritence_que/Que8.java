package inheritence_que;
class Parent8{
    void show(){
        System.out.println("Parent");
    }
}
class Child8 extends Parent8{
    @Override
    void show() {
        System.out.println("Child");
    }
}
public class Que8 {
    public static void main(String[] args) {
        Parent8 p8 = new Child8();
        p8.show();
        Child8 child8 = (Child8) p8 ;
        if(child8 instanceof Child8){
            child8.show();
        }
    }   
}
