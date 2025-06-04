class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 5 ms, faster than 44.13%
        // 44.2 mb, less than 10.61%
        
        // We make 3 methods: checkRow, checkCol, checkSquare, and run each method 9 times
        // one for each row, col, and 3x3 square in the board.
        // if any one of them returns false, the whole board is invalid
        // if they all return true, the board is a valid board.
        
        // Time complexity: O(1), only a maximum of 81 * 3 checks are done, which is a contant number
        // Space complexity: O(1), only a maximum of 81 * 3 integers will be used, which is a constant number
        
        
        // check rows
        for(int r = 0; r < board.length; r++)
            if(!checkRow(board, r))  // if a row is found to be invalid
                return false;
        
        // check cols=
        for(int c = 0; c < board[0].length; c++)
            if(!checkCol(board, c))  // if a col is found to be invalid
                return false;
        
        // check squares
        for(int r = 0; r < board.length; r+=3)
            for(int c = 0; c < board[0].length; c+=3)
            {
           //     System.out.println(r + " " + c);
                if(!checkSquare(board, r, c))  // if a square is found to be invalid
                    return false;
            }
        
        // if nothing was found to be invalid
        return true;
    }
    
    public boolean checkRow(char[][] board, int r)
    {
        HashSet<Integer> nums = new HashSet<>();
        
        for(int c = 0; c < board.length; c++)
        {
            if(board[r][c] == '.')
                continue;
            else if(nums.contains(board[r][c] - '0'))
                return false;
            else
                nums.add(board[r][c] - '0');
        }
        
        return true;
    }
    
    public boolean checkCol(char[][] board, int c)
    {
        HashSet<Integer> nums = new HashSet<>();
        
        for(int r = 0; r < board.length; r++)
        {
            if(board[r][c] == '.')
                continue;
            else if(nums.contains(board[r][c] - '0'))
                return false;
            else
                nums.add(board[r][c] - '0');
        }
        
        return true;
    }
    
    public boolean checkSquare(char[][] board, int r, int c)
    {
        // (r, c) is the top left box of a 3x3 square
        // so we iterate through the next 3 rows and 3 cols (9 small squares in total)

        HashSet<Integer> nums = new HashSet<>();
        
        for(int ri = r; ri < r + 3; ri++)
            for(int ci = c; ci < c + 3; ci++)
            {
                if(board[ri][ci] == '.')
                    continue;
                else if(nums.contains(board[ri][ci] - '0'))
                    return false;
                else
                    nums.add(board[ri][ci] - '0');
            }
        
        return true;
    }
}
