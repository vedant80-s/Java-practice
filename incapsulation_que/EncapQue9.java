
class Product{
    private int price ;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price < 0){
            System.out.println("Prize Does Not In Minus");
            return;
        }
        this.price = price;
    }

}
public class EncapQue9 {
    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(-23);
        p.setPrice(23);
        System.out.println("Price : " + p.getPrice());
    }
}
