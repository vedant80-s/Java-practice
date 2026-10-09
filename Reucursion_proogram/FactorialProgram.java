import java.util.Scanner;

class multi {
    public static double fact(int n){
        if(n == 0 || n == 1){
            return n ; 
        }
        else{
            return n*fact(n-1);
        }
    }
}
public class FactorialProgram {

    public static void main(String[] args) {
        System.out.print("Enter A number :- ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        double result = multi.fact(n1);
        System.out.println("Result :- " + result);
        sc.close();
    }
}