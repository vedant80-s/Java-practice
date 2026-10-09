// This program finds the largest prime factor of a given number.
// It first removes all factors of 2, then checks odd factors up to √n.
// The last remaining factor is the largest prime.
// Sample Output:
// Input: 13195 → Output: 29
// Input: 100 → Output: 5
// Input: 97 → Output: 97

import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long largestPrime = -1;

        while (num % 2 == 0) {
            largestPrime = 2;
            num /= 2;
        }

        long factor = 3;
        while (factor * factor <= num) {
            while (num % factor == 0) {
                largestPrime = factor;
                num /= factor;
            }
            factor += 2;
        }

        if (num > 2) {
            largestPrime = num;
        }

        System.out.println(largestPrime);
        sc.close();
    }
}