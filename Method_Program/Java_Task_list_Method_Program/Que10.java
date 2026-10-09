import java.util.Scanner;
public class Que10 {

    public static void main(String[] args) {
        System.out.print("Enter A Number :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter A Number :- ");
        int b = sc.nextInt();
        System.out.print("Enter A Number :- ");
        int c = sc.nextInt();
        int res = Que10.res(a, b , c);
        System.out.println("Result :- " + res);
        sc.close();
    }
    public static int res(int a , int b , int c){
        if(a>b && a>c){
            return a ;
        }
        else if(b>a && b>c){
            return b ;
        }else{
            return c ;
        }
    }
}