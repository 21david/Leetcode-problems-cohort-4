/*
https://leetcode.com/problems/peak-index-in-a-mountain-array/
*/

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int increment = 0;
        
        // start looking from the center to save a lot of comparisons
        int med = A.length / 2;
        
        if(A[med] < A[med+1]) // if center is on a upward slope
            increment = +1; // search will look to the right
        else
            increment = -1; // search will look to the left
            
        // linearly search for the peak
        for(int i = med; i < A.length - 1; i += increment)
        {
            if(A[i] > A[i - 1] && A[i] > A[i + 1])
                return i;
        }
        
        return -1;
    }
    
}
