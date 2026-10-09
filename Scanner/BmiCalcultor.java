import java.util.Scanner;
public class BmiCalcultor{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.print("Enter Heigth In Meter : ");
double a = Sc.nextDouble();
System.out.print("Enter Weight In Kilogram : ");
double b = Sc.nextDouble();
double bmi = b / (a * a);
System.out.println("Your BMI is: " + bmi);
if (bmi < 18.5) {
System.out.println("Underweight");
} else if (bmi >= 18.5 && bmi < 25) {
System.out.println("Normal weight");
} else {
System.out.println("Overweight");
}}}
