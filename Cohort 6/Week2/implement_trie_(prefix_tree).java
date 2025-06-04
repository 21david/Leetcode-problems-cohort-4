/*
30 ms, faster than 86.8%
48.8 mb, less than 72.55%
*/

class Trie {

    static final int ALPHABET = 26; // total # number of characters
    
    static class TrieNode {
        
        TrieNode[] children;
        boolean endOfWord;
        
        TrieNode() {
            children = new TrieNode[ALPHABET];
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
        
        TrieNode curNode = root;
        
        for(int i = 0; i < word.length(); i++)
        {
            char cur = word.charAt(i);
            
            // add the current letter to the right place
            if(curNode.children[cur - 'a'] == null)
            {
                curNode.children[cur - 'a'] = new TrieNode();
                curNode = curNode.children[cur - 'a'];
            }
            else
                curNode = curNode.children[cur - 'a'];
                
        }
        
        curNode.endOfWord = true;
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        
        // we have to navigate through the trie using 'word'
        // if we end up at a node that has endOfWord == true,
        // then 'word' is in the true (return true)
        
        TrieNode curNode = root;
        
        for(int i = 0; i < word.length(); i++)
        {
            char cur = word.charAt(i);
            
            if(curNode.children[cur - 'a'] == null) // we reached a letter not in the trie
                return false;
            else
                curNode = curNode.children[cur - 'a'];
        }
        
        return curNode.endOfWord;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        
        // similar to search(), but endOfWord in the last node doesn't have to be 'true' in this case
        
        TrieNode curNode = root;
        
        for(int i = 0; i < prefix.length(); i++)
        {
            char cur = prefix.charAt(i);
            
            if(curNode.children[cur - 'a'] == null) // we reached a letter not in the trie
                return false;
            else
                curNode = curNode.children[cur - 'a'];
        }
        
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
