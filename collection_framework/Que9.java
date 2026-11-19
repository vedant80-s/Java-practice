/*
 * Implement a Deque using ArrayDeque; add tasks at the end and process from both ends.
 */

package collection_framework;

import java.util.ArrayDeque;

public class Que9 {
    public static void main(String[] args) {

        //Array Deque Ka Object Banaya (Jisme Dono Side se remove karwa sakte hai)
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        //Add karaya Element ko array deque me 
        arrayDeque.add(23);
        arrayDeque.add(47);
        arrayDeque.add(34);
        arrayDeque.add(45);
        arrayDeque.add(12);

        //Print karaya pura deque ko 
        System.out.println(arrayDeque);
        
        //Pahle Wala Remove karaya
        System.out.println(arrayDeque.pollFirst());
        
        //Last Wala Remove karaya
        System.out.println(arrayDeque.pollLast());
        
        //Print karaya pura deque ko 
        System.out.println(arrayDeque);
    }
}