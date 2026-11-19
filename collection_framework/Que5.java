/*
 * Use ConcurrentHashMap with multiple threads to update product stock concurrently.
 */
package collection_framework;

import java.util.concurrent.ConcurrentHashMap;

public class Que5 {
    public static void main(String[] args) {

        //COncurrrent HashMap Banaya (Ye ThreadSafe Hai Esme Add Or Remove Kar Sakte Hai iteration ke time pe)
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        //Value Dali Map Me
        map.put("ProductA", 100);
        map.put("ProductB", 200);

        // Thread 1 (decrease stock)
        Thread t1 = new Thread(() -> {
            map.compute("ProductA", (k, v) -> v - 10);
            map.compute("ProductB", (k, v) -> v - 20);
        });

        // Thread 2 (increase stock)
        Thread t2 = new Thread(() -> {
            map.compute("ProductA", (k, v) -> v + 50);
            map.compute("ProductB", (k, v) -> v + 30);
        });

        // Thread Start
        t1.start();
        t2.start();

        // wait for threads
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print Karaya Map
        System.out.println(map);
    }
}