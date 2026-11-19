package polymorphism_que;

public class Que7 {
    public static void main(String[] args) {
//       Parent23 p27 = new Parent23();
        Parent23 p28 = new Child34();
//       Child34 child34 = (Child34) p27 ;  class polymorphism_que.Parent23 cannot be cast to class polymorphism_que.Child34
        Child34 child35 = (Child34) p28 ;
//       System.out.println(child34);
        System.out.println(child35);
    }
}