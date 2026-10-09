// This program prints a reverse right-angled triangle pattern of asterisks (*) based on user input.
// The number of stars decreases with each row from top to bottom.
// Example:
// Enter A Number : 5
//  *  *  *  *  * 
//  *  *  *  * 
//  *  *  * 
//  *  * 
//  * 

import java.util.*;
public class ReverseRightHalfPattern {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = n; i >= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}