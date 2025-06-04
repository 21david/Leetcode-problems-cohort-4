/*
https://leetcode.com/problems/reverse-vowels-of-a-string/description/
*/

class Solution {
    public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        
        // this var will point to indexes starting from the left
        int l = 0;
        
        while(l < letters.length && !isVowel(letters[l]) )
            l++;
        
        // if there are no vowels, 'l' will have reached the end
        if(l == letters.length)
            return s;
        
        //'l' should be on the first vowel
        
        // this var will point to indexes, starting from the right
        int r = letters.length - 1;
        
        while(r >= 0 && !isVowel(letters[r]))
            r--;
        
        // r should be on the rightmost vowel (l could be the same as r at this point)
        
        if(l == r)
            return s;
        
        // swap
        char temp = letters[l];
        letters[l] = letters[r];
        letters[r] = temp;
        
        l++;
        r--;
        
        boolean met = r <= l;
        
        while(!met)
        {
            while(l < letters.length && !isVowel(letters[l]))
                l++;
            
            while(r >= 0 && !isVowel(letters[r]))
                r--;
            
            met = r <= l;
            
            if(!met)
            {
                // swap
                temp = letters[l];
                letters[l] = letters[r];
                letters[r] = temp;
            }
            
            l++;
            r--;
        }
        
        
        return new String(letters);
        
        
    }
    
    public boolean isVowel(char c)
    {
        // if c is uppercase, make lowercase
        if(c < 97)
            c += 32;
        
        return c == 'a'
            || c == 'e'
            || c == 'i'
            || c == 'o'
            || c == 'u';
    }
}
