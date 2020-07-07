class Solution {
    public boolean detectCapitalUse(String word) {
        // 2 ms, faster than 36.98%
        // 39.4 mb, less than 13.27%
        
        /*
        
        We must return true only for the following cases:
        
                                                           ------ All other letters strictly capitalized
                                                          |
                            ---- 1st letter is capital  --
                           |                              |
                           |                               ------ All other letters strictly lowercase
     check 1st letter  ----                         
                           |                         
                            ---- 1st letter is lowercase --- All other letters strictly lowercase
        
        else, we must return false.
        
        */
        
        if(firstLetterIsCapital(word))
        {
            if(allOthersCapitalized(word))
                return true;
            else if(allOthersLowerCase(word))
                return true;
        }
        else
        {
            if(allOthersLowerCase(word))
                return true;
        }
        
        return false;
    }
    
    public boolean firstLetterIsCapital(String word)
    {
        return Character.isUpperCase(word.charAt(0));
    }
    
    public boolean allOthersCapitalized(String word)
    {
        for(int i = 1; i < word.length(); i++)
            if(!Character.isUpperCase(word.charAt(i)))
                return false;
        return true;
    }
    
    public boolean allOthersLowerCase(String word)
    {
        for(int i = 1; i < word.length(); i++)
            if(!Character.isLowerCase(word.charAt(i)))
                return false;
        return true;
    }
}
