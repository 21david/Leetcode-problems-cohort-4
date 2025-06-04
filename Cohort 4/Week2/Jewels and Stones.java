/*
https://leetcode.com/problems/jewels-and-stones/description/
*/

class Solution {
    public int numJewelsInStones(String J, String S) {
        
        Set<Character> jewels = new HashSet<>();
        
        // add the jewels to a hash set
        // they can be accessed from here with O(1) time instead of O(N)
        for(char j : J.toCharArray())
            jewels.add(j);
        
        // of the stones you have, count how many are jewels
        int count = 0;
        for(char s : S.toCharArray())
            if(jewels.contains(s))
                count++;
        
        return count;
        
    }
        
        /*
        // Quadriatic solution
        int ct = 0;
        
        for(char c : S.toCharArray())
        {
            for(char s : J.toCharArray())
            {
                if(c == s)
                {
                    ct++;
                    break;
                }
            }
        }
        
        return ct;
    }
    */
}
