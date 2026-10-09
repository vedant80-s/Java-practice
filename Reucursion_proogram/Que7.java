class User {
    static void num(int n){
        if(n == 0){
            return ;
        }
        num(n-1);
        System.out.println(n + " ");
    }
}
public class Que7 {
    public static void main(String[] args) {
        User.num(5);
    }
}