//  https://leetcode.com/problems/partition-equal-subset-sum/

class Solution {
    public boolean canPartition(int[] nums) {
        // Time Limit Exceeded
        // 90/105 test cases passed
        /*
        1. Get the sum of all elements
        2. Divide it by 2
            - if odd, return false
            - if even, continue
        3. Try to find a subset that adds to half of the sum
            - if found, return true
            - if never found, return false
        */
        
        int sum = 0;
        
        for(int n : nums)
            sum += n;
        
        if(sum % 2 == 1)
            return false;
        
        int half = sum / 2;
        
        
        // now we need to find any subset of nums that adds to 'half'
        
        return finder(int[] nums, boolean[] used, int target);
    }
    
    public boolean finder(int[] nums, boolean[] used, int target) {
        
        // we will recursively subtract all elements in num from target, call finder again
        // with a lower target value, and repeat until we either reach a base case of 0
        // (meaning there is a way to partition into 2 equal sum subsets) or until we
        // run out of numbers to try. Another base case for this function is target becoming
        // less than 0.
        
        if(target == 0)
            return true; // if we run into a 0, the answer to the whole problem is 0, so we want to stop everything & return true
        else if(target < 0)
            return false; // means we didn't find anything
        
        boolean ans = false;
        
        for(int i = 0; i < nums.length; i++) {
            
            if(used[i])
                continue;
            
            used[i] = true;
            
            ans |= finder(nums, used, target - nums[i]);
            
            if(ans)
                return true;
            
            used[i] = false;
        }
        
        return ans;
    }
}

/*

Test cases:

true:
[1,5,11,5]
[1,2,3,4,5,6,7]
[5,10,1,6,3,7,4,1,1,3,1]
[4,1,3,7,12,13,14]
[3,43,1,6,2,4,12,8,7,1,5,9,12,11,10,4,3,2,7,12,4,1,6,12,6,14,65,12,3,75,3,5,8,2,7,3]

false:
[3]
[1,2]
[1, 2, 3, 5]
[5,3,6,9,4,1,76,56,4,4,2,7,14,5,4,8,7,3,5,4,1,6,8,7,45,5,6,4,5,7,8,6,4,5,7,8,6,4,5,4,8,7,6,5,4,5,7,6,8,7,8]
[1,1,1,1,1]
[3,3,1]
[1,2,3,4,5]
[1,2,3,4,5,6]
[1,2,3,4,5,6,7,8]
[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,100]

*/
