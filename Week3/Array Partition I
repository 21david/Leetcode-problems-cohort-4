/*
https://leetcode.com/problems/array-partition-i/submissions/
*/

class Solution {
    public int arrayPairSum(int[] nums) {
        // sort
        Arrays.sort(nums);
        
        int sum = 0;
        
        // iterate trough every 2 numbers, adding the minimum to sum
        for(int i = 0; i < nums.length; i += 2)
            sum += Math.min(nums[i], nums[i + 1]);
        
        return sum;
    }
}
