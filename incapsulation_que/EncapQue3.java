
class College{
    private String collegeName ;
    public String getCollegeName() {
        return collegeName;
    }
    College(){
        collegeName = "Sant Singaji Institute Of Science & Management" ;
    }
    
}
public class EncapQue3 {
    public static void main(String[] args) {
        College c = new College();
        System.out.println(c.getCollegeName());
    }
}
