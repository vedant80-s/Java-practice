import java.util.Scanner;
public class Que4 {

    public static void main(String[] args) {
        System.out.print("Enter A Number :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter A Number :- ");
        int b = sc.nextInt();
        int res = Que4.res(a, b);        
        System.out.println("Result of 2 digit :- " + res);
        System.out.print("Enter A Number :- ");
        int c = sc.nextInt();
        int res1 = Que4.res(a, b , c);
        System.out.println("Result of 3 digit :- " + res1);
        sc.close();
    }
    public static int res(int a , int b){
        return a+b;
    }
    public static int res(int a , int b , int c){
        return a+b+c;
    }
}