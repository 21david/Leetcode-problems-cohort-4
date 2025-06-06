//  https://leetcode.com/problems/powx-n/


// recursive solution
class Solution {
    public double myPow(double x, int n) {
        // 1 ms, faster than 60.30%
        // 38.6 MB, less than 7.33%
        
        if(n == 0)
            return 1;
        else if(n == Integer.MIN_VALUE)
        {
            if(x == 1)
                return 1;
            else if(x == -1)
                return 1;
            else
                return 0;
        }
        else if(n < 0)
        {
            return 1 / myPowHelp(x, -n);
        }
        else
        {
            return myPowHelp(x, n);
        }
        
    }
    
    public double myPowHelp(double x, int n)
    {
        if(n == 0)
            return 1;
        else if(n == 1)
        {
            return x;
        }
        else
        {
            double result = myPow(x, n / 2);  // this reduces recursive calls
            if(n % 2 == 0)
                return result * result;
            else
                return x * result * result;
        }
    }
}


// dynamic programming solution (bottom up)
class Solution {
    public double myPow(double x, int nInput) {
        // 1221 ms, faster than 5.09%
        // 37 MB, less than 25.26%
        
        long n = nInput;
        
        if(n == 0)
            return 1;
        else if(n == Integer.MIN_VALUE)
        {
            if(x == 1)
                return 1;
            else if(x == -1)
                return 1;
            else
                return 0;
        }
        else if(n == Integer.MAX_VALUE)
        {
            if(x == 1)
                return 1;
            else if(x == -1)
                return -1;
        }
        
        boolean neg = false;
        
        if(n < 0)
        {
            neg = true;
            n = -n;
        }
        
        long count = 1;
        double p = x;
        
        while(count * 2 <= n)
        {
            p = p * p;
            count *= 2;
        }
        
        while(count++ < n)
            p *= x;
        
        if(neg)
            return 1 / p;
        else
            return p;
    }
    
}
