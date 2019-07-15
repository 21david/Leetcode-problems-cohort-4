/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/

class Solution {
    public int maxProfit(int[] prices) {
        
        // recursion
        // Runtime: faster than 88.11% of all java
        if(prices.length <= 1)
            return 0;
        
        return maxProfitHelp(prices, prices.length - 2, prices[prices.length - 1], 0);
        
    }
    
    // iterate through the array (from right to left), trying to find a new maxProfit
    // currentMax stores the current maximum that is has found as it searches from right to left
    // (currentMax is like a memoized value, so that it doesn't have to look through the rest of 
    // the array to find the maximum each time)
    public int maxProfitHelp(int[] prices, int i, int currentMax, int maxProfit)
    {
        if(i < 0)
            return maxProfit;
        
        if(prices[i] > currentMax)
            currentMax = prices[i];
        
        if(currentMax - prices[i] > maxProfit)
            return maxProfitHelp(prices, i - 1, currentMax, currentMax - prices[i]);
        //                                                    update maxProfit
        
        return maxProfitHelp(prices, i - 1, currentMax, maxProfit);
    }  
    
    /*
        // using memoization 
        // Runtime: 1ms, faster than 88.07%
        if(prices.length <= 1)
            return 0;
        
        // memoize the maximum number after each element
        int[] maxAfterIndexI = new int[prices.length];
        
        int max = prices[prices.length-1];
        for(int i = prices.length - 2; i >= 0; i--)
        {
            if(prices[i] > max)
                max = prices[i];
            
            maxAfterIndexI[i] = max;
        }
        
        int maxProfit = 0;
        
        for(int i = 0; i < prices.length; i++)
        {
            if(maxAfterIndexI[i] - prices[i] > maxProfit)
                maxProfit = maxAfterIndexI[i] - prices[i];
        }
        
        return maxProfit;
        
    }
    */
    
    /*
    // O(N^2) solution
    // Runtime: 261 ms, faster than 5.02% of all java
    if(prices.length <= 1)
            return 0;
        int max = 0;
        
        for(int i = 0; i < prices.length - 1; i++)
        {
            for(int j = i + 1; j < prices.length; j++)
            {
                if(prices[j] - prices[i] > max)
                    max = prices[j] - prices[i];
            }
        }
        
        return max;
    }
    */
}
