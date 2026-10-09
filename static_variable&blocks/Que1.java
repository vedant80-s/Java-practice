class StaticExample{
    static int count ;
    StaticExample(){
        count++ ;
    }
} 
public class Que1 {
    public static void main(String[] args) {    
        StaticExample s1 = new StaticExample();
        System.out.println("Count : " + s1.count);
        StaticExample s2 = new StaticExample();
        System.out.println("Count : " + s2.count);
        StaticExample s3 = new StaticExample();
        System.out.println("Count : " + s3.count);
    }
}