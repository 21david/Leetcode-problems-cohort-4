/*
https://leetcode.com/problems/unique-morse-code-words/
*/

class Solution {
    
    public int uniqueMorseRepresentations(String[] words) {
        // Accepted
        // 1 ms, faster than 100%
        // 37.4 mb, less than 5.26%
        
        // from previous algorithm, used StringBuilder instead of arrays
        // runtime improvement by 1 ms
        
        String[] array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            
        HashSet<String> transformations = new HashSet<>();
        StringBuilder temp;
        
        for(String str : words)
        {
            temp = new StringBuilder();
            
            // make the transformation
            for(char c : str.toCharArray())
                temp.append(array[c - 'a']);
            
            
            // add to set
            transformations.add(temp.toString());
            
        }
        
        return transformations.size();
            
    }
    
    
    public int uniqueMorseRepresentations2(String[] words) {
        // Accepted
        // 2 ms, faster than 66.82%
        // 37.7 mb, less than 5.26%
        
        // from previous algorithm, replaced the HashMap with an array 
        // runtime improvement by 1 ms
        
        String[] array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            
        HashSet<String> transformations = new HashSet<>();
        String temp;
        
        for(String str : words)
        {
            temp = "";
            
            // make the transformation
            for(char c : str.toCharArray())
                temp += array[c - 'a'];
            
            
            // add to set
            transformations.add(temp);
            
        }
        
        return transformations.size();
            
    }
    
    public int uniqueMorseRepresentations3(String[] words) {
        // Accepted
        // 3 ms, faster than 24.33%
        // 38.1 mb, less than 5.36%
        
        HashMap<Character, String> map = new HashMap<>();
        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e', ".");
        map.put('f', "..-.");
        map.put('g', "--.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".---");
        map.put('k', "-.-");
        map.put('l', ".-..");
        map.put('m', "--");
        map.put('n', "-.");
        map.put('o', "---");
        map.put('p', ".--.");
        map.put('q', "--.-");
        map.put('r', ".-.");
        map.put('s', "...");
        map.put('t', "-");
        map.put('u', "..-");
        map.put('v', "...-");
        map.put('w', ".--");
        map.put('x', "-..-");
        map.put('y', "-.--");
        map.put('z', "--..");
        
        HashSet<String> transformations = new HashSet<>();
        String temp;
        
        for(String str : words)
        {
            temp = "";
            
            // make the transformation
            for(char c : str.toCharArray())
                temp += map.get(c);
            
            
            // add to set
            transformations.add(temp);
            
        }
        
        return transformations.size();
    }
}
