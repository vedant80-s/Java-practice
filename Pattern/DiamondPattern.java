// This program prints a diamond-shaped pattern of asterisks (*) based on user input.
// The pattern consists of an upper triangle and a lower inverted triangle.
// Example:
// Enter A Number : 4
//    * 
//   * * 
//  * * * 
// * * * * 
//  * * * 
//   * * 
//    * 

import java.util.*;
public class DiamondPattern {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        // Upper half of diamond
        for(int i = 1; i <= n ; i++){
            for(int k = 1 ; k <= n - i ; k++){
                System.out.print(" ");
            }
            for(int j = i ; j >= 1 ; j--){
                System.out.print(" *");
            }
            System.out.println();
        }

        // Lower half of diamond
        for(int l = n - 1; l >= 1 ; l--){
            for(int m = 1 ; m <= n - l ; m++){
                System.out.print(" ");
            }
            for(int v = l ; v >= 1 ; v--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}