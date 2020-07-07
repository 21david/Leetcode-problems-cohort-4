class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // 2 ms, faster than 71.70%
        // 39.5 mb, less than 77.37%
        
        /*
        O(N) solution:
        Create a HashMap, with each element in nums as the key, and it's 
        corresponding index as the value. This operation is O(N).
        Iterate through nums, and for each element x, search for (target - x)
        in the HashMap. If it is found, then we know the indices of the
        two numbers that add up to target. The iteration is O(N) in the worst case.
        */
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);
        
        int complement;
        
        for (int i = 0; i < nums.length; i++)
        {
            complement = target - nums[i];
            
            if (map.containsKey(complement) && map.get(complement) != i)
                return new int[] { i, map.get(complement) };
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
}
