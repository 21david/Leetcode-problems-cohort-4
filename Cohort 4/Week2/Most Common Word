/*
https://leetcode.com/problems/most-common-word/
*/

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> multiset = new HashMap<>();
        
        paragraph = paragraph.toLowerCase();
        
        int i = 0;
        
        String word = "" + paragraph.charAt(i);
        
        i++;
        
        // parse string, finding all the words and adding them to the multiset
        while(i < paragraph.length())
        {
            
            // iterate  until a non-character is found
            while( i < paragraph.length() && Character.isLetter( paragraph.charAt(i) ))
            {
                word += paragraph.charAt(i);
                i++;
            }
            
            // should have found a word now
            if(multiset.containsKey( word ))
                multiset.put(word, multiset.get(word) + 1);
            else
                multiset.put(word, 1);
            
            word  = "";
            
            // iterate until a character is found
            while(i < paragraph.length() && !Character.isLetter( paragraph.charAt(i) ))
            {
                i++;
            }
        
        }
        
        
        // remove banned words from the multiset
        for(String bannedWord : banned)
        {
            if(multiset.containsKey(bannedWord))
                multiset.remove(bannedWord);
        }
        
        // find the maximum value in the multiset
        Set<String> keys = multiset.keySet();
        
        Iterator iterateKeys = keys.iterator();
        
        int max = -1;
        String maxKey = null;
        
        while(iterateKeys.hasNext())
        {
            String current = (String) iterateKeys.next();
            
            if(multiset.get(current) > max)
            {
                max = multiset.get(current);
                maxKey = current;
            }
        }
        
        return maxKey;
    }
}
