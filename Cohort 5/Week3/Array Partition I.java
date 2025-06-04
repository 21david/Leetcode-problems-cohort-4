/*
https://leetcode.com/problems/array-partition-i/
*/

class Solution {
    public int arrayPairSum(int[] nums) {
        // Accepted
        // 10 ms, faster than 94.63%
        // 42.9 mb, less than 14.29%
        
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i+= 2)
            sum += nums[i];
        
        return sum;
    }
}
