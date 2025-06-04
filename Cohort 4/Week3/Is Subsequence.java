/*
https://leetcode.com/problems/is-subsequence/
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())
            return false;
        else if(s.length() == 0)
            return true;
        
        // a keeps track of current character in s
        int a = 0;
        // iterate through every character in t
        for(int i = 0; i < t.length(); i++)
        {
            // current character in s
            char current = s.charAt(a);
            
            // if it finds that character, look for the next character in s
            if(t.charAt(i) == current)
            {
                a++;
                if(a == s.length()) // return true if all characters in s found in t
                    return true;
            }
        }
        
        // if the for loop finished, not all characters in s were found
        return false;
    }
}
