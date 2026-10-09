// This program prints a reverse number triangle pattern aligned to the right.
// Each row starts with increasing spaces and prints numbers from the current row index to n.
// Example for n = 5:
//  1 2 3 4 5
// 2 3 4 5
//  3 4 5
//   4 5
//    5
/* 
import java.util.*;
public class ReverseNumberTrianglePattern {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.print("Enter A Number : ");
        int n = Sc.nextInt();
        int va = 0;
        for(int l = 1 ; l <= n ; l++){
            if(l == 1){
                System.out.print(" ");
            } else {
                for(int m = 1 ; m <= l ; m++){
                    System.out.print(" ");
                }
            }
            for(int v = l ; v <= n ; v++){
                va = va + v ;
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
*/


import java.util.*;
public class Practice {
    
public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter A Number : ");
    int n = Sc.nextInt();
    int i = n ;
    int zero = 0 ;
    int one = 0 ;
    int two = 0 ;
    int three = 0 ;
    int four = 0 ;
    int five = 0 ;
    int six = 0 ;
    int seven = 0 ;
    int eight = 0 ;
    int nine = 0 ;
    while(i!= 0){
        int ns = i % 10 ;
       switch (ns) {
        case 0:
            zero++;
            break;
        case 1 :
        one++;
        break;
        case 2 : 
        two++;
        break;
        case 3 :
        three++;
        break;
        case 4 :
        four++;
        break;
        case 5 : 
        five++;
        break;
        case 6 :
        six++; 
        break ;
        case 7 : 
        seven++;
        break;
        case 8 : 
        eight++;
        break;
        case 9: nine++;
        break ; 
        default:
            break;
       }
                i = i / 10 ;
        }
    System.out.println("Zero : " + zero);
    System.out.println("One : " + one);
    System.out.println("Two : " + two);
    System.out.println("Three : " + three);
    System.out.println("Four : " + four);
    System.out.println("Five : " + five);
    System.out.println("Six : " + six);
    System.out.println("Seven : " + seven);
    System.out.println("Eight : " + eight);
    System.out.println("Nine : " + nine);
}}