/*
https://leetcode.com/problems/longest-word-in-dictionary/
*/

class Solution {
    public String longestWord(String[] words) {
        // sort so that it finds the lexicographically smaller solution every time
        Arrays.sort(words);
        
        // add all words to the Trie data structure
        Trie trie = new Trie();
        
        for(String s : words)
            trie.insert(s);
        
        // iterate through every word, check if every prefix of it exists in the Trie
        // if it does, set a max value to that word if it is longer than the previous word
        String max = "";
        for(String s : words)
        {
            // chop off the last letter
            String prefixes = s.substring(0, s.length() - 1);
            
            while(trie.search(prefixes)) // search for s in the trie
            {
                // chop off one letter every time
                prefixes = prefixes.substring(0, prefixes.length() - 1);
            }
            
            // if it chopped off all letters, all prefixes were in the trie
            if( prefixes.equals("") )
            {
                // hold onto it if it is a new max
                if(s.length() > max.length())
                    max = s;
            }
        }
        
        return max;
    }
}

// Trie data structure
class Trie {

    // Trie data structure
    static class TrieNode
    {
        final int ALPHABET_SIZE = 26;
        
        TrieNode[] children;
        boolean endOfWord;
        
        public TrieNode()
        {
            children = new TrieNode[ALPHABET_SIZE];
            endOfWord = false;
        }
    }
    
    TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode currentNode = root;
        
        for(char c : word.toCharArray())
        {
            // check if the letter is present in children
            int index = c - 'a';
            if(currentNode.children[index] != null) // if present
            {
                // keep iterating
                currentNode = currentNode.children[index];
            }
            else // add the character to the Trie structure
            {
                currentNode.children[index] = new TrieNode();
                currentNode = currentNode.children[index];
            }
            
        }
        
        // last one should be marked as an end of word
        currentNode.endOfWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        // start with the root
        TrieNode currentNode = root;
        
        // go through each letter, check if its present
        for(char c : word.toCharArray())
        {
            int index = c - 'a';
            
            if(currentNode.children[index] == null) // character not found
            {
                return false;
            }
            else
            {
                // keep iterating through the characters
                currentNode = currentNode.children[index];
            }
        }
        
        // if it found all letters AND endOfWord is true, return true
        return currentNode.endOfWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        // start with the root
        TrieNode currentNode = root;
        
        // go through each letter, check if its present
        for(char c : prefix.toCharArray())
        {
            int index = c - 'a';
            
            if(currentNode.children[index] == null) // character not found
            {
                return false;
            }
            else
            {
                // keep iterating through the characters
                currentNode = currentNode.children[index];
            }
        }
        
        // unlike search, 'endOfWord' doesn't have to be true
        // it just has to find all the letters
        // so if it did, return true
        return true;
    }
}
