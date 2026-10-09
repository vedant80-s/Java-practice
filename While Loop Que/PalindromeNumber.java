// This program checks whether a given number is a palindrome.
// It reverses the digits and compares with the original number.
// Sample Output:
// Input: 121 → Output: true   (same forward and backward)
// Input: 123 → Output: false  (not a palindrome)

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println(original == reversed);
        sc.close();
    }
}