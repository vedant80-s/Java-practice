package Exception_Handling;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        try {
            int c = a/b ;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("You Cannot " + e.getMessage());
        }
        sc.close();
    }
}