import java.util.Scanner;
public class StringMatchWala{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter String");
String A = Sc.next();
if (A.equalsIgnoreCase("Java")) {
            System.out.println("Input matches 'Java'.");
        } else {
            System.out.println("Input does not match 'Java'.");
        }
    }} 