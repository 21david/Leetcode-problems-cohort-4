class Solution {
    public boolean isPowerOfTwo(int n) {
        // 1 ms, faster than 100%
        // 37.1 mb, less than 23.33%
        
        /*
        If a positive number is a power of two, it's binary representation will have
        exactly one 1.
        We can check through each bit, counting all the 1s, to find out if a number
        is a power of 2.
        We can do this by checking the last bit of a number ((n & 1) gives you the last bit),
        then shifting the number to the right by 1 ( n >>= 1 ), and doing this until 
        the number becomes 0 ( while(n > 0) ).
        If we counted more than one 1, then the number is not a pwoer of 2. Otherwise, it is.
        */
        
        int oneCount = 0;
        
        while(n > 0)
        {
            if((n & 1) == 1)
                oneCount++;
            
            n >>= 1;
        }
        
        return oneCount == 1;
    }
}
