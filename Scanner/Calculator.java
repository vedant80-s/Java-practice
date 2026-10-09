import java.util.Scanner;
public class Calculator{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter Number 1");        
int a = Sc.nextInt();
System.out.println("Enter Number 2");                
int b = Sc.nextInt();
System.out.println("Enter Number 1 For Addition");
System.out.println("Enter Number 2 For Subtraction");
System.out.println("Enter Number 3 For Multiplication");
System.out.println("Enter Number 4 For Division");
int c = Sc.nextInt();
        switch (c) {
        case 1: {int add = a + b ;
                System.out.println(add); // Result print
                break;
            }
        case 2: {int sub = a - b;
                System.out.println(sub); // Result print
               break;
            }
        case 3: {int mul = a * b;
                System.out.println(mul); // Result print
                break;
            }
        case 4: {int div = a / b;
                System.out.println(div); // Result print
                break;
            }
        default:
                System.out.println("Enter Number Between 1 to 4 ");
        }
    }
}