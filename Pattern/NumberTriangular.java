// This program prints a right-aligned triangular pattern of repeated numbers.
// Each row contains the row number printed multiple times, aligned to the right.
// Example:
// Enter A Number : 5
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 

import java.util.*;
public class NumberTriangular {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = 1; i <= n ; i++){
            for (int k = 1 ; k <= n - i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}