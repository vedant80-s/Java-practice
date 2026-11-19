package Exception_Handling;

import java.util.Scanner;

class exception extends RuntimeException {
    @Override
    public String getMessage() {
        return "Negative Number is Came" ;
    }
}
public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
        if(a < 0){
            sc.close();
            throw new exception();
        }
        } catch (exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}