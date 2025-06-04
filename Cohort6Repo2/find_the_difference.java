class Solution {
    public char findTheDifference(String s, String t) {
        // 2 ms, faster than 60.46%
        // 39.3 mb, less than 16.23%
        
        // approach to 136. Single Number can be used here
        // Time complexity: O(S + T)
        // Space complexity: O(1)
        
        int letter = 0;
        
        for(char c : s.toCharArray())
            letter ^= c;
        
        for(char c : t.toCharArray())
            letter ^= c;
        
        return (char) letter;
    }
    
    public char findTheDifferenceMultiset(String s, String t)
    {
        // 9 ms, faster than 14.02%
        // 38.4 MB, less than 23.97%
        
        // 1. make a multiset that counts the total frquency of every letter in s
        // 2. Iterate through letters in t, subtracting from the frequency of each letter in the multiset
        //     a. When a letter is reached that has a count of 0 in the multiset, this is the added letter
        //     b. or, if a letter is reached that isn't already in the multiset, this is the added letter
        
        
        // 1. 
        HashMap<Character, Integer> multiset = new HashMap<Character, Integer>();
        
        for(char c : s.toCharArray())
            multiset.put(c, multiset.getOrDefault(c, 0) + 1);
        
        // 2.
        for(char c : t.toCharArray())
            if(multiset.containsKey(c))  // a.
            {
                if(multiset.get(c) == 0)
                    return c;
                else
                    multiset.put(c, multiset.get(c) - 1);
            }
            else
                return c;  // b.
        
        return 0;
    }
    
    public char findTheDifferenceMultiset2(String s, String t)
    {
        // 2 ms, faster than 60.46%
        // 37.9 MB, less than 53.17%
        
        // 1. make a multiset that counts the total frquency of every letter in s
        // 2. Iterate through letters in t, subtracting from the frequency of each letter in the multiset
        //     a. When a letter is reached that has a count of 0 in the multiset, this is the added letter
        
        
        // 1. 
        int[] multiset = new int[26];
        
        for(char c : s.toCharArray())
            multiset[c - 'a']++;
        
        // 2.
        for(char c : t.toCharArray())
            if(multiset[c - 'a'] >= 1)  
                multiset[c - 'a']--;
            else  // a.
                return c;  
        
        return 0;
    }
    
}
