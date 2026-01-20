// Last updated: 1/20/2026, 11:02:42 AM
1/**
2 * @param {number[]} prices
3 * @return {number}
4 */
5var maxProfit = function(prices) {
6    let profit = 0;
7    for(let i = 1;i < prices.length; i++){
8        if(prices[i] > prices[i-1]){
9            profit += prices[i] - prices[i-1];
10        }
11    }
12    return profit;
13};