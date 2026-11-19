abstract class Employee {
    abstract void calculateSalary();
}

class PermanentEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Permanent Employee Salary: 50000");
    }
}

class ContractEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Contract Employee Salary: 30000");
    }

}

class Que6{
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee();
        Employee e2 = new ContractEmployee();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}