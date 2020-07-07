class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // 13 ms, faster than 40.34%
        // 44.9 mb, less than 5.04%
        
        /*
        O(N) solution:
        Create a HashMap, with each element in nums as the key, and it's 
        corresponding index as the value. This operation is O(N).
        Iterate through nums, and for each element x, search for (target - x)
        in the HashMap. If it is found, then we know the indices of the
        two numbers that add up to target. The iteration is O(N) in the worst case.
        */
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
            hashMap.put(nums[i], i);
        
        System.out.println(hashMap);
        
        for(int i = 0; i < nums.length; i++)
        {
            if(hashMap.containsKey(target - nums[i]) && hashMap.get(target - nums[i]) != i)
                return new int[] {i, hashMap.get(target - nums[i])};
        }
        
        return null;
    }
}
