class Solution {
    public boolean isAnagram(String s, String t) {
        // 3 ms, faster than 76.17%
        // 39.2 mb, less than 93.0%
        
        if(s.length() != t.length())
            return false;
        
        int[] alphabet1 = new int[26];
        int[] alphabet2 = new int[26];
        
        for(int i = 0; i < s.length(); i++)
        {
            alphabet1[s.charAt(i) - 'a']++;
            alphabet2[t.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++)
            if(alphabet1[i] != alphabet2[i])
                return false;
        
        return true;
    }
}
