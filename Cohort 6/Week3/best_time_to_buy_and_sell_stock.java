//  https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        // 14 ms, faster than 16.16%
        // 42.4 MB, less than 5.02%
        
        // for each element, what is the min of all elements to its left (including the element itself)?
        // make an array with the same size and answer the question for each element
        // the maximum of this array is the max profit.
        // O(N) time complexity
        // O(N) space complexity
        
        if(prices.length == 0)
            return 0;
        
        int[] mins = new int[prices.length];
        
        int min = prices[0];
        mins[0] = min;
        
        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] < min)
                min = prices[i];
            
            mins[i] = min;
        }
        
        
        // now we find the maximum difference between the two arrays
        // (we could make a 'difference array' and return the maximum of that one
        // but that would take up more space)
        int max = prices[0] - mins[0];
        
        for(int i = 1; i < prices.length; i++)
        {
            if((prices[i] - mins[i]) > max)
                max = prices[i] - mins[i];
        }
        
        System.out.println(Arrays.toString(mins));
        
        return max;
    }
}
