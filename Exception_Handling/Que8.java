package Exception_Handling;

import java.util.Scanner;

class InvalidAge extends RuntimeException{
    @Override
    public String getMessage() {
        return "Age Must Be Greater Than 18" ;
    }
}
public class Que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
        if(a < 18){
            sc.close();
            throw new InvalidAge();
        }
        System.out.println("Age is: " + a);
        sc.close();
    }
}
