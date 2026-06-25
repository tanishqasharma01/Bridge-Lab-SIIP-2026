
interface CouponValidator{

    //Abstract method
    boolean ValidateCoupon(String code);

    //static method
    static boolean isLengthValid(String code){
        return code.length() >=5;
    }

}

//implement the interface in a class ShoppingCart
class ShoppingCart implements CouponValidator{

    @Override
    public boolean ValidateCoupon(String code){
        return CouponValidator.isLengthValid(code);
    }

}
public class shoppingWebsite {
    public static void main(String[] args){

        //store coupon in strings
        String[] coupons = {"SAVE10","AB", "DISCOUNT","XYZ","HELLO"

        };
        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons){
            if(cart.ValidateCoupon(coupon)){
                
                System.out.println(coupon + " valid");

            }else{
                System.out.println(coupon + " invalid");
            }
        }

    }
    
}
