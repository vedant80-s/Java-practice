package polymorphism_que;

interface Drawable {
    void draw();    
}

class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
public class Que8 {
    public static void main(String[] args) {
        Drawable dc = new Circle();
        Drawable dr = new Rectangle();
        dc.draw();
        dr.draw();
    }
}
