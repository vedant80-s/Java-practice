import java.util.Scanner;
public class Que7 {

    public static void main(String[] args) {
        System.out.print("Enter A Number :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter A Number :- ");
        int b = sc.nextInt();
        int res = Que7.res(a, b);
        System.out.println("Result :- " + res);
        sc.close();
    }
    public static int res(int a , int b){
        return a+b;
    }
}