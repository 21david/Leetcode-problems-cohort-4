/*
https://leetcode.com/problems/valid-anagram/
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabetS = new int[26];
        for(char c : s.toCharArray())
            alphabetS[c - 97]++;
        
        
        int[] alphabetT = new int[26];
        for(char c : t.toCharArray())
            alphabetT[c - 97]++;
        
        for(int i = 0; i < 26; i++)
            if(alphabetS[i] != alphabetT[i])
                return false;
        
        return true;
        
    }
}
