class Solution {
    public void reverseString(char[] s) {
        // 1 ms, faster than 58.54%
        // 53.4 mb, less than 9.23%
        
        char temp = 0;
        
        for(int i = 0; i < s.length / 2; i++)
        {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        
    }
}
