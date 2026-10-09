import java.util.Scanner;
public class Que12 {

    public static void main(String[] args) {
        System.out.print("Enter A Number :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean res = Que12.res(a);
        System.out.println("Result :- " + res);
        sc.close();
    }
    public static boolean res(int a){
        for(int i = 2 ; i < a ; i++){
            if(a%i != 0) continue;
            else return false ;
        }
        return true;
    }
}