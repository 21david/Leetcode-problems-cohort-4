/*
https://leetcode.com/problems/jewels-and-stones/
*/

class Solution {
    public int numJewelsInStones(String J, String S) {
        // Accepted
        // 0 ms, faster than 100%
        // 37.9 mb, less than 5.05%
        
        int count = 0;
        
        for(char c : S.toCharArray())
            if(J.indexOf(c) >= 0)
                count++;
        
        return count;
    }
}
