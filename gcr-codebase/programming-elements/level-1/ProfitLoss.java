public class ProfitLoss {
    public static void main(String[] args) {
        //Assigning the value to variables
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculating the profit and Profit percentage
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
       
        //Display the output
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice );
        System.out.println("TThe Profit is INR " + profit + " and the Profit Percentage is  " + profitPercentage );
                
    }
}