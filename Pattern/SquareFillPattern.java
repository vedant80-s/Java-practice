// This program prints a square pattern of asterisks (*) based on user input.
// Example:
// Enter A Number : 4
//  *  *  *  * 
//  *  *  *  * 
//  *  *  *  * 
//  *  *  *  * 

import java.util.*;
public class SquareFillPattern {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();
        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}