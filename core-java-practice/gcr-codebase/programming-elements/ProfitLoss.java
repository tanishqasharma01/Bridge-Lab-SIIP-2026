public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (double) (profit) / costPrice * 100;
        System.out.println("Profit is : " + profit);
        System.out.println("Profit percentage is : " + profitPercentage + "%");
    }
    
}
