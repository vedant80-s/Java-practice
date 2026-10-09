import java.util.Scanner;
public class Que8 {

    public static void main(String[] args) {
        System.out.print("Enter A Number :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = Que8.res(a);
        System.out.println("Factorial of " + a + " :- " + res);
        sc.close();
    }
    public static int res(int a){
        int fact =  1 ;
        for(int i = 1 ; i <= a ; i++){
            fact = fact*i; 
        }
        return fact ;
    }
}