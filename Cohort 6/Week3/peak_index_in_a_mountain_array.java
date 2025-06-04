//  https://leetcode.com/problems/peak-index-in-a-mountain-array/

class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        // 0 ms, faster than 100.00%
        // 39.4 MB, less than 89.79%
        
        /*
        Can use slopes to know which direction to go in.
        If the element is in a downward slope, peak is to the left, and vice versa.
        If both elements the elements to the left & right of current element are lesser, then that is the peak.
        */
        
        int lo = 0, hi = nums.length - 1;
        int mid;
        
        while( lo <= hi )
        {
            mid = (lo + hi) / 2;
            
            if(nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid])  // peak
                return mid; 
            if(nums[mid + 1] < nums[mid])  // downward slope
                hi = mid;
            else if(nums[mid - 1] < nums[mid])  // upward slope
                lo = mid;
        }
        
        return -1;
    }
}
