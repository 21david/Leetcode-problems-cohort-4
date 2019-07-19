/*
https://leetcode.com/problems/next-greater-element-i/submissions/
*/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     //   Runtime: 10 ms, faster than 7.48%
        
        int[] ans = new int[nums1.length];
        int k = 0;
        for( int n : nums1 )
        {
            boolean found = false;
            int nextGreater = -1;
            for(int i = 0; i < nums2.length; i++)
            {
                if(nums2[i] == n)
                {
                    found = true;
                    continue;
                }
                
                if(found && nums2[i] > n)
                {
                    nextGreater = nums2[i];
                    break;
                }
            }
            
            ans[k++] = nextGreater;
        }
        
        return ans;
    }
    
}
