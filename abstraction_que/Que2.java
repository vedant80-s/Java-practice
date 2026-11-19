interface Drawable {
    void draw();
}

class Que2 {
    public static void main(String[] args) {
        Drawable c = new Circle();
        Drawable r = new Rectangle();

        c.draw();
        r.draw();
    }
}


class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}