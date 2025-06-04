class Solution {
    public int numSpecialEquivGroups(String[] A) {
        // 377 ms, faster than 5.09%
        // 228.2 mb, less than 5.47%
        
        // Checking if two strings are special equivalent is the same as checking if the even numbered
        // characters of string 1 form an anagram of the even numbered characters of string 1, and
        // the same for the odd numbered characters. We can write a method, specialEquiv(string1, string),
        // to check this.
        // We can make a HashSet<String> that keeps track of the groups. Each group will have an entry
        // in this set (it only needs 1 string per group). We can iterate through the input array, and compare 
        // each string with the current strings in this set (the first string in A[] will have to be added to 
        // the set at first.) If the current string is not special equivalent with any of the words in the map,
        // then we add it as a new group. After iterating through the input array, we should have all the 
        // groups in the map, so map.size() should return the correct output.
        
        if(A.length == 0)
            return 0;
        
        HashSet<String> groups = new HashSet<>();
        
        groups.add(A[0]);
        
        outer:
        for(int i = 1; i < A.length; i++)
        {
            boolean newGroup = true;
            for(String group : groups)
            {
                if(specialEquiv(A[i], group))
                {
                    newGroup = false;
                    continue outer;  // then this word already belongs to a group, nothing needs to be done
                }
                
            }

            if(newGroup)
                groups.add(A[i]);
        }
        
        
        return groups.size();
    }
    
    // O(s1 + s2), s1 == characters in s1, s2 == characters in s2
    public boolean specialEquiv(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;  // they have to be equal size
        
        int[] s1Evens = new int[26];
        int[] s1Odds = new int[26];
        int[] s2Evens = new int[26];
        int[] s2Odds = new int[26];
        
        
        // fill the arrays with the counts of each letter
        for(int i = 0; i < s1.length(); i+=2)
        {
            s1Evens[s1.charAt(i) - 'a']++;
            s2Evens[s2.charAt(i) - 'a']++;
        }
        
        for(int i = 1; i < s1.length(); i+=2)
        {
            s1Odds[s1.charAt(i) - 'a']++;
            s2Odds[s2.charAt(i) - 'a']++;
        }
        
        
        // check that the even indexed characters form an 'anagram'
        for(int i = 0; i < 26; i++)
        {
            if(s1Evens[i] != s2Evens[i])
                return false;
        }
        
        // check that the odd indexed characters form an 'anagram'
        for(int i = 0; i < 26; i++)
        {
            if(s1Odds[i] != s2Odds[i])
                return false;
        }
        
        return true;
    }
}
