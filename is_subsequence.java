//  https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {
        // 1 ms, faster than 83.72%
        // 38.5 MB, less than 29.46%
        
        // for each letter in s, iterate through t until it is found. If all are found, return true.
        
        int i = -1;
        int found = 0;
        
        for(char c : s.toCharArray())
        {
            i++;
            while(i < t.length() && t.charAt(i) != c)
                i++;
            
            if(i == t.length())
                return false;  // ran out of letters in t, with letters in s remaining
            
            found++;
        }
        
        return found == s.length();
    }
}
