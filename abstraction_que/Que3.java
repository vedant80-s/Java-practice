abstract class Shape {
    abstract double area();
}

class CircleShape extends Shape {
    double radius;

    CircleShape(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class RectangleShape extends Shape {
    double length, width;

    RectangleShape(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

class Que3{
    public static void main(String[] args) {
        Shape c = new CircleShape(5);
        Shape r = new RectangleShape(4, 6);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
    }
}