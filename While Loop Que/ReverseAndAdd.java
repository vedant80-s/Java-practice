// This program performs the Reverse and Add process to find a palindrome number.
// It repeatedly reverses the digits of a number and adds it to the original until a palindrome is formed.
// It then prints the number of steps taken and the resulting palindrome.
//
// Sample Output:
// Input: 87
// Steps: 4
// Palindrome: 4884

import java.util.Scanner;

public class ReverseAndAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        scanner.close();
        
        int steps = 0;
        long original = num;
        
        while (!isPalindrome(num)) {
            long reversed = reverse(num);
            num += reversed;
            steps++;
        }
        
        System.out.println("Steps: " + steps);
        System.out.println("Palindrome: " + num);
    }
    
    private static boolean isPalindrome(long num) {
        return num == reverse(num);
    }
    
    private static long reverse(long num) {
        long reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}