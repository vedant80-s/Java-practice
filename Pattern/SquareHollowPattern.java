 // This program prints a hollow square pattern of asterisks (*) based on user input.
// The border of the square is filled with stars, and the inner area is left blank.
// Example:
// Enter A Number : 5
//  *  *  *  *  * 
//  *           * 
//  *           * 
//  *           * 
//  *  *  *  *  * 

import java.util.*;
public class SquareHollowPattern {
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = 1; i <= n ; i++){
            for (int j = 1 ; j <= n ; j++){
                if(i == 1 || i == n){
                    System.out.print(" * ");
                } else {
                    if(j == 1 || j == n){
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
