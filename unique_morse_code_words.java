class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        // 1 ms, faster than 100%
        // 39 mb, less than 31.04%
        
        // Create a set that will contain the transformations of each word
        // Since a set only stores one element for every set of duplicate elements,
        // the length of the set at the end will be the answer
        
        // Time complexity: O(N) (where N = number of characters in input array)
        // Space complexity: O(N) 
        
        HashSet<String> transformationsSet = new HashSet<>();
        
        // transform each word, and add to the set
        for(String w : words)
            transformationsSet.add(toMorse(w));
        
        return transformationsSet.size();
    }
    
    public String toMorse(String w)
    {
        // index 0 = 'a', 1 = 'b', 2 = 'c', ...
        String[] morseArray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        StringBuilder output = new StringBuilder();
        
        for(char c : w.toCharArray())
            output.append(morseArray[c - 'a']);
        
        return output.toString();
    }
}
