/*
https://leetcode.com/problems/binary-search/
*/

class Solution {
    public int search(int[] nums, int target) {
        // binary search
        // 0 ms, 100% faster than all java submissions
        
        int low = 0, high = nums.length - 1;
        int med;
        
        while(low <= high)
        {
            med = (high + low) / 2;
            
            if(nums[med] == target)
                return med;
            else if(nums[med] < target)
                low = med + 1;
            else
                high = med - 1;
        }
        
        return -1;
    }
    
    /*
        // linear search
        // 1 ms, faster than 8.76% of all java submissions
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
                return i;
        }
        
        return -1;
    }
    */
}
