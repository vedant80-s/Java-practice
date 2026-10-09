import java.util.Scanner;
public class TemperatureWala{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.print("Enter Temperature Here : ");
double temp = Sc.nextDouble();
if (temp < 0) {
            System.out.println("Freezing");
} else if (temp <= 15) {
            System.out.println("Cold"); 
} else if (temp <= 30) {
            System.out.println("Warm"); 
} else {
            System.out.println("Hot");
}}}

