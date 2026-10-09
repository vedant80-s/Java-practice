// This program prints a right-aligned left half pyramid using stars (*).
// It takes an integer input 'n' and prints 'n' rows of stars with proper spacing.

import java.util.*;
public class LeftHalfPyramid {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = 1; i <= n ; i++){
            for(int k = 1 ; k <= n - i ; k++){
                System.out.print("  ");
            }
            for(int j = i ; j >= 1 ; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}