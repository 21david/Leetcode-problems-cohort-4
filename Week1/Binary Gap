/*
https://leetcode.com/problems/binary-gap/
*/

class Solution {
    public int binaryGap(int N) {
        
        // Accepted
        // 1 ms, faster than 70.55%
        // 36.5 mb, less than 7.14%
        
        
        if(N == 0 || isPowerOfTwo(N))
            return 0;
        
        String str = Integer.toBinaryString(N);
        
        // trim zeroes from the back
        while(str.charAt(str.length() - 1) == '0')
            str = str.substring(0, str.length() - 1);
        
        boolean on = false;
        int maxGap = 0;
        int gap = 0;
        
        for(int i = 0; i < str.length(); i++)
        {
            if(on)
            {
                gap++;
                
                if(gap > maxGap)
                    maxGap = gap;
            }
            
            if(str.charAt(i) == '0')
                on = true;
            else
            {
                on = false;
                gap = 0;
            }
        }
        
        return maxGap + 1;
        
    }
    
    public boolean isPowerOfTwo(int N)
    {
        int bit = 1;
        while(bit > 0)
        {
            if(N == bit)
                return true;
            
            bit <<= 1;
        }
        
        return false;
    }
}
