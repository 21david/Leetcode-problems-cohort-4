/*
https://leetcode.com/problems/subsets/submissions/
*/

class Solution {
    
    List<List<Integer>> sets = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> subsets(int[] nums) {
        find(0, nums, "");
        return sets;
    }
    
    public void find(int start, int[] nums, String set)
    {
        if(start == nums.length)
        {
            if(set.equals("")) // empty set case
            {
                sets.add( new ArrayList<>() );
                return;
            }
            
            String[] split = set.split(" ");
            ArrayList<Integer> subset = new ArrayList<Integer>();
            
            for(int i = 0; i < split.length; i++)
            {
                subset.add( Integer.parseInt(split[i]) );
            }
            
            sets.add(subset);
            
            return;
        }
        
        
        // recursive call not including the current element
        find(start + 1, nums, set);
        
        // recursive call including the current element
        set += nums[start] + " ";
        
        find(start + 1, nums, set);
    }
}
