/*
https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
*/

class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        
        String answer = "";
        
        for(String w : words)
        {
            answer += reverse(w) + " ";
        }
        
        // remove the last " "
        answer = answer.substring(0, answer.length() - 1);  
        
        return answer;
    }
    
    
    public String reverse(String s)
    {
        char[] array = s.toCharArray();
        char temp = 0;
        
        for(int i = 0; i < s.length() / 2; i++)
        {
            temp = array[i];
            array[i] = array[s.length() - 1 - i];
            array[s.length() - 1 - i] = temp;
        }
        
        return new String(array);
    } 
    
    
    
    /*
    public String reverse(String w)
    {
        StringBuilder sb = new StringBuilder(w);
        return sb.reverse().toString();
    }
    */
    
    /*
    // seems to be the slowest way
    public String reverse(String w)
    {
        if(w.length() <= 1)
            return w;
        
        return reverse(w.substring(1, w.length())) + w.charAt(0);
    }
    */
    
    
}
