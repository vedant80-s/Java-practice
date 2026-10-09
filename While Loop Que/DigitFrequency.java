// This program calculates the frequency of each digit in a given number.
// It uses an array to count how many times each digit (0–9) appears.
// Sample Output:
// Input: 12022
// Output:
// 0: 1  
// 1: 1  
// 2: 3

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] freq = new int[10];
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            freq[digit]++;
            temp /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + ": " + freq[i]);
            }
        }

        sc.close();
    }
}