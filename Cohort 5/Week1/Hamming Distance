/*
https://leetcode.com/problems/hamming-distance/
*/

class Solution {
    
    public int hammingDistance(int x, int y) {
        // Accepted
        // 0 ms, faster than 100%
        // 36.5 mb, less than 5.09%
        
        int bit = 1;
        
        int count = 0;
        
        // check if the bits are different at every bit position
        // add 1 to count for every difference
        while((bit <= x || bit <= y) && bit >= 0)
        {
            if((bit & x) != (bit & y))
                count++;
            
            bit <<= 1;
        }
        
        return count;
        
    }
    
    public int hammingDistance4(int x, int y) {
        // Accepted
        // 1 ms, faster than 25.15%
        // 36.7 mb, less than 5.09%
        
        return Integer.toBinaryString(x^y).replace("0","").length();
    }
    
    public int hammingDistance2(int x, int y) {
        // Accepted
        // 0 ms, faster than 100%
        // 36.7 mb, less than 5.09%
        
        int bit = 1;
        
        // for each pair of bits that differ, there will be a 1 at that position in the xor result
        int xor = x ^ y;
        
        int count = 0;
        
        // gradually shift the xor to the right by 1, checking the rightmost digit for 0 or 1
        while(bit <= xor && bit >= 0)
        {
            if((bit & xor) == 1)
                count++;
            
            xor >>= 1;
        }
        
        return count;
        
    }
    
    public int hammingDistance3(int x, int y) {
        // Accepted
        // 0 ms, faster than 100%
        // 36.4 mb, less than 5.09%
        
        int bit = 1;
        
        // for each pair of bits that differ, there will be a 1 at that position in the xor result
        int xor = x ^ y;
        
        int count = 0;
        
        // shift the bit to the left by 1 each time to check every pair of bits
        while(bit <= xor && bit >= 0)
        {
            if((bit & xor) > 0)
                count++;
            
            bit <<= 1;
        }
        
        return count;
        
    }

}
