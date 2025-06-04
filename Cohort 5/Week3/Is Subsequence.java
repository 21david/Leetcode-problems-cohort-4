/*
https://leetcode.com/problems/is-subsequence/
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        // Accepted
        // 4 ms, faster than 88.05%
        // 44.1 mb, less than 100%
        
        int sCount = 0;
        
        int tIndex = 0;
        
        for(char c : s.toCharArray())
        {
            while(tIndex < t.length() && t.charAt(tIndex) != c)
                tIndex++;
            
            // if it reaches the end of t, s isnt a subsequence
            if(tIndex == t.length())
                return false;
            
            sCount++;
            tIndex++;
                
        }
        
        // if it didn't return false during any of the letters in s, then s is subsequence of t
        if(sCount != s.length())
            return false;
        return true;
        
    }
}
