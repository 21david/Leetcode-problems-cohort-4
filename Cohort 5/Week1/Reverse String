/*
https://leetcode.com/problems/reverse-string/
*/

class Solution {
    public void reverseString(char[] s) {
        // Accepted
        // 1 ms, faster than 99.46%
        // 46.8 mb, less than 99.41%
        
        
        char temp;
        
        for(int i = 0; i < s.length / 2; i++)
        {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
