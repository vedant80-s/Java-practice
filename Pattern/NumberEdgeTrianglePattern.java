// This program prints a centered numeric triangle pattern with 1s at the edges and (i-1) in the middle.
// The triangle grows row by row, forming a symmetric structure.
// Example:
// Enter A Number : 5
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 4 4 1

import java.util.*;
public class NumberEdgeTrianglePattern {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print(" ");
            }

            if (i == 1 || i == 2){
                for(int j = i ; j >= 1 ; j--){
                    System.out.print(" " + 1);
                }
            } else {
                System.out.print(" " + 1);
                for(int k = 2 ; k <= i - 1 ; k++){
                    System.out.print(" " + (i - 1));
                }
                System.out.print(" " + 1);
            }
            System.out.println();
        }
    }
}