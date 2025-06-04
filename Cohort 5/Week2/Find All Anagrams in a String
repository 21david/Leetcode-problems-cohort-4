/*
https://leetcode.com/problems/find-all-anagrams-in-a-string/
*/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // Accepted
        // 2091 ms, faster than 5.02%
        // 41.9 mb, less than 6%
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i <= s.length() - p.length(); i++)
        {
            if(isAnagram(s.substring(i, i + p.length()), p))
                list.add(i);
        }
        
        return list;
    }
    
    public boolean isAnagram(String a, String b)
    {
        if(a.length() != b.length())
            return false;
        
        int[] alphabetA = new int[26];
        int[] alphabetB = new int[26];
        
        for(int i = 0; i < a.length(); i++)
        {
            alphabetA[a.charAt(i) - 'a']++;
            alphabetB[b.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++)
        {
            if(alphabetA[i] != alphabetB[i])
                return false;
        }
        
        return true;
    
    }
}
