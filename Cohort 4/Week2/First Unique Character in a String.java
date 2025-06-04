/*
https://leetcode.com/problems/first-unique-character-in-a-string/
*/

class Solution {
    public int firstUniqChar(String s) {
    
        // make a multiset to count every letter in the word
        HashMap<Character, Integer> letterCounts = new HashMap<>();
        for(char c : s.toCharArray())
        {
            if(letterCounts.containsKey(c))
                letterCounts.put(c, letterCounts.get(c) + 1);
            else
                letterCounts.put(c, 1);
        }
        
        // iterate through each char in the word
        // as soon as it finds a letter with only 1 occurrence, return that index
        for(int i = 0; i < s.length(); i++)
        {
            if(letterCounts.get(s.charAt(i)) == 1)
                return i;
        }
        
        // if it didn't find any letter with occurence 1, return -1
        return -1;
    }
    
    /*
    public int firstUniqChar(String s) {
        
        // O(N^2) solution: go through each letter, and for each letter, check every other letter to see if it occurs again
        
        char[] sArray = s.toCharArray();
        
        for(int i = 0; i < s.length(); i++)
        {
            if(sArray[i] == 0)
                continue;
            
            char cur = sArray[i];
            boolean foundAnother = false;
            
            for(int j = i + 1; j < s.length(); j++)
            {
                if(sArray[j] == 0)
                    continue;
                
                if(s.charAt(j) == cur)
                {
                    sArray[j] = 0;
                    foundAnother = true;
                }
            }
            
            if(!foundAnother)
                return i;
        }
        
        return -1;
    }
    */
}
