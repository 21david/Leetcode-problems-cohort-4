/*
https://leetcode.com/problems/word-pattern/
*/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        // Accepted
        // 1 ms, less than 66.19%
        // 37.4 mb, less than 5.41%
        
        String[] words = str.split(" ");
        
        return convert(words).equals(convert(pattern));
    }
    
    public String convert(String[] words)
    {
        HashMap<String, Integer> map = new HashMap<>();
        int letter = 96;
        
        StringBuilder output = new StringBuilder();
        
        for(String c : words)
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
    
    public String convert(String pattern)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int letter = 96;
        
        StringBuilder output = new StringBuilder();
        
        for(char c : pattern.toCharArray())
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
