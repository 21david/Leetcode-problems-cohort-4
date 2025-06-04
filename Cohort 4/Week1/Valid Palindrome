/*
https://leetcode.com/problems/valid-palindrome/description/
*/

class Solution {
    public boolean isPalindrome(String s) {
        // make all letters lowercase
        s = s.toLowerCase();
        
        // "pointers" of sort to keep track of the letters
        int l = 0;
        int r = s.length() - 1;
        
        // find the first letter or digit from the left
        while(l < s.length() && !Character.isLetterOrDigit( s.charAt(l) ) )
            l++;
        
        // all empty spaces case, 'l' will reach the end
        if(l == s.length())
            return true;
        
        // find the first letter or digit from the right
        while(r >= 0 && !Character.isLetterOrDigit( s.charAt(r) ) )
              r--;
        
        if(s.charAt(l) != s.charAt(r))
              return false;
        
        // "nudge" the pointers by one
        l++;
        r--;
        
        boolean met = r <= l;
        
        // as long as the pointers havent met, keep iterating
        while(!met)
        {
            while(l < s.length() && !Character.isLetterOrDigit( s.charAt(l) ) )
                l++;
            
            while(r >= 0 && !Character.isLetterOrDigit( s.charAt(r) ) )
                r--;
            
            if(s.charAt(l) != s.charAt(r))
                return false;
            
            met = r <= l;
            
            // "nudge"
            l++;
            r--;
            
        }
        
        // once the pointers have met or passed each other, if it hasn't returned false
        // then it is a valid palindrome
        return true;
        
    }
        
        /* Works, but time limit exceeds */
        /* 
        // remove non-letters and non-digits
        for(int i = 0; i < s.length(); i++)
        {
            if(!Character.isLetterOrDigit( s.charAt(i) ))
            {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        
        // make all letters lowercase
        s = s.toLowerCase();
        
        // test it with a regular palindrome algorithm
        return isPalindromeRegular(s);
        
    }
    
    public boolean isPalindromeRegular(String s)
    {
        for(int i = 0; i < s.length() / 2; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        
        return true;
    }
    */
}
