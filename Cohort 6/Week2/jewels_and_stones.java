class Solution {
    public int numJewelsInStones(String J, String S) {
        // 2 ms, faster than 30.5%
        // 39.9 mb, less than 5.05%
        
        // Create a hash set containing all the jewels, for O(1) lookup
        // Then, iterate through S, checking each stone to see if its a jewel
        // Time complexity: O(J + S) (creating hashset + iterating through S)
        // Space complexity: O(J) (for the hashset)
        
        HashSet<Character> jewels = new HashSet<>();
        
        for(char j : J.toCharArray())
            jewels.add(j);
        
        int countJewels = 0;
        
        for(char s : S.toCharArray())
            if(jewels.contains(s))
                countJewels++;
        
        return countJewels;
    }
}
