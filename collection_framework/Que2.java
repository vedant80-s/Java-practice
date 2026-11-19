/*
 * implement a PriorityQueue of Task objects and process tasks according to priority.
 * 
 */

package collection_framework;
import java.util.PriorityQueue;

public class Que2 {
    public static void main(String[] args) {
        
        //PriorityQueue Banaya
        PriorityQueue<Task> p = new PriorityQueue<>();

        //Add Liye Task Edhar 
        p.add(new Task(10));
        p.add(new Task(40));
        p.add(new Task(30));
        p.add(new Task(50));
        p.add(new Task(20));

        //Print Karaya Hai 
        System.out.println(p);

        //Remove Karaya 
        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.poll());
    }
}


//Task Class
class Task implements Comparable<Task> {

    //Variable
    int i;

    //Constructor
    Task(int i) {
        this.i = i;
    }


    @Override //Method ComapareTo ko Override Kiya Hai 
    public int compareTo(Task o) {
        return o.i - this.i;
    }

    @Override // ToString Method ko Override Kiya Hai
    public String toString() {
        return "Task [i=" + i + "]";
    }
}
