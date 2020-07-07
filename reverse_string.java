class Solution {
    public void reverseString(char[] s) {
        // 3 ms, faster than 5.05%
        // 53.4 mb, less than 8.31%
        
        for(int i = 0; i < s.length / 2; i++)
            swap(s, i, s.length - 1 - i);
    }
    
    public void swap(char[] s, int a, int b)
    {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}
