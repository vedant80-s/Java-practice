// This program prints a mirrored triangle star pattern resembling the letter 'K'.
// It first prints a decreasing triangle, then an increasing triangle below it.
// Example for n = 5:
//  * * * * *
//  * * * *
//  * * *
//  * *
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *

import java.util.*;
public class KPattern {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        // Upper half: decreasing triangle
        for(int i = n; i >= 1 ; i--){
            for(int j = i ; j >= 1 ; j--){
                System.out.print(" *");
            }
            System.out.println();
        }

        // Lower half: increasing triangle
        for(int i = 2 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}