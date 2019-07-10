/*
https://leetcode.com/problems/valid-anagram/
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        
        // using sorting
        // 15 ms, 26.02% faster than all java submissions
        char[] sLetters = s.toCharArray();
        char[] tLetters = t.toCharArray();
        
        Arrays.sort(sLetters);
        Arrays.sort(tLetters);
        
        System.out.println(Arrays.toString(sLetters));
        System.out.println(Arrays.toString(tLetters));
        
        return Arrays.equals(sLetters, tLetters);
        
    }
    /*
        // using basically a hash table
        // 3 ms, 94.21% faster than all java submissions
        int[] alphabetS = new int[26];
        for(char c : s.toCharArray())
            alphabetS[c - 97]++;
        
        
        int[] alphabetT = new int[26];
        for(char c : t.toCharArray())
            alphabetT[c - 97]++;
        
        for(int i = 0; i < 26; i++)
            if(alphabetS[i] != alphabetT[i])
                return false;
        
        return true;
        
    }*/
    
}
