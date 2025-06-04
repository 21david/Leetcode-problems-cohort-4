/*
https://leetcode.com/problems/groups-of-special-equivalent-strings/
*/

class Solution {
    public int numSpecialEquivGroups(String[] A) {
        // Accepted
        // 90 ms, faster than 5.07%
        // 41.8 mb, less than 7.69%
        
        ArrayList<String> groups = new ArrayList<>();
        groups.add(A[0]);
        
        outerLoop:
        for(int i = 1; i < A.length; i++)
        {
            
            // we're gonna iterate through each group already found
            // checking if the current string is special equivalent with any previous group
            
            for(int j = 0; j < groups.size(); j++)
            {
                if(isSpecialEquivalent(groups.get(j), A[i]))
                    continue outerLoop;
            }
            
            // if it never reached 'continue outerLoop;', then it is a new group
            groups.add(A[i]);
            
        }
        
        return groups.size();
    }
    
    public boolean isSpecialEquivalent(String a, String b)
    {
        // if you split a word into two: even indices and odd indices
        // then two strings are special equivalent if those two halfes
        // are anagrams with their corresponding half in the other string
        
        if(isSpecialEquivalent(a, b, 0) && isSpecialEquivalent(a, b, 1))
            return true;
        else
            return false;
    }
    
    // will check if two words are anagrams, but only checking every other letter
    // and starting at index 'start'
    // start = 0 will check even indices
    // start = 1 will check odd indices
    public boolean isSpecialEquivalent(String a, String b, int start)
    {
        int[] alphabetA = new int[26];
        int[] alphabetB = new int[26];
        
        for(int i = start; i < a.length(); i += 2)
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
