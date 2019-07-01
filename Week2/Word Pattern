/*
https://leetcode.com/problems/word-pattern/
*/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        
        String[] words = str.split(" ");
        
        if(pattern.length() != words.length)
            return false;
        
        for(int i = 0; i < pattern.length(); i++)
        {
            char c = pattern.charAt(i);
            
            if(map.containsKey(c))
            {
                if( !map.get(c).equals(words[i]) )
                    return false;
            }
            else
            {
                if(map.containsValue(words[i]))
                    return false;
                
                map.put(c, words[i]);
            }
        }
        
        return true;
    }
}
