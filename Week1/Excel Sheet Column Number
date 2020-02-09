/*
https://leetcode.com/problems/excel-sheet-column-number/
*/

class Solution {
    public int titleToNumber(String s) {
        // Accepted
        // 1ms, faster than 100%
        // 38.5 mb, less than 5.88%
        
        int val = 0;
        int mul = 1;
        
        for(int i = s.length() - 1; i >= 0; i--)
        {
            val += (s.charAt(i) - 'A' + 1) * mul;
            mul *= 26;
        }
        
        return val;
    }
}
