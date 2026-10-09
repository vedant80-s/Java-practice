// This program prints a number-increasing pyramid pattern based on user input.
// Numbers increment continuously across rows, forming a triangular shape.
// Example:
// Enter A Number : 4
//  1
//  2 3
//  4 5 6
//  7 8 9 10

import java.util.*;
public class NumberChangingPyramid {
                
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();
        int v = 0;

        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                v = v + 1;
                System.out.print(" " + v);
            }
            System.out.print("\n");
        }
    }
}