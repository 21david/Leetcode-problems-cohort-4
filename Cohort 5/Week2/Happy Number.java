/*
https://leetcode.com/problems/happy-number/
*/

class Solution {
    public boolean isHappy(int n) {
        // Accepted
        // 1 ms, faster than 96.36%
        // 36.8 mb, less than 6.06%
        
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        
        while(n != 1)
        {
            n = sumOfSquaresOfDigits(n); // find the 'next' number
            if(set.contains(n)) 
                return false;
            set.add(n);
        }
        
        return true;
    }
    
    public int sumOfSquaresOfDigits(int n)
    {
        int total = 0;
        
        while(n > 0)
        {
            total += (n % 10) * (n % 10);
            
            n /= 10;
        }
        
        return total;
    }
}
