import java.util.Scanner;
public class Que15 {

    public static void main(String[] args) {
        Que15 s = new Que15();
        s.res();
        System.out.print("Enter A Number :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter A Number :- ");
        int b = sc.nextInt();
        int res = Que15.res(a, b);
        System.out.println("Result :- " + res);
        sc.close();
    }
    public static int res(int a , int b){
        return a+b;
    }
    public void res(){
        System.out.println("---: Welcome To Sum Programm :---" );
    }
}