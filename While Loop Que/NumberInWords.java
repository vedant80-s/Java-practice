// This program converts a numeric input into its word representation digit by digit.
// It uses an array of word mappings for digits 0–9 and constructs the output in correct order.
// Sample Output:
// Input: 405 → Output: Four Zero Five
// Input: 1209 → Output: One Two Zero Nine

import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        
        if (num == 0) {
            System.out.println("Zero");
            return;
        }
        
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int digit = num % 10;
            if (result.length() > 0) {
                result.insert(0, " ");
            }
            result.insert(0, words[digit]);
            num /= 10;
        }
        
        System.out.println(result.toString());
    }
}