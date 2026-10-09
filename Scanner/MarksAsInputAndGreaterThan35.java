import java.util.Scanner;
public class MarksAsInputAndGreaterThan35{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter 1st Subject Marks");
int marks1 = Sc.nextInt();
System.out.println("Enter 2nd Subject Marks");
int marks2 = Sc.nextInt();
System.out.println("Enter 3rd Subject Marks");
int marks3 = Sc.nextInt();
System.out.println("Enter 4th Subject Marks");
int marks4 = Sc.nextInt();
System.out.println("Enter 5th Subject Marks");
int marks5 = Sc.nextInt();
System.out.println("Enter 6th Subject Marks");
int marks6 = Sc.nextInt();
System.out.println("Enter 7th Subject Marks");
int marks7 = Sc.nextInt();
if (marks1 >= 35 && marks2 >= 35 && marks3 >= 35 && marks4 >= 35 && marks5 >= 35 && marks6 >= 35 && marks7 >= 35){
System.out.println("Pass");}
else {
System.out.println("Fail");}}}