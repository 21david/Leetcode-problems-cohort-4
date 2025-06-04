/*
https://leetcode.com/problems/binary-search/
*/

class Solution {
    public int search(int[] nums, int target) {
        // Accepted
        // 0 ms, faster than 100%
        // 42.8 mb, less than 5.41%
        
        int low = 0, high = nums.length - 1;
        int med;
        
        while(low <= high)
        {
            med = (low + high) / 2;
            
            if(nums[med] == target)
                return med;
            else if(nums[med] > target) // then target is to the left
                high = med - 1;
            else if(nums[med] < target) // then target is to the right
                low = med + 1;
        }
        
        return -1;
    }
    
    // test to see runtime difference
    public int searchLinear(int[] nums, int target)
    {
        
        // 1 ms, faster than 10.55%
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
                return i;
            
        }
        
        return -1;
    }
}
