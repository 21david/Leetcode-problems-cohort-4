//  https://leetcode.com/problems/valid-anagram/

class Solution {
    
    public boolean isAnagram(String s, String t) {
        // 2 ms, faster than 96.87%
        // 39.5 MB, less than 70.12%
        
        /*
        Find the answer using sorting.
        If two words are anagrams, and you sort their letters,
        the two words should be exactly equal after sorting, otherwise they are not anagrams.
        
        O(N*logN) time complexity, for sorting.
        O(N) space compexity, for the arrays
        */
        
        if(s.length() != t.length())
            return false;
        
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        
        // check for any differences
        for(int i = 0; i < sChars.length; i++)
            if(sChars[i] != tChars[i])
                return false;
        
        return true;
    }
    
    public boolean isAnagram2(String s, String t) {
        // 3 ms, faster than 76.17%
        // 39.2 mb, less than 93.0%
        
        // O(N) time complexity, to iterate through the characters in s and t.
        // O(1) space complexity. Arrays used always use constant space (26 ints).
        
        if(s.length() != t.length())
            return false;
        
        int[] alphabet1 = new int[26];
        int[] alphabet2 = new int[26];
        
        for(int i = 0; i < s.length(); i++)
        {
            alphabet1[s.charAt(i) - 'a']++;
            alphabet2[t.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++)
            if(alphabet1[i] != alphabet2[i])
                return false;
        
        return true;
    }
}
