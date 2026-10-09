public class Que4 {
    public static void main(String[] args) { 
        int[] arr = {1,2,3,4,5,6,67,8,89};
        printArray(arr, arr.length - 1);
    }
    static void printArray(int[] n , int i ){
        if(i < 0){
            return ;
        }
        printArray(n,i - 1);
        System.out.print(n[i] + " ");
    }
}