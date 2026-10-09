// This program prints a number-increasing pyramid pattern based on user input.
// Each row starts from 1 and increases up to the row number.
// Example:
// Enter A Number : 5
//  1
//  1 2
//  1 2 3
//  1 2 3 4
//  1 2 3 4 5

import java.util.*;
public class NumberIncreasingPyramid {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}