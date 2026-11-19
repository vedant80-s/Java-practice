package polymorphism_que;

abstract class Shape {
    abstract void area();
} 

class Circle extends Shape{
    int radius ;
    Circle(int radius){
        this.radius = radius ;
    }
    @Override
    void area() {
        System.out.println("Area Of Circle: " + 3.14 *radius*radius);
    }
}

class Rectangle extends Shape{
    int length , width ;
    Rectangle(int length , int width){
        this.length = length ;
        this.width = width ;
    }
    @Override
    void area() {
        System.out.println("Area Of Rectangle: " + length*width);
    }
}
public class Que9 {
    public static void main(String[] args) {
        Shape s = new Rectangle(34, 67);
        Shape s1 = new Circle(34);
        s.area();
        s1.area();
    }
}
