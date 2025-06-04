/*
https://leetcode.com/problems/partition-equal-subset-sum/
*/

class Solution {
    
    public boolean canPartition(int[] nums) {
        // find sum of all elements
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
            sum += nums[i];

        if(sum % 2 == 1)
            return false;

        
        // target sum is half of the sum
        int targetSum = sum / 2;

        // if any one element in the array is > the targetSum, it isn't possible to split into two equal subsets
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > targetSum)
                return false;
        }
        
        Arrays.sort(nums);
        
        return subsets(nums.length - 1, nums, 0, targetSum);
    }

    public boolean subsets(int start, int[] nums, int subsetSum, int targetSum)
    {
        if(subsetSum > targetSum)
            return false;
        else if(subsetSum == targetSum)
            return true;
        else if(start == -1)
            return false;

        return subsets(start - 1, nums, subsetSum + nums[start], targetSum) 
            || subsets(start - 1, nums, subsetSum              , targetSum);
    }
    
}
