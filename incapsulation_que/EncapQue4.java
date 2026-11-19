

class User {
    private String password ;

    public void setPassword(String password) {
        if(password != null && password.length() >= 8 ){
            this.password = password;
            System.out.println("Password Set Succesfully");
        }else{
            System.out.println("Password Must Be Greater Or Equal To 8 Words");
        }
    }
}
public class EncapQue4 {
    public static void main(String[] args) {
        User u = new User();
        u.setPassword(null);
        u.setPassword("KuchBhi1234567");
    }
}