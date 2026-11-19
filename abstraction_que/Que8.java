abstract class Cal {

    abstract int add(int a, int b);

    abstract int subtract(int a, int b) ;
}

class Calculator extends Cal{

    @Override
    int add(int a, int b) {
        return a + b ;
    }

    @Override
    int subtract(int a, int b) {
        return a - b ;
    }

}

class Que8{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 3));
        System.out.println(c.subtract(5, 3));
    }
}