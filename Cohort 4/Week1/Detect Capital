/*
https://leetcode.com/problems/detect-capital/description/
*/

class Solution {
    public boolean detectCapitalUse(String word) {
        boolean allCapital = true;
        
        for(char c : word.toCharArray())
        {
            if(Character.isLowerCase(c))
                allCapital = false;
        }
        
        boolean allLowerCase = true;
        
        for(char c : word.toCharArray())
        {
            if(Character.isUpperCase(c))
                allLowerCase = false;
        }
        
        boolean onlyFirstUpperCase = word.length() >= 1 && Character.isUpperCase(word.charAt(0));
        
        for(int i = 1; i < word.length(); i++)
        {
            if(Character.isUpperCase(word.charAt(i)) )
                onlyFirstUpperCase = false;
        }
        
        return allCapital || allLowerCase || onlyFirstUpperCase;
        
    }
}
