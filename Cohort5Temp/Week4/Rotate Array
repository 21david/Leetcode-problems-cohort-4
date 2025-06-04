/*
https://leetcode.com/problems/rotate-array/
*/

class Solution {
    public void rotate(int[] nums, int k) {
        // Accepted
        // 0 ms, faster than 100%
        // 42.4 mb, less than 5.77%
        
        k = k % nums.length;
        
        int[] temp = new int[k];
        int t = 0;
        
        // store the last k elements in nums into temp
        for(int i = nums.length - k; i < nums.length; i++)
            temp[t++] = nums[i];
        
        // shift other elements in nums to the right by k
        for(int i = nums.length - 1 - k ; i >= 0; i--)
            nums[i + k] = nums[i];
        
        // copy temp into the front of nums
        for(int i = 0; i < temp.length; i++)
            nums[i] = temp[i];
    }
}
