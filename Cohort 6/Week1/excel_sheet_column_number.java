class Solution {
    public int titleToNumber(String s) {
        // 2 ms, faster than 29.27%
        // 40 mb, less than 5.91%
        
        /*
        Iterate from right to left, finding the value of each character (from 1 - 26)
        Multiply that by 26^0 for the first letter, 26^1 for the second, etc.
        Add to a variable that keeps the total value
        Return that variable at the end
        */
        
        int mult = 1;
        int total = 0;
        
        for(int i = s.length() - 1; i >= 0; i--)
        {
            char curLetter = s.charAt(i);
            int curLetterVal = curLetter - 64;
            
            curLetterVal *= mult;
            mult *= 26;
            
            
            total += curLetterVal;
        }
        
        return total;
    }
}
