/*
https://leetcode.com/problems/set-mismatch/
*/
class Solution {
    public int[] findErrorNums(int[] nums) {
        
        // an array the same length as nums, that will store the count of how many n's there are at index (n - 1)
		    // (like a multiset)
        
        int[] count = new int[nums.length];
        
        for(int n : nums)
            count[n - 1]++;
        
        // there should be exactly 1 element with a count of 2 and exactly 1 element with a count of 0
        int[] ans = new int[2];
        
        for(int i = 0; i < count.length; i++)
        {
            if(count[i] == 2) // duplicate element
                ans[0] = i + 1;
            else if(count[i] == 0) // missing element
                ans[1] = i + 1;
        }
        
        return ans;
        
    }
}
