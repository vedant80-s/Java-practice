// Java program to check if a number contains any repeating digits.
// It uses a boolean array to track digits 0–9.
// If any digit is repeated, it prints true; otherwise, false.
//
// Sample Input/Output:
// Input: 12341 → Output: true   (digit '1' repeats)
// Input: 9876543210 → Output: false   (all digits are unique)

import java.util.Scanner;

public class DetectRepeatingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Input number
        boolean[] seen = new boolean[10]; // Track digits 0–9
        boolean hasRepeat = false; // Flag for repetition

        while (num > 0) {
            int digit = num % 10; // Extract last digit
            if (seen[digit]) { // Check if already seen
                hasRepeat = true;
                break;
            }
            seen[digit] = true; // Mark digit as seen
            num /= 10; // Remove last digit
        }

        System.out.println(hasRepeat); // Output result
        sc.close();
    }
}