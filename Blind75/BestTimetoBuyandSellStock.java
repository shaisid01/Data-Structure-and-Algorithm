/*121. Best Time to Buy and Sell Stock
 * 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 * 
 */

package Blind75;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {10,2,6,1,3,7};
		//System.out.println("Max Profit: "+ maxProfit(prices));
		
		prices = new int[]{10,2,6,1,3,7};
		System.out.println("Max Profit: "+ maxProfit1(prices));
	}

	
	public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        int profitToday = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
            	minPrice = prices[i];
            }
            profitToday = prices[i] - minPrice;
            if(profit < profitToday){
            	profit = profitToday;
            }
        }
        return profit;
    }
	
	 public static int maxProfit1(int[] prices) {
	        int min_price = prices[0];
	        int maxprof = 0;

	        for(int i=1;i<prices.length;i++){
	            maxprof = Math.max(maxprof,prices[i]-min_price);
	            min_price = Math.min(prices[i],min_price);
	        }

	        return maxprof;
	    }
}
