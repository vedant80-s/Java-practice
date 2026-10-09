import java.util.Scanner;
public class Que6 {

    public static void main(String[] args) {
        System.out.print("Enter A Number :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter A Number :- ");
        int b = sc.nextInt();
        Que6 s = new Que6();
        int res = s.res(a, b);
        System.out.println("Result :- " + res);
        sc.close();
    }
    public int res(int a , int b){
        return a+b;
    }
}