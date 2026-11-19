
class Employee{
    private String name ;
    private String id ;
    Employee(){
        id = "VFX123";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
}
public class EncapQue7 {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.getId());
        e.setName("Rahul");
    }
}
