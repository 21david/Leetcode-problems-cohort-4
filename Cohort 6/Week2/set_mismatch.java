class Solution {
    public int[] findErrorNums2(int[] nums) {
        // 29 ms, faster than 7.89%
        // 54.4 MB, less than 5.55%
        
        // Time complexity: O(N)
        // Space complexity: O(N)
        
        // create a set that contains [1, 2, 3, ..., nums.length]  
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= nums.length; i++)
            set.add(i);
        
        int[] ans = new int[2];  // array to store final answer
        
        // iterate through nums, removing each element from the set
        for(int num : nums)
        {
            if(set.contains(num))
                set.remove(num);
            else
                ans[0] = num;  // if we see a # twice, we add to final array
        }
        
        // Get the remaining number from the set
        Iterator it = set.iterator();
        ans[1] = (int) it.next();  // the set contains the missing element
        
        
        return ans;
    }
    
    public int[] findErrorNums(int[] nums) {
        // 2 ms, faster than 89.93%
        // 40.9 MB, less than 65.52%
        
        /*
        This solution uses a boolean array instaed of a hashset.
        It performs much faster.
        */
        
        // Time complexity: O(N)
        // Space complexity: O(N)
        
        boolean[] set = new boolean[nums.length];
        Arrays.fill(set, true);
        
        
        int[] ans = new int[2];  // array to store final answer
        
        // iterate through nums, removing each element from the set
        for(int num : nums)
        {
            if(set[num - 1])
                set[num - 1] = false;
            else
                ans[0] = num;  // num occurs twice
        }
        
        
        // the array should have only 1 true value at this point
        // which is the missing element
        for(int b = 0; b < set.length; b++)
            if(set[b])
                ans[1] = b + 1;
        
        return ans;
    }
}
