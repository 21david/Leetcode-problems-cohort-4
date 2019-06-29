/*
https://leetcode.com/problems/unique-morse-code-words/description/
*/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        // Using StringBuilder (faster)
        
        // add all the letter -> morse code mappings to a hashmap for O(1) access time
        HashMap<Character, String> map = new HashMap<>();
        
        String[] morseCodeArray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i = 0; i < 26; i++)
        {
            map.put((char) (97 + i), morseCodeArray[i]);
        }
        
        
        // set to keep track of all transformations made
        Set<String> set = new HashSet<>();
        
        // transform each word
        for(int i = 0; i < words.length; i++)
        {
            StringBuilder transformation = new StringBuilder();
            
            for(char c : words[i].toCharArray())
            {
                transformation.append(map.get(c)); // O(1) access time for map
            }
            
            // add transformation to a set
            set.add(transformation.toString());
            
        }
        
        // return the size of the set
        return set.size();
        
    }
      
}
