package inheritence_que;
class Shape{
    double area = 4 ;
    void area(){
        System.out.println("Area is: " + area);
    }
}
class Circle extends Shape {
    double area = 7.9 ;
    @Override
    void area(){
        System.out.println("Area is: " + area);
    }
}
class Rectangle extends Shape {
    double area = 5;
    @Override
    void area(){
        System.out.println("Area is: " + area);
    }
}
public class Que4 {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();
        c.area();
        r.area();   
    }
}
