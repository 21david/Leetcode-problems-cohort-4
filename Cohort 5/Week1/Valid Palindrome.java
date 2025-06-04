/*
https://leetcode.com/problems/valid-palindrome/
*/

class Solution {
    
    
    public boolean isPalindrome(String s) {
        // Accepted
        // 4 ms, faster than 75.8%
        // 39.4 mb, less than 25.89%
        
        // uses StringBuilder instead of String
        
        StringBuilder stripped = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                stripped.append(Character.toLowerCase(s.charAt(i)));
        }
        
        int len = stripped.length();
        
        for(int i = 0; i < stripped.length() / 2; i++)
        {
            if(stripped.charAt(i) != stripped.charAt(len - 1 - i))
                return false;
        }
        
        return true;
    }
    
    public boolean isPalindrome4(String s) {
        
        // Accepted
        // 173 ms, faster than 5.01%
        // 42.9 mb, less than 5.35%
        
        // strip the input string from all non-alphanumeric characters
        // convert to lower case, and run a regular isPalindrome algorithm on it
        
        String stripped = "";
        
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                stripped += Character.toLowerCase(s.charAt(i));
        }
        
        int len = stripped.length();
        
        for(int i = 0; i < stripped.length() / 2; i++)
        {
            if(stripped.charAt(i) != stripped.charAt(len - 1 - i))
                return false;
        }
        
        return true;
    }
    
    public boolean isPalindromeB(String s) {
        // converts to character array instead of just using the string
        
        // Accepted
        // 71 ms, faster than 7.33%
        // 41.8 mb, less than 5.35%
        
        char[] array = s.toCharArray();
        
        int l = 0, r = s.length() - 1;
        
        while(l < r)
        {
            while(l < r && !Character.isLetterOrDigit( array[l] ))
                l++;
            
            while(l < r && !Character.isLetterOrDigit( array[r] ))
                r--;
            
            if(l >= r)
                break;
            
            System.out.println(array[l] + " == " + array[r]);
            
            if(Character.toLowerCase( array[l] ) != Character.toLowerCase( array[r] ))
                return false;
            
            l++;
            r--;
        }
        
        return true;
    }
    
    public boolean isPalindromeA(String s) {
        // Accepted
        // 75 ms, faster than 7.18%
        // 41.7 mb, less than 5.35%
        
        int l = 0, r = s.length() - 1;
        
        while(l < r)
        {
            while(l < r && !Character.isLetterOrDigit( s.charAt(l) ))
                l++;
            
            while(l < r && !Character.isLetterOrDigit( s.charAt(r) ))
                r--;
            
            if(l >= r)
                break;
            
            System.out.println(s.charAt(l) + " == " + s.charAt(r));
            
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            
            l++;
            r--;
        }
        
        return true;
    }
}
