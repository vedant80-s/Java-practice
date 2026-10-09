import java.util.Scanner;
public class Que11 {

    public static void main(String[] args) {
        System.out.print("Enter A Number :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter A Number :- ");
        int b = sc.nextInt();
        int res = Que11.res(a, b);
        System.out.println("Result :- " + res);
        sc.close();
    }
    public static void greet(){
        System.out.println("---: Welcome To Java Method Question :---");
    }
    public static int res(int a , int b){
        Que11.greet();
        return a+b;
    }
}