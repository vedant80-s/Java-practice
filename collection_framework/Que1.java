/* 
 * Maintain a LinkedHashMap of students and marks; remove students with marks <50 using Iterator.
 */


package collection_framework;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Que1 {

    public static void main(String[] args) {

        // LinkedHashMap Banaya Hai (Insertion Order Maintain Karta Hai)
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();


        
        //Linked Hash Map Me Value Dali 
        linkedHashMap.put("Aryan", 23);
        linkedHashMap.put("Kuldeep", 87);
        linkedHashMap.put("Gojo", 34);
        linkedHashMap.put("Pogo", 67);
        linkedHashMap.put("Nick", 45);
        linkedHashMap.put("Sonic", 27);

        //Print Karaya Yaha Pe 
        System.out.println(linkedHashMap);

        //KeySet me Change Kiya Hai 
        Set<String> keyset = linkedHashMap.keySet();

        //Iterator Object Return Kiya 
        Iterator<String> iterator = keyset.iterator();

        //Loop Chalaya
        while (iterator.hasNext()) {
            String temp = iterator.next();
            if(linkedHashMap.get(temp) < 50) iterator.remove(); // Remove kiya Key Ko LinkedHashMap Se
        }

        //Updated LinkedHashMap Print
        System.out.println(linkedHashMap);
    }
}