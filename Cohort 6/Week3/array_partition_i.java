//  https://leetcode.com/problems/array-partition-i/

class Solution {
    public int arrayPairSum(int[] nums) {
        // 10 ms, faster than 95.04%
        // 41.8 MB, less than 30.62%
        
        /*
        If we sort, we can find the groups that will give the maximum sum of min(x, y)
        So we can sort, and add all the elements in even indices (0, 2, 4, ...)
        
        O(N*logN) time complexity
        O(1) space complexity
        */
        
        Arrays.sort(nums);
        
        int sum = 0;
        
        for(int i = 0; i < nums.length; i+=2)
            sum += nums[i];
        
        return sum;
    }
}
