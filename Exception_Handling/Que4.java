package Exception_Handling;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        try {
            int c = a/b ;
            System.out.println("Result: " + c);
        }catch (ArithmeticException e) {
            System.out.println("Result: Infinity");
        }finally{
            System.out.println("Finally Opreation Complete");
        }
        sc.close();
    }
}