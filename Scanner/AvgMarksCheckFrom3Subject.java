import java.util.Scanner;
public class AvgMarksCheckFrom3Subject{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter 1st Subject Marks");
int a = Sc.nextInt();    
System.out.println("Enter 2nd Subject Marks");    
int b = Sc.nextInt();    
System.out.println("Enter 3rd Subject Marks");    
int c = Sc.nextInt();   
int avg = (a+b+c)/3;
if (avg >= 75){
    System.out.println("Distinct");
}else if(avg >= 60){
    System.out.println("First class");
}else if (avg >= 50){
    System.out.println("Second Class");
}else{
    System.out.println("Fail");
}}}