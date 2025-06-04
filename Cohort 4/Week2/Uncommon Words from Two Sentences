/*
https://leetcode.com/problems/uncommon-words-from-two-sentences/
*/

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        // map to store words and number of times each word occurs
        HashMap<String, Integer> map = new HashMap<>();
        
        // add all words in A into the map
        Scanner scanA = new Scanner(A);
        
        while(scanA.hasNext())
        {
            String current = scanA.next();
            
            if(map.containsKey(current))
                map.put(current, map.get(current) + 1);
            else
                map.put(current, 1);
        }
        
        // add all words in B into the map
        Scanner scanB = new Scanner(B);
        
        while(scanB.hasNext())
        {
            String current = scanB.next();
            
            if(map.containsKey(current))
                map.put(current, map.get(current) + 1);
            else
                map.put(current, 1);
        }
        
        // iterate through the map, removing any element that has an occurrence of 2 or more
        // (answer should be all words that occur only once in total)
        Set<String> keys = map.keySet();
        
        String[] keysArray = keys.toArray(new String[] {});
        
        int count = 0;
        
        ArrayList<String> solution = new ArrayList<>();
        
        for(String word : keysArray)
        {
            if(map.get(word) == 1)
                solution.add(word);
        }
        
        String[] solutionArray = solution.toArray(new String[] {});
        
        return solutionArray;
    }
}
