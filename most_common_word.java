class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // 23 ms, faster than 20.76%
        // 40.9 mb, less than 12.92%
        
        paragraph = removePunctuation(paragraph); // remove any non-letters
        
        String[] words = paragraph.split("[ ]+");
        
        HashMap<String, Integer> countFreq = new HashMap<>();
        
        String trimmed;
        
        for(String w : words)
        {
            
            if(countFreq.containsKey(w))
                countFreq.put(w, countFreq.get(w) + 1);
            else
                countFreq.put(w, 1);
        }
        
        
        // removed banned words from the map (countFreq2 does not contain banned words)
        
        HashSet<String> bannedSet = new HashSet<>();
        
        for(String s : banned)
            bannedSet.add(s);
        
        Set<String> keys = countFreq.keySet();
        
        HashMap<String, Integer> countFreq2 = new HashMap<>();
        
        Iterator iterateKeys = keys.iterator();
        
        while(iterateKeys.hasNext())
        {
            String word = (String) iterateKeys.next();
            
            if(bannedSet.contains(word))
                continue;
            else
                countFreq2.put(word, countFreq.get(word));
        }
        
        
        // Find the word with the max value in countFreq2
        
        iterateKeys = countFreq2.keySet().iterator();
        int max = -1;
        String maxWord = "";
        
        String word;
        
        while(iterateKeys.hasNext())
        {
            word = (String) iterateKeys.next();
            if(countFreq2.get(word) > max)
            {
                max = countFreq2.get(word);
                maxWord = word;
            }
        }
        
        return maxWord;
    }
    
    // removes anything that is not a letter and replaces it with a space
    // also turns everything into lowercase
    public String removePunctuation(String s1)
    {
        StringBuilder sb = new StringBuilder(s1);
        
        for(int i = 0; i < sb.length(); i++)
        {
            if(!Character.isLetter(sb.charAt(i)))
                sb.setCharAt(i, ' ');
        }
        
        return sb.toString().toLowerCase();
    }
    
    // not used
    // removes punctuation from a string, leaving only lowercase letters
    public String trim(String s1)
    {
        StringBuilder sb = new StringBuilder(s1);
        
        // remove punctuation from end
        while(!Character.isLetter(sb.charAt(sb.length() - 1)))
            sb.deleteCharAt(sb.length() - 1);
        
        // remove punctuation from beginning
        while(!Character.isLetter(sb.charAt(0)))
            sb.deleteCharAt(0);
        
        return sb.toString().toLowerCase();
    }
}
