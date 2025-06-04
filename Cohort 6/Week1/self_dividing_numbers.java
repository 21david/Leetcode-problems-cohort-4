class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        // 3 ms, faster than 47.33%
        // 39.3 mb, less than 15.43%
        
        ArrayList<Integer> selfDividing = new ArrayList<>();
        
        for(; left <= right; left++)
        {
            if(isSelfDividing(left))
                selfDividing.add(left);
        }
        
        return selfDividing;
    }
    
    // returns true if it is self dividing.
    // it is self dividing if for every digit of the number x
    // num % x == 0
    public boolean isSelfDividing(int num)
    {
        int copy = num;
        int lastDigit;
        
        while(num > 0)
        {
            lastDigit = num % 10;
            if(lastDigit == 0 || copy % lastDigit != 0)
                return false;
            
            num /= 10;
        }
        
        return true;
    }
}
