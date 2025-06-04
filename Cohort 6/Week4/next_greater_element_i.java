class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 6 ms, faster than 31.74%
        // 41.4 mb, less than 5.13%
        
        // O(N^2) solution
        
        int[] ans = new int[nums1.length];
        
        for(int i = 0; i < nums1.length; i++)
        {
            
            // find current num in nums2
            int j = 0; 
            while(j < nums2.length && nums1[i] != nums2[j])
                j++;
            
            int max = nums1[i];
            
            j++;
            
            // find the next greater element
            while(j < nums2.length)
            {
                if(nums2[j] > max)
                {
                    max = nums2[j];
                    break;
                }
                j++;
             }
            
            if(j == nums2.length) // if it did not find a greater element
                ans[i] = -1;
            else            
                ans[i] = max;
            
        }
        
        return ans;
    }
}

/*

Test cases:

[4,1,2]
[1,3,4,2]
[5, 2, 7, 5]
[5, 4, 3, 2, 1, 6, 7, 6, 5, 8]


*/
