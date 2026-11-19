

class Student {
    private final int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class EncapQue13 {
    public static void main(String[] args) {
        Student s1 = new Student(67001);
        s1.setName("Rahul");
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
    }
}