/*
https://leetcode.com/problems/groups-of-special-equivalent-strings/
*/


class Solution {
    public int numSpecialEquivGroups(String[] A) {
        int groups = 0;
        
        // O(N^2) search through the array
        for(int i = 0; i < A.length; i++)
        {
            String current = A[i];
            
            // if a string was marked null, it belonged to a group already
            // else, it is part a new group
            if(A[i] == null)
                continue;
            else
                groups++;
            
            // mark all strings 'special equivalent' to the current string null
            for(int j = i + 1; j < A.length; j++)
            {
                if(A[j] == null)
                    continue;
                
                if( isSpecialEquivalent(A[i], A[j]) )
                    A[j] = null;
            }
        }
        
        return groups;
    }
    
    // check if they are 'special equivalent' using hash tables
    public boolean isSpecialEquivalent(String a, String b)
    {
        if(a.length() != b.length())
            return false;
        
        int[] alphabetEvensA = new int[26];
        
        int[] alphabetOddsA = new int[26];
        
        int[] alphabetEvensB = new int[26];
        
        int[] alphabetOddsB = new int[26];
        
        for(int i = 0; i < a.length(); i++)
        {
            if(i % 2 == 0)
            {
                alphabetEvensA[a.charAt(i) - 'a']++;
                alphabetEvensB[b.charAt(i) - 'a']++;
            }
            else
            {
                alphabetOddsA[a.charAt(i) - 'a']++;
                alphabetOddsB[b.charAt(i) - 'a']++;
            }
        }
        
        // if evensA differs from evensB or oddsA differs from oddsB, they are not special equivalent
        for(int i = 0; i < 26; i++)
        {
            if(alphabetEvensA[i] != alphabetEvensB[i])
                return false;
            else if(alphabetOddsA[i] != alphabetOddsB[i])
                return false;
        }
        
        return true;
    }
}
