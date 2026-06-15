public class discountAmount {
    public static void main(String[] args){
        int fee = 125000;
        int discountpercentage = 10;
        
        double discount = (fee * discountpercentage) / 100;
        System.out.println("Discount Amount is: " +  discount  +  " and final discounted fee is: " + (fee - discount));
    }
    
}
