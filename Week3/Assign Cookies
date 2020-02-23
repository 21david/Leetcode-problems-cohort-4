/*
https://leetcode.com/problems/assign-cookies/
*/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Accepted
        // 109 ms, faster than 5.10%
        // 41.9 mb, less tan 9.52%
        
        // Runtime: O(g.length * s.length)
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int count = 0;
        
        // iterating through cookies
        cookies:
        for(int j = 0; j < s.length; j++)
        {
            
            // look for the first child that will eat this cookie  ( i think that's the 'greedy' of this algorithm)
            // when found, set that child to -1 (meaning he's satisfied)
            
            // iterating through children
            for(int i = 0; i < g.length; i++)
            {
                if(g[i] > 0 && g[i] <= s[j])
                {
                    // then child i will eat cookie j
                    count++;
                    g[i] = -1;
                    continue cookies;
                }
            }
            
        }
        
        return count;
    }
    
}
