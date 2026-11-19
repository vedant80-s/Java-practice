
class Login{
    private String username ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        System.out.println("Username Updated");
    }
    
}
public class EncapQue10 {
    public static void main(String[] args) {   
        Login l1 = new Login();
        System.out.println(l1.getUsername());
        l1.setUsername("Madhav934");
        System.out.println(l1.getUsername());
    }
}