// This program prints a left-aligned triangle star pyramid pattern.
// Each row has increasing stars, aligned with leading spaces to form a pyramid shape.
// Example for n = 5:
//     *
//    * *
//   * * *
//  * * * *
// * * * * *

import java.util.*;
public class TriangleStarPyramid {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();
        for(int i = 1; i <= n ; i++){
            for(int k = 1 ; k <= n-i ; k++){
                System.out.print(" ");
            }
            for(int j = i ; j >= 1 ; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}