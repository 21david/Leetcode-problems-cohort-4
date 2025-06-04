/*
https://leetcode.com/problems/detect-capital/
*/

class Solution {
    public boolean detectCapitalUse(String word) {
        // Accepted
        // 1 ms, faster than 99.9%
        // 38 mb, less than 6.06%
        
        // if first letter is capital,
        // all other letters must be either all capital or all lowercase
        // so all other letter's size must  equal eachother
        // if first letter is lowercase, all others must be lowercase
        
        if(word.length() == 1)
            return true;
        
        if(Character.isUpperCase(word.charAt(0)))
        {
            // capitalization of the next letter
            boolean big = Character.isUpperCase(word.charAt(1));
            
            for(int i = 2; i < word.length(); i++)
            {
                if(big) // then upper case letters expected
                {
                    if(Character.isLowerCase(word.charAt(i)))
                        return false;
                }
                else // then lower case letters expected
                {
                    if(Character.isUpperCase(word.charAt(i)))
                        return false;
                }
            }
        }
        else // then all should be lower case
        {
            for(int i = 1; i < word.length(); i++)
            {
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
            }
        }
        
        return true;
    }
}
