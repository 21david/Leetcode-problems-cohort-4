/*
https://leetcode.com/problems/find-all-anagrams-in-a-string/
*/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> indexes = new ArrayList<>();
        
        // iterate through all the possible anagrams of p in s
        for(int i = 0; i < s.length() - p.length() + 1; i++)
        {
            if( isAnagram( s.substring(i, i + p.length()), p ) )
                indexes.add(i);
        }
        
        return indexes;
    }
    
    public boolean isAnagram(String a, String b)
    {
        // count the amounts of each letter in each string
        int[] lettersOfA = new int[26];
        int[] lettersOfB = new int[26];
        
        // count each character
        for(int i = 0; i < a.length(); i++)
        {
            char charA = a.charAt(i);
            char charB = b.charAt(i);
            
            lettersOfA[charA - 'a']++;
            lettersOfB[charB - 'a']++;
        }
        
        // check that they have the same letters and amount of each letter
        return Arrays.equals(lettersOfA, lettersOfB);
    }
}
