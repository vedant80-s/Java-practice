

class Student100{
    private int age ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }else{
            System.out.println("Invalid Age");
        }
    }
}


public class EncapQue2 {
    public static void main(String[] args) {
        Student100 s1  = new Student100();
        s1.setAge(-100);
        s1.setAge(23);
        System.out.println(s1.getAge());
    }
}



/*
 * int age ; 
 */