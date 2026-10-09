import java.util.Scanner;
public class Que14 {

    public static void main(String[] args) {
        System.out.print("Enter A Number :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter A Number :- ");
        int b = sc.nextInt();
        long res = Que14.res(a, b);
        System.out.println("Result :- " + res);
        int res1 = Que14.res(a, 5);
        System.out.println("Result :- " + res1);
        sc.close();
    }
    public static int res(int a , int b){
        return a+b;
    }
    public static long res(long a , long b){
        return a+b;
    }
}