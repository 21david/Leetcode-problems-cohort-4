/*
https://leetcode.com/problems/reverse-vowels-of-a-string/
*/

class Solution {
    public String reverseVowels(String s) {
        // Accepted
        // 2 ms, faster than 98.9%
        // 42.1 mb, less than 6.9%
        
        char[] array = s.toCharArray();
        
        int l = 0; 
        int r = s.length() - 1;
        char temp;
        
        while(l < r)
        {
            // look out for vowels from left to right
            while(l < r && !isVowel( array[l] ))
                l++;
            
            // look out for vowels from right to left
            while(l < r && !isVowel( array[r] ))
                r--;
            
            if(l >= r)
                break;
            
            // swap
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            
            // nudge the pointers by one
            l++;
            r--;
        }
        
        // return result as String
        return new String(array);
        
    }
    
    public boolean isVowel(char a)
    {
        return a == 'a'
            || a == 'e'
            || a == 'i'
            || a == 'o'
            || a == 'u'
            || a == 'A'
            || a == 'E'
            || a == 'I'
            || a == 'O'
            || a == 'U';
    }
}
