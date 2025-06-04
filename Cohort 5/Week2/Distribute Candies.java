/*
https://leetcode.com/problems/distribute-candies/
*/

class Solution {
    public int distributeCandies(int[] candies) {
        // Accepted
        // 33 ms, faster than 87.23%
        // 42.2 mb, less than 84.21%
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int type : candies)
            set.add(type);
        
        if(set.size() >= candies.length/2)
            return candies.length/2;
        else
            return set.size();
    }
}
