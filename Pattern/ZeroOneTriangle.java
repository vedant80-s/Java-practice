// This program prints a triangle pattern of 0s and 1s based on user input.
// The value at each position is determined by whether the sum of row and column indices is even or odd.
// If (i + j) is even → print 1, else → print 0.
// Example:
// Enter A Number : 5
//  1
//  0 1
//  1 0 1
//  0 1 0 1
//  1 0 1 0 1

import java.util.*;
public class ZeroOneTriangle {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                if((i + j) % 2 == 0){
                    System.out.print(" 1");
                } else {
                    System.out.print(" 0");
                }
            }
            System.out.print("\n");
        }
    }
}