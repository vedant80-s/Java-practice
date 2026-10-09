// This program finds all consecutive number sequences whose sum equals a given number.
// It checks each starting point and accumulates the sum until it matches the target.
// Sample Output:
// Input: 15
// Output: 1 to 5 4 to 6 7 to 8

import java.util.Scanner;

public class ConsecutiveSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        
        long start = 1;
        while (start < n) {
            long sum = 0;
            long current = start;
            while (sum < n) {
                sum += current;
                if (sum == n) {
                    System.out.print(start + " to " + current + " ");
                    break;
                }
                current++;
            }
            start++;
        }
        System.out.println();
    }
}