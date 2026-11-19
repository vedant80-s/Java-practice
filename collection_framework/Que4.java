/*
 * Merge two ArrayLists of integers, remove duplicates with HashSet, and sort in descending order.
 */

package collection_framework;
import java.util.ArrayList;
import java.util.HashSet;



public class Que4 {

    public static void main(String[] args) {

        //ArrayList Banayi
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        //ArrayList Me Add Kiya
        arrayList.add(10);
        arrayList.add(23);
        arrayList.add(12);
        arrayList.add(40);
        arrayList.add(67);
        
        //Dusri ArrayList Banayi
        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList);

        //ArrayList Me Add Kiya 
        arrayList2.add(23);
        arrayList2.add(67);
        arrayList2.add(45);
        arrayList2.add(12);
        arrayList2.add(34);

        //HashSet Banaya (Unique Value Store Krta Hai , Unorderd)
        HashSet<Integer> hashSet = new HashSet<>(arrayList2);

        //Third ArrayList Banayi
        ArrayList<Integer> arrayList3 = new ArrayList<>(hashSet);

        //Sort Kiya Hai 
        arrayList3.sort((i1 , i2) -> i2 - i1);

        //Print Kiya ArrayList 3 Ko 
        System.out.println(arrayList3);
    }
}