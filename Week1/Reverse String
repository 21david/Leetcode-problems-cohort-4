/*
https://leetcode.com/problems/reverse-string/description/
*/

class Solution {
    public void reverseString(char[] s) {
        char c = 0;
        int len = s.length;
        
        for(int i = 0; i < s.length / 2; i++)
        {
            c = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = c;
        }
    }
}

/*

  Dividing an even number by 2:
  8 / 2 = 4
  
            |
            v
  0 1 2 3 | 4 5 6 7
  
  (always the first index of the second half)
  --------------
  Dividing an odd number by 2:
  
  9 / 2 = 4
  
            |
            v
  0 1 2 3 | 4 | 5 6 7 8
  
  (always the number exactly in the middle)
  
  */
