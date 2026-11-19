/* 
 * Create a TreeSet of Employee objects sorted by salary using a Comparator; add and remove employees.
 */

package collection_framework;

import java.util.TreeSet;

public class Que3 {
    public static void main(String[] args) {

        
        // Treeset Banaya with Comparator
        TreeSet<Employee> treeSet = new TreeSet<>((e1, e2) -> (int) (e1.salary - e2.salary));

        // TreeSet Me Add Kiya
        treeSet.add(new Employee(12000, "Harsh"));
        treeSet.add(new Employee(14000, "Klassan"));
        treeSet.add(new Employee(17000, "Abhisek"));
        treeSet.add(new Employee(11000, "Ishan"));
        treeSet.add(new Employee(19000, "Shivam"));

        // TreeSet Loop Chalaya
        for (Employee employee : treeSet) {
            System.out.println(employee);
        }

        System.out.println();

        // TreeSet Se Remove Kiya Employee Ko
        treeSet.remove(new Employee(12000, "Harsh"));

        // TreeSet Loop Chalaya
        for (Employee employee : treeSet) {
            System.out.println(employee);
        }
    }
}

// Class Banayi Employee Naam Ki
class Employee {

    // Variable
    double salary;
    String name;

    // Constructor
    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override // ToString Method Overrirde Ki Hai
    public String toString() {
        return "Employee [salary=" + salary + ", name=" + name + "]";
    }

}