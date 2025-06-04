/*
https://leetcode.com/problems/valid-anagram/
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        
        // Accepted
        // 2 ms, faster than 99.24%
        // 39.1 mb, less than 20%
        
        if(s.length() != t.length())
            return false;
        
        int[] alphabetS = new int[26];
        int[] alphabetT = new int[26];
        
        for(char sc : s.toCharArray())
            alphabetS[sc-'a']++;
        
        for(char tc : t.toCharArray())
            alphabetT[tc-'a']++;
        
        for(int i = 0; i < 26; i++)
            if(alphabetS[i] != alphabetT[i])
                return false;
        
        return true;
        
    }
}
