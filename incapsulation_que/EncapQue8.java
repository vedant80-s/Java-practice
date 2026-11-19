
class Device{
    private boolean on;
    
    public void turnOn() { on = true; }
    public void turnOff() { on = false; }
    public boolean isOn() { return on; } 
}
public class EncapQue8 {
    public static void main(String[] args) {
        Device d = new Device();
        d.turnOff();
        d.turnOn();
        d.turnOff();
        d.turnOn();
        System.out.println(d.isOn());
    }
}
