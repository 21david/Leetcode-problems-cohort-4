/*
46 ms, faster than 39.27%
61.6 mb, less than 5.04%
*/

class Solution {
	
    public HashSet<String> wordsSet = new HashSet<>();
	
    public List<String> findWords(char[][] board, String[] words) 
    {
        Set<String> foundWords = new HashSet<String>();
        
        // we need to build a trie that will be used later
        Trie trie = new Trie();
        
        for(String word : words)
        {
            trie.insert(word);
            wordsSet.add(word);
        }
        
        // we need to iterate through every character in the board
        // only starting a search if that letter is a child of 'root'
        // if it is a child, keep searching recursively in all 4 directions for the rest of the letters
        // if we find all the letters, add that word to 'foundWords'
        
        outer:
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board[0].length; c++)
            {
                
                if(trie.root.contains(board[r][c])) // if this char is a child of root
                {
                	if(trie.root.get(board[r][c]).endOfWord == true)
                    {
                        foundWords.add("" + board[r][c]);
                        continue;
                    }
                	
                	boolean[][] visited = new boolean[board.length][board[0].length];
                	
                	visited[r][c] = true;
                	
                    search(board, r + 1, c, trie.root.get(board[r][c]), foundWords, new StringBuilder("" + board[r][c]), visited);
                    
                    visited = new boolean[board.length][board[0].length];
                	visited[r][c] = true;
                    
                    search(board, r - 1, c, trie.root.get(board[r][c]), foundWords, new StringBuilder("" + board[r][c]), visited);
                    
                    visited = new boolean[board.length][board[0].length];
                	visited[r][c] = true;
                    
                    search(board, r, c + 1, trie.root.get(board[r][c]), foundWords, new StringBuilder("" + board[r][c]), visited);
                    
                    visited = new boolean[board.length][board[0].length];
                	visited[r][c] = true;
                    
                    search(board, r, c - 1, trie.root.get(board[r][c]), foundWords, new StringBuilder("" + board[r][c]), visited);
                }
                
            }
        }
        
        ArrayList<String> answer = new ArrayList<>(foundWords);
        
        return answer;
    }
    
    
    /*
    Search the matrix recursively in all 4 directions, starting at (r, c)
    If a word is found, add it to foundWords
    */
    public void search(char[][] board, int r, int c, TrieNode trieNode, Set<String> foundWords, StringBuilder word, boolean[][] visited)
    {
        
        if(outOfBounds(board, r, c) || visited[r][c])
            return;
        else
        	visited[r][c] = true;
        
        if(trieNode.contains(board[r][c])) // if current char at board[r][c] is a child of trieNode, continue searching
        {
            if(trieNode.get(board[r][c]).endOfWord == true)
            {
            	String newWord = word.append(board[r][c]).toString();
            	if((word.length() <= (board.length*board[0].length)) && wordsSet.contains(newWord))
            		foundWords.add(newWord);
                word.deleteCharAt(word.length() - 1);
            }
            
            search(board, r + 1, c, trieNode.get(board[r][c]), foundWords, word.append(board[r][c]), visited);
            word.deleteCharAt(word.length() - 1);
            
            search(board, r - 1, c, trieNode.get(board[r][c]), foundWords, word.append(board[r][c]), visited);
            word.deleteCharAt(word.length() - 1);
            
            search(board, r, c + 1, trieNode.get(board[r][c]), foundWords, word.append(board[r][c]), visited);
            word.deleteCharAt(word.length() - 1);
            
            search(board, r, c - 1, trieNode.get(board[r][c]), foundWords, word.append(board[r][c]), visited);
            word.deleteCharAt(word.length() - 1);
        }
        
        visited[r][c] = false;
    }
    
    public boolean outOfBounds(char[][] board, int r, int c)
    {
        return r < 0 || c < 0 || r >= board.length || c >= board[0].length;
    }
    
    
    
    class TrieNode {
        
        TrieNode[] children;
        boolean endOfWord;
        
        TrieNode() {
            children = new TrieNode[26];
            endOfWord = false;
        }
        
        public boolean contains(char letter)
        {
            return children[letter - 'a'] != null;
        }
        
        public TrieNode get(char letter)
        {
            return children[letter - 'a'];
        }
    }
    
    
    
    class Trie 
    {

        static final int ALPHABET = 26; // total # number of characters

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

}
