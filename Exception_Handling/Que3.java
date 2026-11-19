package Exception_Handling;

public class Que3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[6] = 98 ;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}