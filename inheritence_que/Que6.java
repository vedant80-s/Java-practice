package inheritence_que;
class Parents{
    protected void show(){
        System.out.println("Show");
    }
}
class Childs extends Parents{
    @Override
    protected void show() {
        super.show();
        System.out.println("Child");
        System.out.println("Can not reduce access modifier");
    }
}
public class Que6 {
    public static void main(String[] args) {
        Childs c = new Childs();
        c.show();
    }
}