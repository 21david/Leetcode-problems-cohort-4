/*
https://leetcode.com/problems/find-the-difference/
*/

class Solution {
    public char findTheDifference(String s, String t) {
        // make an array containing the count of each letter, for each string
        int[] lettersInS = new int[26];
        int[] lettersInT = new int[26];
        
        // fill in first array, for string s
        for(char c : s.toCharArray())
            lettersInS[c - 'a']++;
        
        // fill in second array, for string t
        for(char c : t.toCharArray())
            lettersInT[c - 'a']++;
        
        // check which letter has different counts
        for(int i = 0; i < 26; i++)
        {
            if((lettersInS[i] ^ lettersInT[i]) >= 1)
                return (char) (i + 97);
        }
        
        return '\0';
    }
}
