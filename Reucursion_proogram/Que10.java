class User {
    public static int res(int n , int res){
        if(n == 0 ){
            return n ;
        } 
        res = res*10 + n%10 ;
        return  res(n/10, res) ;
    }
}
public class Que10 {
    
    public static void main(String[] args) {
        int n = 1234 ; 
        int res = 0 ;
        res = User.res(n , res);
        System.out.println("Reverse Number :- " + res );
    }
}