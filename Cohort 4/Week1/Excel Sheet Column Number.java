/*
https://leetcode.com/problems/excel-sheet-column-number/description/
*/

class Solution {
    public int titleToNumber(String s) {
        int value = 0;
        
        for(int i = s.length() - 1, j = 1; i >= 0; i--, j *= 26)
        {
            value += j * (s.charAt(i) - 64);
        }
        
        return value;
    }
}
