/*
https://leetcode.com/problems/set-mismatch/
*/

class Solution {
    public int[] findErrorNums(int[] nums) {
        
        // Accepted
        // 1700 ms, faster than 5.11%
        // 42.4 mb, less than 14.29%
        
        // runtime due to O(N^2) complexity
        
        int[] ans = new int[2];
        
        boolean found = false;
        for(int i = 1; i <= nums.length; i++)
        {
            found = false;
            
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[j] == i)
                    found = true;
                
                
            }
            
            if(!found)
                ans[1] = i;
            
            
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[j] == nums[i])
                    ans[0] = nums[j];
                
                
            }
        }
        
        return ans;
        
    }
}
