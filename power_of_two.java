class Solution {
    public boolean isPowerOfTwo(int n) {
        // 8 ms, faster than 7.28%
        // 38.8 mb, less than 5.24%
        
        // If a number is a power of two, it's binary representation will only have exactly one 1.
        // (Only edge case is that the minimum integer value also only has one 1, but it is negative.)
        // We can use this to write a one line solution.
        
        return Integer.toBinaryString(n).replace("0","").length() == 1 && n != Integer.MIN_VALUE;
    }
}
