/*
https://leetcode.com/problems/peak-index-in-a-mountain-array/
*/

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        // Accepted
        // 0 ms, faster than 100%
        // 41.1 mb, less than 6%
        
        
        int low = 0, high = A.length - 1;
        int med;
        
        while(low <= high)
        {
            med = (low + high) / 2;
            
            // if peak, return med
            if(A[med] > A[med - 1] && A[med] > A[med + 1])
                return med;
            
            // if on an upward slope, make low = med + 1
            else if(A[med] > A[med - 1] && A[med] < A[med + 1])
                low = med + 1;
            
            // if on a downward slope, make high = med - 1
            else if(A[med] < A[med - 1] && A[med] > A[med + 1])
                high = med - 1;
        }
        
        return -1;
    }
}
