class Solution {
    public int maxProfit(int[] prices) {

        int min=prices[0];
        int profit=0;
        for(int price:prices)
        {
            if(min>price)
            {
                min=price;
            }else{
                int currProfit=price-min;
                if(currProfit>profit)
                {
                    profit=currProfit;
                }
            }
        }
        return profit;
    }
}
