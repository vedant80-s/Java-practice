
class Rectangle {
    private int length ;
    private int width ;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void area(){
        System.out.println("Area is : " + length*width);
    }
}
public class EncapQue5 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.area();
        r1.setLength(5);
        r1.setWidth(5);
        r1.area();
    }
}
