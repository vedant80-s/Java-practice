class Discount{
    static float discountRate = 25 ; 
    float productPrize ;
    float finalProductPrize ; 
}
public class Que3 {
    public static void main(String[] args) {
        final Discount s1 = new Discount();
        s1.productPrize = 340 ; 
        s1.finalProductPrize = s1.productPrize - (s1.productPrize * s1.discountRate / 100) ;
        System.out.println(s1.finalProductPrize);
        final Discount s2 = new Discount();
        s2.productPrize = 34 ; 
        s2.finalProductPrize = s2.productPrize - (s2.productPrize * s2.discountRate / 100) ;
        System.out.println(s2.finalProductPrize);
    }
}