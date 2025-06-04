/*
https://leetcode.com/problems/longest-common-prefix/
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Accepted
        // 0 ms, faster than 100%
        // 37.4 mb, less than 93.57%
        
        if(strs.length == 0)
            return "";
        
        // Find shortest word
        String min = strs[0];

        for(int i = 1; i < strs.length; i++)
        {
            if(strs[i].length() < min.length())
                min = strs[i];
        }
        
        // Compare it with every other word and reduce it if necessary
        boolean passedAll = false;

        while(!passedAll)
        {
            passedAll = true;

            checkArray:
            for(int i = 0; i < strs.length; i++)
            {
                // iterate through all the words, checking if they all start with min

                if(strs[i].indexOf(min) != 0) // if it finds a fault, must shorten min and try again
                {
                    passedAll = false;
                    break checkArray; // no point in checking the rest
                }
            }

            // after comparing the current min with all the words
            // we must determine if it worked or if it we need to try again

            if(passedAll)
                return min; // the first successful string to pass all
            else
                min = min.substring(0, min.length() - 1); // take away the last letter

        }
        
        return min;
    }
}
