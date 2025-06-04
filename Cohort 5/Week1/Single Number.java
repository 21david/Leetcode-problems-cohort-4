/*
https://leetcode.com/problems/single-number/
*/

class Solution {
    public int singleNumber(int[] nums) {
        
        // Accepted
        // 0 ms, faster than 100%
        // 42.1 mb, less than 5.19%
        
        // xor-ing two equal numbers results in 0
        // this extends to xor-ing many numbers, all pairs of equal numbers will cancel out
        // so xor-ing all numbers in the array will result in the single one
        
        int xor = 0;
        for(int n : nums)
            xor ^= n;
        
        return xor;
    }
}
