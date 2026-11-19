/* 
 * Create a TreeSet of integers and display subsets using headSet() and tailSet().
 */

package collection_framework;

import java.util.TreeSet;

public class Que10 {
    public static void main(String[] args) {

        // TreeSet Banaya
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Elements add Kiya 
        treeSet.add(45);
        treeSet.add(17);
        treeSet.add(23);
        treeSet.add(67);
        treeSet.add(56);

        // TreeSet Print
        System.out.println(treeSet);
        
        // HeadSet
        System.out.println(treeSet.headSet(23));

        // TailSet
        System.out.println(treeSet.tailSet(23));
    }
}
