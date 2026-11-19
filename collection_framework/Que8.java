/* 
 * Count word frequency in a List<String> using HashMap.
 */

package collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Que8 {
    public static void main(String[] args) {

        //ArrayList Banayi Or List Ke Refrence Me Store Kara Liya 
        List<String> list = new ArrayList<>();

        //ArrayList Me Add Kiya Element 
        list.add("Hello");
        list.add("Kesa");
        list.add("Bhai");
        list.add("Red");
        list.add("White");
        list.add("Yellow");
        list.add("Brown");

        //HashMap Banaya
        HashMap<String , Integer> hashMap = new HashMap<>();

        //Count Variable Banaya
        Integer count = 1 ;

        //For Loop Lagaya 
        for (int i = 0; i < list.size(); i++) {

            //Agar Pahle se Hai Key Toh Nahi Toh Else Chalega Or Put Karayega 
            if(hashMap.containsKey(list.get(i))){

                //Agar Pahle se Hai toh uski value ko +1 kar dega
                hashMap.replace(list.get(i), hashMap.get(list.get(i)) , hashMap.get(list.get(i))+ 1);
            }else{
                //Agar pahle se nahi hai toh daal dega usme
                hashMap.put(list.get(i), count);
            }
        }

        //Print Kiya Hai Map Ko 
        System.out.println(hashMap);
    }
}
