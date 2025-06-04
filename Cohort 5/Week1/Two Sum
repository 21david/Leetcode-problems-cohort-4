/*
https://leetcode.com/problems/two-sum/
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Accepted
        // 79 ms, faster than 5.80%
        // 39.8 mb, less than 5.65%
        
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            // look for an element such that temp + that element = target
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        
        return ans;
    }
}
