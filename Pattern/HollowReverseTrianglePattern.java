// This program prints a hollow reverse triangle pattern of asterisks (*) based on user input.
// The top, second, and bottom rows are solid; the middle rows are hollow with stars only at the edges.
// Example:
// Enter A Number : 5
//  * * * * * 
//   *     * 
//    *   * 
//     * * 
//      * 

import java.util.*;
public class HollowReverseTrianglePattern {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = n; i >= 1 ; i--){
            for(int j = n - i ; j >= 1; j--){
                System.out.print(" ");
            }

            if (i == 1 || i == 2 || i == n){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(" *");
                }
            } else {
                System.out.print(" *");
                for(int k = 2 ; k <= i - 1 ; k++){
                    System.out.print("  ");
                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}