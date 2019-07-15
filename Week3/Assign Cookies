/*
https://leetcode.com/problems/assign-cookies/
*/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        
        int happyKids = 0;
        
        children:
        for(int child : g)
        {
            for(int i = 0; i < s.length; i++)
            {
                if(s[i] < 0) // cookie already given
                    continue;
                
                if(s[i] >= child)
                {
                    System.out.println(i + " " + s[i] + " " + child);
                    s[i] = -1;
                    happyKids++;
                    continue children; // continue to next child
                    // otherwise this child eats all other cookies it can
                }
            }
        }
        
        return happyKids;
    }
}
