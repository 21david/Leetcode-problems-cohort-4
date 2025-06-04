/*
https://leetcode.com/problems/first-unique-character-in-a-string/
*/

class Solution {
    public int firstUniqChar(String s) {
        // Accepted
        // 27 ms, faster than 46.52%
        // 42 mb, less than 5.71%
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray())
        {
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        
        }
        
        int ans = -1;
        
        
        for(int i =0 ; i < s.length(); i++)
        {
            if(map.get(s.charAt(i)) == 1)
            {
                ans = i;
                break;
            }
        }
        
        return ans;
    }
}
