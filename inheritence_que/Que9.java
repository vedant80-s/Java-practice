package inheritence_que;

abstract class Shape {
    abstract void area();  
}
class Circle extends Shape{
    @Override
    void area() {
        System.out.println("Area: " + 3.14 * 2 * 2);
    }
}
class Square extends Shape{
    @Override
    void area() {
        System.out.println("Area: " + 2*2);
    }
}
class Rectangle extends Shape{
    @Override
    void area() {
        System.out.println("Area: " + 2 * 4);
    }
}
public class Que9 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        Shape s3 = new Rectangle();
        s1.area();
        s2.area();
        s3.area();
    }
}