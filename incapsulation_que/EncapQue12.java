
class Car{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed(int speed) {
        if(this.speed >= 120){
            System.out.println("Speed Limit is only 120 Km/h");
            return;
        }
        this.speed = this.speed + speed;
        System.out.println("Speed Increases Successful");
    }
    
}
public class EncapQue12 {

    public static void main(String[] args) {
        Car c =  new Car();
        System.out.println("Speed : " + c.getSpeed());
        c.increaseSpeed(10);
        System.out.println("Speed : " + c.getSpeed());
        c.increaseSpeed(10);
        System.out.println("Speed : " + c.getSpeed());
        c.increaseSpeed(10);
        System.out.println("Speed : " + c.getSpeed());
        c.increaseSpeed(10);
        System.out.println("Speed : " + c.getSpeed());
        c.increaseSpeed(10);
        System.out.println("Speed : " + c.getSpeed());
        c.increaseSpeed(10);
        c.increaseSpeed(10);
        c.increaseSpeed(10);
        c.increaseSpeed(10);
        c.increaseSpeed(10);
        c.increaseSpeed(10);
        c.increaseSpeed(10);
        c.increaseSpeed(10);
        System.out.println("Speed : " + c.getSpeed());
    }
}