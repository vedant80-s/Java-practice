import java.util.Scanner;
public class FindNUmIsZeroPositiveNegative{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter Number 1");        
int a = Sc.nextInt();
if (a > 0) {
     System.out.println("The Number is Positive");
    }else if (a == 0) {
    System.out.println("The Number is Zero");
    }else{
    System.out.println("The Number is Negative");
    }}}