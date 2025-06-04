/*
https://leetcode.com/problems/powx-n/
*/

class Solution {
    public double myPow(double x, int n) {
        
        // Accepted
        // 0 ms, faster than 100%
        // 36.6 mb, less than 5.88%
        
        if(x == 1.0)
            return 1.0;
        
        if(n == Integer.MIN_VALUE)
            return 1 / (myPowHelp(x, (n + 1) * -1) * x);
        if(n < 0)
            return 1 / myPowHelp(x,  n * -1);
        else if(n > 0)
            return myPowHelp(x, n);
        else
            return 1;
        
    }
    
    public double myPowHelp(double x, int n)
    {
        if(n == 1)
            return x;
        
        double result = myPowHelp(x, n / 2); // reduce number of recursive calls
        
        if(n % 2 == 1)
            return result * result * x;
        else
            return result * result;
    
    }
}
