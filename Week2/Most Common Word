/*
https://leetcode.com/problems/most-common-word/
*/

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Accepted
        // 15 ms, faster than 50.82%
        // 39.6 mb, less tan 5.05%
        
        
        // remove all punctuation and make all letters lowercase
        StringBuilder trimmed = new StringBuilder();
        
        for(char c : paragraph.toCharArray())
        {
            if(Character.isUpperCase(c))
                trimmed.append((char) (c + 32)); // turn lowercase
            else if(Character.isLowerCase(c) || c == ' ')
                trimmed.append(c);
            else
                trimmed.append(' ');
            
        }
        
        // turn the input string into an array of words
        String[] array = trimmed.toString().split("[ ]+"); // [ ]+ means one or more spaces
        
        
        // convert banned array to set for O(1) access time
        Set<String> set = new HashSet<>();
        
        for(String bannedWord : banned)
            set.add(bannedWord);
        
        
        // remove banned words from the array
        for(int i = 0; i < array.length; i++)
        {
            if(set.contains(array[i])) // if that word is banned
                array[i] = null;
        }
        
        
        // keep a count of each word
        // and look out for the one with the most occurrences
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        int max = 0;
        String maxWord = "";
        
        
        for(String word : array)
        {
            if (word == null) // skip banned words
                continue;
            
            // insert words and occurrences to map
            if(map.containsKey(word))
                map.put(word, map.get(word) +1 );
            else
                map.put(word, 1);
            
            
            if(map.get(word) > max) // if we have a new record
            {
                max = map.get(word);
                maxWord = word;
            }
        
        }
        
        System.out.println(set);
        
        System.out.println(Arrays.toString(array));
        return maxWord;
    }
}
