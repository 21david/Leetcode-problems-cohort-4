class Solution {
    public int singleNumber(int[] nums) {
        // 1 ms, faster than 66.31%
        // 44.2 mb, less than 7.07%

        int x = 0;
        
        for(int n : nums)
            x ^= n;
        
        return x;
    }
}
