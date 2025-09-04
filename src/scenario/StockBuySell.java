package scenario;

public class StockBuySell {

//    static int maxProfit(int[] prices) {
//
//        if(prices == null || prices.length <=1){
//            return 0;
//        }
//        int minPrice = prices[0];
//        int maxProfit = 0;
//        for (int i=1; i<prices.length; i++){
//            minPrice = Math.min(prices[0], prices[i]);
//            int currentProfit = prices[i] - minPrice;
//            maxProfit=Math.max(maxProfit, currentProfit);
//        }
//        return maxProfit;
//    }
    static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i=1;i< prices.length;i++){
            if(prices[i] < buy){
                buy=prices[i];
            }
            else if(prices[i]-buy > profit){
                profit=prices[i]-buy;
            }
        }

        return profit;
    }


    public static void main(String[] args) {
        int[] prices = {1,4,7,6,9,7};
        //System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices));


    }
}

