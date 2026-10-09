// This program prints a hollow triangle pattern aligned to the right.
// The triangle has stars on the borders and hollow space inside except for the first two and last rows.
// Example for n = 5:
//     *
//    * *
//   *   *
//  *     *
// * * * * *

import java.util.*;
public class HollowTrianglePattern {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();
        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            if (i == 1 || i == 2 || i == n){
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
    }
}