/*
https://leetcode.com/problems/number-complement/
*/

class Solution {
    
    public int findComplement(int num) {
        // Accepted
        // 0 ms, faster than 100%
        // 36.5 mb, less than 8.70%
        
        // using bitwise operations
        
        
        int complement = 0;
        int bitTester = 1;
        
        while(bitTester <= num && bitTester >= 0)
        {
            if((num & bitTester) == 0)
                complement += bitTester;
            
            bitTester <<= 1;
        }
        
        return complement;
    }
    
    public int findComplement2(int num) {
        // Accepted
        // 0 ms, faster than 100%
        // 36.4 mb, less than 8.70%
        
        // using bitwise operations
        
        String bits = Integer.toBinaryString(num); // 7 -> "111"
        
        int complement = 0;
        int bitTester = 1;
        
        for(int i = 0; i < bits.length(); i++) // run once for each bit
        {
            if((num & bitTester) == 0)
                complement += bitTester;
            
            bitTester <<= 1;
        }
        
        return complement;
    }
    
    public int findComplement3(int num) {
        // Accepted
        // 11 ms, faster than 7.45%
        // 37.6 mb, less than 8.70%
        
        // using strings and Integer.toBinaryString()
        
        String bits = Integer.toBinaryString(num); // 7 -> "111"
        
        // flip all the bits
        // "111" -> "000"
        String complement = "";
        for(int i = 0; i < bits.length(); i++)
        {
            complement += bits.charAt(i) == '1' ? 0 : 1;
        }
        
        return Integer.parseInt(complement, 2);
    }
}
