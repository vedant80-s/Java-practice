/*   // This program checks whether a given positive number is an Armstrong number using do-while loops.
// It first counts the number of digits, then calculates the sum of each digit raised to that count.
// If the sum equals the original number, it is identified as an Armstrong number.
// Sample Output:
// Enter A Positive Number Only : 
// 153
// Number of digit in number : 3
// Sum : 27
// Sum : 152
// Sum : 153
// It Is Armstrong Number

import java.util.*;
public class ArmstrongNumberRange {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter A Positive Number Only : ");
        int n = Sc.nextInt();
        int i = 0 ;
        int j = n ;
        int sum = 0 ;
        int ns = n;
        do{
            if (ns == 0){
                break;}
            ns = ns / 10 ;
            i++;
        }while(ns>0 || ns<0);
        System.out.println ("Number of digit in number : " + i );
        do{
            int c = j%10 ; 
            c = (int)Math.pow(c , i);
            sum = sum + c;
            System.out.println("Sum : " + sum);
            j = j/10 ;
        }while(j != 0 );
        if(sum == n){ 
            System.out.println("It Is Armstrong Number");
        }
        if(sum != n){
            System.out.println("It Is Not Armstrong Number");
Sc.close();
        }
    }
}





import java.util.Scanner;

public class ArmstrongNumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
	System.out.println(num) ;
	num++ ; 
	System.out.println(num) ;
	System.out.println(++num);
	System.out.println(num++) ;}}






import java.util.Scanner;

public class ArmstrongNumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
	System.out.println(num) ;
	num-- ; 
	System.out.println(num) ;
	System.out.println(--num);
	System.out.println(num--);
*/




import java.util.Scanner;

public class ArmstrongNumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
	int rev = 0 ;
	int i = num ; 
do{
rev = rev*10 + i%10 ;
i = i / 10 ;}while(i!=0);
if(rev == num ){
System.out.println("Number " + num + " is Pallindrome.");}else{
System.out.println("Number " + num + " is Not Pallindrome.");}}}