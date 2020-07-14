class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // 2685 ms, faster than 5%
        // 114.6 mb, less than 5.01%
        // Sometimes causes Time Limit Exceeded, so it's close to the time limit
        
        // for the example input, we can start a search at every index of s (up to and including s.length() - 3)
        // to check if those 3 letters are an anagram of p. If it is, add it to the final list.
        // for general input, we can start a search at every index of s up to and including s.length() - p.length()
        // to check if those p.length() letters are an anagram of p.
        // Time complexity: O(N * M), N is the # of chars in S, M is the # of chars in P
        
        if(p.length() > s.length())
            return new ArrayList<>();
        
        ArrayList<Integer> startIndices = new ArrayList<>();
        
        for(int i = 0; i <= s.length() - p.length(); i++)
        {
            if(isAnagram(s.substring(i, i + p.length()), p))
                startIndices.add(i);
        }
        
        return startIndices;
    }
    
    // O(M), where M is the number of characters in S or P, assuming length(S) == length(P)
    // if they have different lengths, this is O(1)
    public boolean isAnagram(String s, String p)
    {
        if(s.length() != p.length())
            return false;
        
        int[] alphabetS = new int[26];  // multiset, count the frequency of each character
        int[] alphabetP = new int[26];
        
        for(int i = 0; i < s.length(); i++)
        {
            alphabetS[s.charAt(i) - 'a']++;
            alphabetP[p.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++)
            if(alphabetS[i] != alphabetP[i])
                return false;
        
        return true;
    }
}
