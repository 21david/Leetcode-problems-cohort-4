/*
https://leetcode.com/problems/isomorphic-strings/
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Accepted
        // 6 ms, faster than 74.58%
        // 39.5 mb, less than 6.14%
        
        if(s.length() != t.length())
            return false;
        return convert(s).equals(convert(t));
    }
    
    public String convert(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int letter = 96;
        
        StringBuilder output = new StringBuilder();
        
        for(char c : s.toCharArray())
        {
            if(map.containsKey(c))
                output.append( (char) (map.get(c).intValue()) );
            else
            {
                map.put(c, ++letter);
                output.append((char) letter);
            }
                
        }
        
        return output.toString();
    }
}
