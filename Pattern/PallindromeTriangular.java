// This program prints a centered palindrome triangle pattern based on user input.
// Each row displays numbers in decreasing order from the row number to 1,
// followed by increasing numbers from 2 back to the row number, forming a symmetric pattern.
// Example:
// Enter A Number : 5
//         1 
//       2 1 2 
//     3 2 1 2 3 
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5 

import java.util.*;
public class PallindromeTriangular {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = 1; i <= n ; i++){
            for (int k = 1 ; k <= n - i ; k++){
                System.out.print("  ");
            }
            for(int j = i ; j >= 1 ; j--){
                System.out.print(j + " ");
            }
            if (i > 1 && i <= n){
                for (int j = 2 ; j <= i ; j++ ){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}