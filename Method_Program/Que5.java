public class Que5 {

    public static void main(String[] args) {
        int result = findSmallest(3, 2 , 6);
        System.out.println("Result :- " + result);
    }
    public static int findSmallest(int a , int b , int c ){
        if(a<b && a<c){
            return a ;
        }
        else if(b<a && b<c){
            return b ;
        }
        else{
            return c ;
        }
    }
}