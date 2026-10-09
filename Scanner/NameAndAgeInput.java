import java.util.Scanner;
public class NameAndAgeInput{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter Your Age : ") ;
byte age = Sc.nextByte();
System.out.println("Enter Your Name : ") ;
String name = Sc.next();
System.out.println("Your Name Is : " + name);
System.out.println("Your Age Is : " + age);

}}
