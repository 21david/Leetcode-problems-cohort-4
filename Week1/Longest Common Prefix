/*
https://leetcode.com/problems/longest-common-prefix/description/
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        
        // find the shortest word
        String min = strs[0];
        
        for(int i = 1; i < strs.length; i++)
        {
            if(strs[i].length() < min.length())
                min = strs[i];
        }
        
        boolean maxPrefix = false;
        
        // keep attempting to see if the 'min' word is a prefix of all
        // if not, take away the last character of 'min', to test a smaller and
        // smaller version each time
        while(!maxPrefix)
        {
            maxPrefix = true;
            for(int i = 0; i < strs.length; i++)
            {
                if(!isPrefix(min, strs[i]))
                    maxPrefix = false;
            }
            
            if(maxPrefix)
                return min;
            
            min = min.substring(0, min.length() - 1);
        }
        
        
        return "";
    }
    
    public boolean isPrefix(String prefix, String word)
    {
        if(word.indexOf(prefix) == 0)
            return true;
        else
            return false;
    }
}
