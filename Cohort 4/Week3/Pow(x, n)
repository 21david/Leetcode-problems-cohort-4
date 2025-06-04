class Solution {
    public double myPow(double x, int n) {
        if(n < 0)
        {
            if(n == Integer.MIN_VALUE) // special edge case, n == -2,147,483,648 (== -2^31)
                return 1.0 / (myPow(x, 2147483647) * x);
            
            // 5 ^ -5  ==  1 / (5 ^ 5)
            return 1.0 / myPow(x, Math.abs(n));
        }
        else if(n == 0)
            return 1;
        else if(n == 1)
            return x;
        
        // store value so it doesn't calculate multiple times
        double val = myPow(x, n / 2);
        
        // if even
        if(n % 2 == 0)
            return val * val;
        
        // if odd 
        else
            return val * myPow(x, n / 2 + 1);
    }
    
    /*
        // time limit exceeds for edge cases (n == 2,147,483,647)
        if(n < 0)
            return 1.0 / rec(x, Math.abs(n));
        else
            return rec(x, n);
    }
    
    public double rec(double x, int n)
    {
        if(n == 0)
            return 1;
        else
            return x * rec(x, n - 1);
    }
    
    */
        
    /*
        // time limit exceeds for edge cases (n == 2,147,483,647)
        if(n == 0)
            return 1;
        else if (n == 1)
            return x;
        else if(n < 0)
            return 1.0 / myPow(x, Math.abs(n));
        else
            return x * x * myPow(x, n - 2);
    }
    */
}
