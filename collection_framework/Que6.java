/* 
 * Demonstrate LinkedList operations: addFirst, addLast, removeFirst, removeLast, and iterate in reverse.
 */

package collection_framework;

import java.util.LinkedList;
import java.util.ListIterator;

public class Que6 {
    public static void main(String[] args) {

        //Linked List Banayi
        LinkedList<Object> linkedList = new LinkedList<>();

        //Linked List Me Add Kiya 
        linkedList.add(34);
        linkedList.add("Hello");
        linkedList.add('C');
        
        //Linked List Ko Print Karaya 
        System.out.println(linkedList);

        //Linked List Ke First Me Add Kiya 
        linkedList.addFirst(100);

        //Linked List Ke Last Me Add Kiya 
        linkedList.addLast(23);
        
        //Print Kiya Linked List Ko
        System.out.println(linkedList);
        
        
        //Linked List Ke Last se Remove Add Kiya 
        linkedList.removeFirst();
        
        //Linked List Ke Last se Remove Add Kiya 
        linkedList.removeLast();
        
        //Print Kiya Linked List Ko
        System.out.println(linkedList);

        //List Ko Niche Se Iterate Karwaya
          
        ListIterator<Object> listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}   
