//  https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {
        // 0 ms, faster than 100.00%
        // 40.4 MB, less than 62.31% 
        
        int lo = 0, hi = nums.length - 1;
        int mid;
        
        while( lo <= hi )
        {
            mid = (lo + hi) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target) // then target is to the right
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        
        return -1;
    }
}
