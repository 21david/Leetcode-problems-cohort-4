/*
https://leetcode.com/problems/next-greater-element-i/
*/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        // Accepted
        // 2 ms, faster than 98.615
        // 41.4 mb, less than 7.41%
        
        
        if(nums2.length == 0)
            return new int[] {};
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums2.length - 1; i++)
        {
            int cur = nums2[i];
            int nextGreater = -1;
            
            int j = i + 1;
            while(j < nums2.length && nums2[j] < cur)
                j++;
            
            if(j < nums2.length)
                nextGreater = nums2[j];
            
            // after while stops, j should be on next greatest integer or out of bounds
            
            map.put(cur, nextGreater);
            
            
            
        }
        
        map.put(nums2[nums2.length - 1], -1); // last one will always map to -1
        
        
        // now just construct the output using this map
        
        int[] ans = new int[nums1.length];
        
        for(int i = 0; i < nums1.length; i++)
            ans[i] = map.get(nums1[i]);
        
        return ans;
    }
    
    
}
