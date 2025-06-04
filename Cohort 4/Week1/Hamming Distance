/*
https://leetcode.com/problems/hamming-distance/
*/

class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        
        int hammingDistance = 0;
        
        // this bit is the highest bit that is not negative (2 ^ 30)
        int bit = Integer.MIN_VALUE >>> 1;
        
        // test every bit, add 1 to 'hammingDistance' for every 1 it finds
        while(bit > 0)
        {
            if((bit & xor) == bit)
                hammingDistance++;
            
            bit >>>= 1;
        }
        
        return hammingDistance;
        
    }
        /*
        // Solution using Strings
        int xor = x ^ y;
        
        // count the number of 1s using Strings
        String numOf1s = Integer.toBinaryString(xor);
        numOf1s = numOf1s.replace("0", "");
        
        return numOf1s.length();
    }
    */
}
