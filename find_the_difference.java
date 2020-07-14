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
}
