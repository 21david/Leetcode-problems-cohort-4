/*
https://leetcode.com/problems/two-sum/
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(N^2) solution
        
        int sum = 0;
        for(int i = 0; i < nums.length - 1; i++)
        {
            sum = nums[i];
            for(int j = i + 1; j < nums.length; j++)
            {
                sum += nums[j];
                if(sum == target)
                    return new int[] {i, j};
                sum -= nums[j];
            }
        }
        
        return null;
    }
}
