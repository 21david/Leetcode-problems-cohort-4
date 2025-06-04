/*
https://leetcode.com/problems/power-of-two/description/
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1)
            return false;
        
        int tester = 1;
        
        // tester will eventually reach the minimum value of an Integer,
        // breaking the loop if n is not a power of 2
        // (it will reach the signed bit, which will make it negative)
        while(tester > 0)
        {
            if(n == tester)
                return true;
            
            tester *= 2;
        }
        
        return false;
    }
        /*
        // Solution using strings
        if(n < 1)
            return false;
        
        String s = Integer.toBinaryString(n);
        
        s = s.replace("0", "");
        
        if(s.length() == 1)
            return true;
        else
            return false;
    }
    */
}

/*
2^30 = 1,073,741,824 is the last power of 2 that fits in an int variable (in 32 bits signed).
*/
