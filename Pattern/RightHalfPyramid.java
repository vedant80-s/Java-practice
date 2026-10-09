// This program prints a right-angled triangle pattern of asterisks (*) based on user input.
// Each row contains an increasing number of stars from top to bottom.
// Example:
// Enter A Number : 5
//  * 
//  *  * 
//  *  *  * 
//  *  *  *  * 
//  *  *  *  *  * 

import java.util.*;
public class RightHalfPattern {
                    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}