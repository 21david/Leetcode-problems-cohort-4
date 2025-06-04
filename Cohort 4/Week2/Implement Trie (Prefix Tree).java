/*
https://leetcode.com/problems/implement-trie-prefix-tree/
*/

class Trie {

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

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
