/* 
 * Create a HashMap of books (title → author) and sort entries by key using TreeMap.
 */

package collection_framework;

import java.util.HashMap;
import java.util.TreeMap;

public class Que7 {
    public static void main(String[] args) {

        //HashMap Banaya 
        HashMap<String , String> hashMap = new HashMap<>();

        //HashMap Me Add Kiya 
        hashMap.put("Kushal", "The Red Book");
        hashMap.put("Kunal", "The White Book");
        hashMap.put("Ghosling", "The Brown Book");
        hashMap.put("James", "The Figure Book");
        hashMap.put("Bhuvam", "The Java Object");

        //Print Kiya HashMap
        System.out.println(hashMap);
        
        //TreeMap Banaya Or Usme HashMap Ke Saare Element Daal Diye
        TreeMap<String , String> treeMap = new TreeMap<>(hashMap);
        
        //Print Kiya TreeMap Ko
        System.out.println(treeMap);
    }
}
