class Student {
    String studentName ;
    static String schoolName = "School Name";
    Student (String name){
        this.studentName = name ;
    }
}
public class Que2 {
    public static void main(String[] args) {
        Student s1 = new Student("Satyam");
        Student s2 = new Student("Kuldeep");
        System.out.println("Name "+s1.studentName);
        System.out.println("School Name : " + s1.schoolName);
        System.out.println("Name "+s2.studentName);
        System.out.println("School Name : " + s1.schoolName);
    }
}
