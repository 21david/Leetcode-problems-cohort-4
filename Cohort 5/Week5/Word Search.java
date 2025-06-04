/*
https://leetcode.com/problems/word-search/
*/

class Solution {
    public boolean exist(char[][] board, String word) {
        // Accepted
        // 157 ms, faster than 7.19%
        // 42.1 mb, less than 23.47%
        
        if(word.length() == 0 || board.length == 0 || board[0].length == 0)
            return false;
        else if(word.length() > board.length * board[0].length)
            return false;
        
        char[] wordArray = word.toCharArray();
        int i = 0;
        
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board[0].length; c++)
            {
                if(board[r][c] == wordArray[i])
                    if(dfs(board, visited, wordArray, r, c, 0))
                        return true;
                
                visited = new boolean[board.length][board[0].length];
                
            }
            
        }
        
        return false;
    }
    
    public boolean dfs(char[][] board, boolean[][] visited, char[] wordArray, int r, int c, int i)
    {
        if(i == wordArray.length)
            return true;
        
        if(outOfBounds(board, r, c))
            return false;
        
        if(visited[r][c])
            return false;
        
        
        if(board[r][c] != wordArray[i])
            return false;
        
        visited[r][c] = true;
        
        // if above if statement passed, then another letter was found
        
        
        if(dfs(board, visited, wordArray, r + 1, c, i + 1))
            return true;
        else if(dfs(board, visited, wordArray, r - 1, c, i + 1))
            return true;
        else if(dfs(board, visited, wordArray, r, c + 1, i + 1))
            return true;
        else if(dfs(board, visited, wordArray, r, c - 1, i + 1))
            return true;
        
        visited[r][c] = false;
        
        return false;
    }
    
    public boolean outOfBounds(char[][] board, int r, int c)
    {
        return r < 0 || c < 0 || r >= board.length || c >= board[0].length;
    }
}
