class Solution {
    public boolean isHappy(int n) {
        // 2 ms, faster than 34.6%
        // 38.4 mb, less than 13.62%
        
        // We need a hash set to store all the numbers we see throughout the summing process
        // If we ever come across a number twice, then we can prove that it will result in a loop
        // so return false. If we reach 1, then return true.
        
        HashSet<Integer> seen = new HashSet<>();
        
        return isHappyHelp(seen, n);
    }
    
    // determines whether a number is "happy" (using recursion)
    public boolean isHappyHelp(HashSet<Integer> seen, int n)
    {
        if(n == 1)
            return true;
        else if(seen.contains(n))
            return false;
        else
            seen.add(n);
        
        
        return isHappyHelp(seen, specialSum(n));
    }
    
    // returns the sum of the squares of all the digits of the input number
    public int specialSum(int n)
    {
        int sum = 0;
        
        while(n > 0)
        {
            sum += (n%10) * (n%10);
            n /= 10;
        }
        
        return sum;
    }
}
