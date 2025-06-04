/*
https://leetcode.com/problems/plus-one/
*/

class Solution {
    public int[] plusOne(int[] digits) {
        // Accepted
        // 0 ms, faster than 100%
        // 37.9 mb, less than 5.64%
        
        
        int nines = 0;
        
        int i = digits.length - 1;
        
        digits[i] = digits[i] + 1;
        if(digits[i] == 10)
        {
            nines++;
            digits[i] = 0;
        }
            
        while(nines > 0)
        {
            nines--;
            if(i == 0)
            {
                // create new array and return
                int[] array = new int[digits.length + 1];
                array[0] = 1;
                return array;
            }
            else
            {
                digits[--i] += 1;
            }
                
            if(digits[i] == 10)
            {
                nines++;
                digits[i] = 0;
            }
        }
        
        return digits;
        
    }
}
