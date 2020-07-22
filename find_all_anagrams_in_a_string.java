//  https://leetcode.com/problems/find-all-anagrams-in-a-string/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // Time Limit Exceeded
        // 36 / 36 test cases passed, but took too long.
        
        ArrayList<Integer> indices = new ArrayList<>();
        
        char[] pSorted = p.toCharArray();
        Arrays.sort(pSorted);
        
        char[] temp;
        
        // iterate through all the possible anagrams of p in s
        for(int i = 0; i < s.length() - p.length() + 1; i++)
        {
            temp = s.substring(i, i + p.length()).toCharArray();
            if( isAnagram( pSorted, temp ) )
                indices.add(i);
        }
        
        return indices;
    }
    
    public boolean isAnagram(char[] a, char[] b)
    {
        Arrays.sort(b);
        
        return Arrays.equals(a, b);
    }
}
