import java.util.Scanner;
public class Circle&Square{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter 1 For Circle & 2 For Square");
int a = Sc.nextInt();    
System.out.println("Enter Radius If You Enter 1 & Side If You Enter 2");    
int b = Sc.nextInt(); 
System.out.println("Enter 1 If You Choose Circle OR For Square Enter 2 ");   
int c = Sc.nextInt();
switch (c) {
    case 1: {double area = 3.14 * b * b;
        System.out.println("Area Of Circle Is : " + area);
        break;}
    case 2:{int area = b*b;
    System.out.println("Area Of Square Is : " + area);
        break;}
    default:System.out.println("Invalid Number");
        break;
}}} 