//  https://leetcode.com/problems/subsets/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // 0 ms, faster than 100.00%
        // 39.4 MB, less than 86.99%
        
        /*
        Two possible approaches:
        1. terate through all binary numbers from 0 to 2^(nums.length)
        Each of these binary numbers represents a subset, where
        1 means include the number and 0 means don't.
        
        2. Make an set that will store all the subsets, and initially place just the empty set.
        Iterate through each number, and for each set in the list, make a version that adds that number
        and a version that doesn't add that number (although in practice this 2nd version is already in the set.
        so just making a version that adds the number works).
        
        2nd approach is implemented below.
        */
        
        List<List<Integer>> subsets = new ArrayList<>();
        
        ArrayList<Integer> empty = new ArrayList<>();
        
        subsets.add(empty);
        
        // iterate through each number and make a version of each subset that adds this number
        // ('subsets' will double in size for each number)
        for(int num : nums)
        {
            int len = subsets.size(); // iterate only through subsets already in 'subsets'
            for(int i = 0; i < len; i++)
            {
                ArrayList<Integer> current = (ArrayList<Integer>) subsets.get(i);
                
                // make a version that adds 'num'
                ArrayList<Integer> newSet = new ArrayList<>();
                newSet.addAll(current);
                newSet.add(num);
                
                // add that subset to 'subsets'
                subsets.add(newSet);
            }
        }
        
        return subsets;
    }
}
