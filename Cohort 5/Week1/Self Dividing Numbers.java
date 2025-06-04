/*
https://leetcode.com/problems/self-dividing-numbers/
*/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        // Accepted
        // 2ms, faster than 77.29%
        // 37.4 mb, less than 6.67%
        
        
        ArrayList<Integer> SDNs = new ArrayList<>();
        
        if(left < 10)
        {
            for(int i = left; i <= Math.min(9, right); i++)
                SDNs.add(i);

            left = 11;
        }
        
        for(;left <= right; left++)
        {
            if(isSelfDividing(left))
                SDNs.add(left);
        }
        
        return SDNs;
    }
    
    public boolean isSelfDividing(int num)
    {
        int copy = num;
        int digit = 0;
        while(copy > 0)
        {
            digit = copy % 10;
            if(digit == 0)
                return false;
            if(num % digit != 0)
                return false;
            copy /= 10;
        }
        
        return true;
    }
}
