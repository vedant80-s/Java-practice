class User {
    static void fabo(int a , int b , int n , int i){
        if(i > n){
            return ; 
        }
        System.out.print(a + " ");
        fabo(b , a+b , n , i+1); 
    }
}
public class Que9 {

    public static void main(String[] args) {
        int n = 5;
        System.out.print("Fibonacci Series: ");
        User.fabo(0 , 1 , 10 , 1);
    }
}