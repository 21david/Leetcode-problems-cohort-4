/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/

class Solution {
    
    public int maxProfit(int[] prices) {
        
        // Accepted
        // 6 ms, faster than 17.5%
        // 42.5 mb, less than 5.31%
        
        // memoization: make another array that stores the highest value after each element.
        // traverse array backwards, looking out for new maximums
        // set the current found maximum (as you are traversing backwards) in the memoized array
        // then use this array to find out which pair of numbers gives the highest maximum
        // O(N) + O(N) with this approach
        
        if(prices.length == 0)
            return 0;
        
        int[] maxAfter = new int[prices.length];
        
        int max = prices[prices.length - 1];
        
        for(int i = prices.length - 2; i >= 0; i--)
        {
            max = Math.max(max, prices[i]);
            
            maxAfter[i] = max;
        }
        
        System.out.println(Arrays.toString(maxAfter));
        
        int maxProfit = 0;
        
        // use the memoized array to find the max profit
        for(int i = 0; i < prices.length; i++)
        {
            maxProfit = Math.max(maxProfit, maxAfter[i] - prices[i]);
            
        }
        
        return maxProfit;
        
    }
    
    
    public int maxProfit2(int[] prices) {
        
        // Accepted
        // 315 ms, faster than 5.03%
        // 42.5 mb, less than 5.31%
        
        // O(N^2) solution
        int max = 0;
        for(int i = 0; i < prices.length; i++)
        {
            for(int j = i + 1; j < prices.length; j++)
            {
                if(prices[j] - prices[i] > max)
                    max = prices[j] - prices[i];
            }
        }
        
        return max;
    }
}
