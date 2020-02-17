/*
https://leetcode.com/problems/uncommon-words-from-two-sentences/
*/

class Solution {
    
    public String[] uncommonFromSentences(String A, String B) {
        // Accepted
        // 3 ms, faster than 37.55%
        // 37.9 mb, less than 13.33%
        
        // from previous algorithm, used String.split() instead of Scanner to iterate through words
        // big runtime improvement
        
        HashMap<String, Integer> map = new HashMap<>();
        
        String[] wordsA = A.split(" ");
        
        for(String word : wordsA)
            if(map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        
        String[] wordsB = B.split(" ");
        
        for(String word : wordsB)
            if(map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        
        System.out.println(map);
        
        ArrayList<String> uncommonWords = new ArrayList<>();
        
        // find the uncommon words in the map and add to an arraylist
        Set<String> keySet = map.keySet();
        
        for(String key : keySet)
            if(map.get(key) == 1)
                uncommonWords.add(key);
        
        
        
        return uncommonWords.toArray(new String[0]);
    }
    
    
    public String[] uncommonFromSentences2(String A, String B) {
        // Accepted
        // 17 ms, faster than 5.52%
        // 41.5 mb, less than 6.67%
        
        HashMap<String, Integer> map = new HashMap<>();
        
        // String.split(" ") or Scanner and Scanner.next()
        Scanner scan = new Scanner(A);
        
        String word;
        
        while(scan.hasNext())
        {
            word = scan.next();
            if(map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }
        
        scan = new Scanner(B);
        while(scan.hasNext())
        {
            word = scan.next();
            if(map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }
        
        System.out.println(map);
        
        ArrayList<String> uncommonWords = new ArrayList<>();
        
        // find the uncommon words in the map and add to an arraylist
        Set<String> keySet = map.keySet();
        
        for(String key : keySet)
            if(map.get(key) == 1)
                uncommonWords.add(key);
        
        
        
        return uncommonWords.toArray(new String[0]);
        
    }
}
