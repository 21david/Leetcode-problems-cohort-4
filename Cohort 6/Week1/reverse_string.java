class Solution {
    public void reverseString(char[] s) {
        // 1 ms, faster than 58.54%
        // 52.9 mb, less than 16.4%
        
        int l = 0;
        int r = s.length - 1;
        
        char temp = 0;
        
        for(int i = 0; i < s.length / 2; i++)
        {
            temp = s[l];
            s[l++] = s[r];
            s[r--] = temp;
        }
        
    }
}
