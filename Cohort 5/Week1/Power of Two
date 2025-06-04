/*
https://leetcode.com/problems/power-of-two/
*/
class Solution {
    
    public boolean isPowerOfTwo(int n) {
        // Accepted
        // 1 ms, faster than 100%
        // 37.1 mb, less than 7.32%
        
        int test = 1;
        
        while(test > 0)
        {
            if (test == n)
                return true;
            test <<= 1;
        } 
        
        return false;
    }
    
    /*
    public boolean isPowerOfTwo(int n) {
        // Accepted
        // 3 ms, faster than 5.48%
        // 37.2 mb, less than 7.32%
        
        return n > 0 && Integer.toBinaryString(n).replace("0","").length() == 1;
    }
    */
}
