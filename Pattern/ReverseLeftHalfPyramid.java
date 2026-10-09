// This program prints a reverse left half pyramid of stars aligned to the right.
// Each row starts with increasing spaces and decreasing stars, forming an inverted triangle.
// Example for n = 5:
//  * * * * *
//    * * * *
//      * * *
//        * *
//          *

import java.util.*;
public class ReverseLeftHalfPyramid {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = n ; i >= 1 ; i--){
            // Print leading spaces
            for(int k = 1 ; k <= n - i ; k++){
                System.out.print("  ");
            }
            // Print stars
            for(int j = i ; j >= 1 ; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}