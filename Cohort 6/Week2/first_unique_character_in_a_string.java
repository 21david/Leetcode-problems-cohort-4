class Solution {
    public int firstUniqChar(String s) {
        // 11 ms, faster than 70.98%
        // 47.1 mb, less than 10.8%
        
        // 1. make a multiset containing the amount of times each character appears (O(N))
        // 2. Iterate through each letter, checking if its a letter that only appears in the word once (O(N))
        // 3. Return -1 if no unique character was found
        
        // Time complexity: O(N)
        // Space complexity: O(1)
        
        
        // 1.
        int[] multiset = new int[26];
        for(char c : s.toCharArray())
            multiset[c - 'a']++;
        
        // 2.
        for(int i = 0; i < s.length(); i++)
            if(multiset[s.charAt(i) - 'a'] == 1)
                return i;
        
        // 3.
        return -1; 
    }
}
