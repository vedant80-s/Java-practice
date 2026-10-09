public class Que6 {

    public static void main(String[] args) {
        String result = isPositive(3);
        System.out.println("Result :- " + result);
    }
    public static String isPositive(int a){
        if(a>0){
            return "Positive" ;
        }
        else{
            return "Negative" ;
        }
    }
}