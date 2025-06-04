/*
https://leetcode.com/problems/find-the-difference/
*/

class Solution {
    public char findTheDifference(String s, String t) {
        // Accepted
        // 1 ms, faster than 98.89%
        // 37.5 mb, less than 15.63%
        
        int xor = 0;
        
        for(char c : s.toCharArray())
            xor ^= c;
        
        for(char c : t.toCharArray())
            xor ^= c;
        
        return (char) xor;
    }
}
