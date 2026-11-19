package Exception_Handling;

import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        int[] arr = new int[5];
        String string = sc.nextLine();
        System.out.print("Enter Index: ");
        int index = sc.nextInt();
        try {
            arr[index] = 65 ;
            string.length();
            sc.close();
            throw new exception();

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NullPointerException ex){
            System.out.println("You Cannot Call Method On Null String ." 
                        + "\nException Name: " + ex.getMessage()
            );
        } catch (exception re){
            System.out.println("Exception: " + re.getMessage());
        }
        sc.close();
    }
}
