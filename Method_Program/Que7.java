public class Que7 {

    public static void main(String[] args) {
        String result = isAge(18);
        System.out.println("Result :- " + result);
    }
    public static String isAge(int a){
        if(a>=18){
            return "Adult" ;
        }
        else {
            return "Not Adult"; 
        } 
    }
}