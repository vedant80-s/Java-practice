package Exception_Handling;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter Num 1: ");
        int a = sc.nextInt();
        System.out.print("Enter Num 2: ");
        int b = sc.nextInt();
        try {
           int c = a/b ;
           arr[6] = 45 ;
           System.out.println("Result: " + c); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (ArithmeticException ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        sc.close();
    }
}