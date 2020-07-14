class Solution {
    public char findTheDifference(String s, String t) {
        // 2 ms, faster than 60.46%
        // 39.7 mb, less than 5.4%
        
        // approach to 136. Single Number can be used here
        // Time complexity: O(S + T)
        // Space complexity: O(S + T)
        
        String st = s + t;
        
        int letter = 0;
        
        for(char c : st.toCharArray())
            letter ^= c;
        
        return (char) letter;
    }
}
