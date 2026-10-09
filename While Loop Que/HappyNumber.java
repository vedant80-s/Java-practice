// This program checks whether a number is a Happy Number.
// A Happy Number eventually reaches 1 when replaced by the sum of the squares of its digits repeatedly.
// If it loops endlessly in a cycle that does not include 1, it is Not Happy.
// Sample Output:
// Input: 19 → Output: Happy
// Input: 4 → Output: Not Happy

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        
        HashSet<Integer> seen = new HashSet<>();
        int current = num;
        
        while (current != 1 && !seen.contains(current)) {
            seen.add(current);
            int sum = 0;
            while (current > 0) {
                int digit = current % 10;
                sum += digit * digit;
                current /= 10;
            }
            current = sum;
        }
        
        System.out.println(current == 1 ? "Happy" : "Not Happy");
    }
}