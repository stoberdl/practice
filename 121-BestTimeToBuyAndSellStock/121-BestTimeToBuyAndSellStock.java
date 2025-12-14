// Last updated: 12/14/2025, 5:56:04 PM
class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
       // int min = 999999;
        int maxProfit = 0;
         while(right != prices.length){
            if(prices[left] < prices[right]){
                int profit =  prices[right] - prices[left]; 
                maxProfit = profit > maxProfit ? profit: maxProfit; 
            }else{
                left = right;
            }
            right++;
         }
   
         return maxProfit;
    }
}