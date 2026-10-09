// This program prints a rhombus-shaped pattern of asterisks (*) based on user input.
// Each row is indented to create the slanted effect of a rhombus.
// Example:
// Enter A Number : 4
//  * * * * 
//   * * * * 
//    * * * * 
//     * * * * 

import java.util.*;
public class RhombusPattern {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();

        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" ");
            }
            System.out.print(" * * * * \n");
        }
    }
}