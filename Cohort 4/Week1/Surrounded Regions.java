/*
https://leetcode.com/problems/surrounded-regions/
*/

class Solution {
    ArrayList<Integer> locationOfOs = new ArrayList<>();
    
    public void solve(char[][] board) {
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board[0].length; c++)
            {
                if(board[r][c] == 'O' && isSurrounded(new boolean[board.length][board[0].length], board, r, c))
                {
                    board[r][c] = 'X';
                    // we have a list of location of surrounded Os in 'locationOfOs'
                    while(!locationOfOs.isEmpty())
                        board[locationOfOs.remove(0)][locationOfOs.remove(0)] = 'X';
                    
                }
            }
        }
    }
    
    // recursively 'fill' in all interconnected Os
    // if it reaches out of bounds, it returns false and clears the list
    // of 'filled' Os
    public boolean isSurrounded(boolean[][] visited, char[][] board, int r, int c)
    {
        if(r < 0 || r >= board.length || c < 0 || c >= board[r].length)
        {
            locationOfOs = new ArrayList<>();
            return false;
        }
        
        if(visited[r][c] == true)
            return true;
        else
        {
            visited[r][c] = true;
            if(board[r][c] == 'O')
            {
                locationOfOs.add(r);
                locationOfOs.add(c);
            }
        }
        
        if(board[r][c] == 'X')
            return true;
        
        return isSurrounded(visited, board, r + 1, c)
            && isSurrounded(visited, board, r    , c+ 1)
            && isSurrounded(visited, board, r - 1, c)
            && isSurrounded(visited, board, r    , c - 1);
        
    }
    
    
}
