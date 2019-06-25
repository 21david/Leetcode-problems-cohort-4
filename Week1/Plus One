/*
https://leetcode.com/problems/plus-one/description/
*/

class Solution {
    public int[] plusOne(int[] digits) {
        boolean overflow = false;
        digits[digits.length - 1]++;
        
        // if rightmost digit is a 9
        if(digits[digits.length - 1] == 10)
        {
            overflow = true;
            digits[digits.length - 1] = 0;
        }
        
        int a = 0;
        while(overflow && a <= digits.length - 2)
        {
            digits[digits.length - 2 - a]++;
            
            if(digits[digits.length - 2 - a] == 10)
            {
                overflow = true;
                digits[digits.length - 2 - a] = 0;
                a++;
            }
            else
                overflow = false;
        }
        
        if(overflow)
        {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
        else
            return digits;
    }
}
