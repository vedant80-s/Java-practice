// This program prints a hollow diamond pattern of asterisks (*) based on user input.
// The top and bottom rows are solid; middle rows are hollow with stars only at the edges.
// Example:
// Enter A Number : 5
//     * 
//    * * 
//   *   * 
//  *     * 
// *       * 
//  *     * 
//   *   * 
//    * * 
//     * 

import java.util.*;
public class HollowDiamondPattern {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        // Upper half of diamond
        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print(" ");
            }

            if (i == 1 || i == 2){
                for(int j = i ; j >= 1 ; j--){
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

        // Lower half of diamond
        for(int i = n - 1 ; i >= 1 ; i--){
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print(" ");
            }

            if (i == 1 || i == 2){
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