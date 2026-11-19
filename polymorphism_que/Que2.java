package polymorphism_que;

class Calculator {
    int add(int a , int b){
        return a+b ;
    }
    double add(double a , double b ){
        return a+b ;
    }
    int add(int a , int b , int c){
        return a+b+c ;
    }
}
public class Que2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int a = c.add(3,4) ;
        double a1 = c.add(3,4.0) ;
        int a2 = c.add(3,4 , 7) ;
        System.out.println(a + " \n" + a1 + " \n" + a2);
    }
}