class User {
    static int sumN(int n){
        if(n == 0){
            return n ; 
        }
        return n + sumN(n-1);
    }
}
public class Que8 {

    public static void main(String[] args) {
        System.out.println(User.sumN(7));
    }
}