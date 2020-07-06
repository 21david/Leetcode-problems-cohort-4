class Solution {
    public void solve(char[][] board) {
        // 2 ms, faster than 48.09%
        // 49.4 mb, less than 5.87%
        
        /*
        We can iterate through the outer layer, converting any regions
        we find into a temporary letter (such as Q) (using DFS). Then, we can iterate
        through the whole board, flipping any remaining regions of Os into Xs
        (these are the regions that don't reach the edge). Then, we can flip the
        Qs back into Os.
        
        For example:
        X X X X       X X X X       X X X X      X X X X
        X O O X   ->  X O O X   ->  X X X X  ->  X X X X
        X X O X       X X O X       X X X X      X X X X
        X O X X       X Q X X       X Q X X      X O X X
        
        Time complexity: O(M * N)
        Space complexity: O(1)
        */
        
        if(board.length == 0)
            return;
        
        // iterate through the outer layer. If we find an O, start a DFS that
        // turns all those Os in that region into Qs.
        
        // left column
        for(int i = 0; i < board.length; i++)
            if(board[i][0] == 'O')
                fillWithQs(board, i, 0);
        
        // right column
        for(int i = 0; i < board.length; i++)
            if(board[i][board[i].length - 1] == 'O')
                fillWithQs(board, i, board[i].length - 1);
        
        // top row
        for(int i = 0; i < board[0].length; i++)
            if(board[0][i] == 'O')
                fillWithQs(board, 0, i);
        
        // bottom row
        for(int i = 0; i < board[0].length; i++)
            if(board[board.length - 1][i] == 'O')
                fillWithQs(board, board.length - 1, i);
        
        // iterate through the whole matrix, turning any Os into Xs
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board[0].length; c++)
            {
                if(board[r][c] == 'O')
                    board[r][c] = 'X';
            }
        }
        
        // iterate through the whole matrix, turning any Qs into Os
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board[0].length; c++)
            {
                if(board[r][c] == 'Q')
                    board[r][c] = 'O';
            }
        }
    }
    
    
    // recursively fill all Os that are touching the current O
    // with Qs. (Basically a DFS starting from board[r][c])
    public void fillWithQs(char[][] board, int r, int c)
    {
        if(outOfBounds(board, r, c) || board[r][c] == 'X' || board[r][c] == 'Q')
            return;
        
        board[r][c] = 'Q';
        
        fillWithQs(board, r - 1, c);
        fillWithQs(board, r + 1, c);
        fillWithQs(board, r, c - 1);
        fillWithQs(board, r, c + 1);
    }
    
    public boolean outOfBounds(char[][] board, int r, int c)
    {
        return r < 0 || c < 0 || r >= board.length || c >= board[0].length;
    }
}
