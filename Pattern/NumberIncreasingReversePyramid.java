// This program prints a reverse pyramid of increasing numbers starting from 1.
// Each row starts at 1 and goes up to the current row limit, decreasing row by row.
// Example:
// Enter A Number : 5
//  1 2 3 4 5
//  1 2 3 4
//  1 2 3
//  1 2
//  1

import java.util.*;
public class NumberIncreasingReversePyramid {
            
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = n; i >= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}