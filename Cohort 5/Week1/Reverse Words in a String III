/*
https://leetcode.com/problems/reverse-words-in-a-string-iii/
*/

class Solution {
    
    
    public String reverseWords(String s) {
        
        // Accepted
        // 6 ms, faster than 58.01%
        // 42.1 mb, less than 7.02%
        
        String[] array = s.split(" ");
        
        StringBuilder output = new StringBuilder();
        
        // reverse each string in array
        
        for(String str : array)
        {
            for(int i = str.length() - 1; i >= 0; i--)
                output.append(str.charAt(i));
            
            output.append(" ");
        }
        
        return output.substring(0, output.length() - 1);
        
    }
    
    
    public String reverseWords2(String s) {
        
        // Accepted
        // 392 ms, faster than 5.21%
        // 43.6 mb, less than 5.26%
        
        // Strings can cause algorithms to be slow it seems
        
        String[] array = s.split(" ");
        
        String output = "";
        
        // reverse each string in array
        
        for(String str : array)
        {
            for(int i = str.length() - 1; i >= 0; i--)
                output += str.charAt(i);
            
            output += " ";
        }
        
        return output.substring(0, output.length() - 1);   
    }
    
    
}
