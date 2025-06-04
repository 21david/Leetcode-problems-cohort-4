/*
https://leetcode.com/problems/happy-number/description/
*/

class Solution {
    public boolean isHappy(int n) {
        // store the numbers taht the digits add up to
        // if a number is reached twice, it is an infinite loop
        // otherwise, it will eventually reach 1
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        
        int temp = n;
        
        while(temp != 1)
        {
            n = temp;
            temp = 0;
            
            // get the sum of the squares of all its digits, put into temp
            while(n > 0)
            {
                temp += (n % 10) * (n % 10);
                n /= 10;
            }
            
            // temp = sum of squares of digits
            // check if it reached a number again
            if(set.contains(temp))
                return false;
            else
                set.add(temp);
            
        }
        
        // if while loop terminates, it reached 1
        return true;
    }
}
