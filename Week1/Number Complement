/*
https://leetcode.com/problems/number-complement/description/
*/

class Solution {
    public int findComplement(int num) {
        int bit = Integer.MIN_VALUE;
        
        // this will find the most significant bit in the number (the  leftmost 1)
        while((bit & num) == 0)
            bit >>>= 1;
        
        // iterate through the number's binary digits, 'or' this variable a 1 if it finds a 0, 'or' it a 1 if it finds a 1
        int result = 0;
        
        while(bit > 0)
        {
            if((bit & num) == bit)
                result |= 0;
            else
                result |= bit;
            
            bit >>>= 1;
        }
        
        return result;
        
    }
        /*
        // Solution using strings (slower)
        String binary = Integer.toBinaryString(num);
        
        binary = binary.replace("1", "x");
        binary = binary.replace("0", "1");
        binary = binary.replace("x", "0");
        
        return Integer.parseInt(binary, 2);
    }
    */
}
