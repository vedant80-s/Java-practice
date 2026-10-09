class User4 {
    static String name = "Aryan" ;
}
public class Que4 {
    public static void main(String[] args) {
        User4 s1 = new User4();
        User4 s2 = new User4();
        User4 s3 = new User4();
        System.out.println(s1.name);      
        System.out.println(s2.name);      
        System.out.println(s3.name);
        s1.name = "Abhiraj" ;       
        System.out.println(s1.name);      
        System.out.println(s2.name);      
        System.out.println(s3.name);
    }
}