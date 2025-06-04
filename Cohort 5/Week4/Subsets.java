/*
https://leetcode.com/problems/subsets/
*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        // Accepted
        // 19 ms, faster than 5.9%
        // 42.5 mb, less than 5.74%
        
        // this approach use binary numbers to find all subsets
        // all binary numbers from 0 to the 2^(length of array) - 1 give a different subset, where a 1 means to include the number in that position and 0 means don't include
        //so i work my way up from 0 and use the binary numbers to create a subset, then add that subset to the final list
        
        if(nums.length == 0)
        {
            ArrayList<List<Integer>> subsets = new ArrayList<>();
            subsets.add(new ArrayList<>()); // represents the empty set
            return subsets;
        }
        
        int length = nums.length;
        
        int num = 0;
    
        int upper = (int) Math.pow(2, nums.length);
        
        ArrayList<List<Integer>> subsets = new ArrayList<>();
        
        while(num < upper)
        {
            // make sure string is of length 4 is nums is length 4, etc
            String binary = String.format("%"+ (nums.length) +"s\n", Integer.toBinaryString(num));
            
            ArrayList<Integer> currentSubset = new ArrayList<>();
            
            // iterate through nums, include the number if a '1' in the binary string is found in same position
            for(int i = 0; i < nums.length; i++)
            {
                if(binary.charAt(i) == '1')
                    currentSubset.add(nums[i]);
            }
            
            subsets.add(currentSubset);
            
            num++;
        } 
        
        return subsets;
    }
}
