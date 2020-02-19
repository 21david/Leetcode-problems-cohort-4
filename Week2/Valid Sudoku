/*
https://leetcode.com/problems/valid-sudoku/
*/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Accepted
        // 2 ms, faster than 87.08%
        // 41.1 mb, less than 97.10%
        
        for(int i = 0; i < 9; i++)
        {
            if(!checkRow(board[i]))
                return false;
            
            if(!checkCol(board, i))
                return false;
        }
        
        for(int r = 0; r < 9; r += 3)
        {
            for(int c = 0; c < 9; c += 3)
            {
                if(!checkBox(board, r, c))
                    return false;
                
            }
        }
        
        
        
        return true;
    }
    
    public boolean checkBox(char[][] matrix, int r, int c)
    {
        HashSet<Character> set = new HashSet<>();
        
        for(int a = r; a < r + 3; a++)
        {
            for(int b = c; b < c + 3; b++)
            {
                if(set.contains(matrix[a][b]))
                    return false; // a repetition found
                else if(matrix[a][b] != '.')
                    set.add(matrix[a][b]);
            }
        }
        
        
        return true;
    }
    
    public boolean checkRow(char[] row)
    {
        HashSet<Character> set = new HashSet<>();
        
        for(char c : row)
        {
            if(set.contains(c))
                return false; // a repetition found
            else if(c != '.')
                set.add(c);
        }
        
        return true;
    }
    
    public boolean checkCol(char[][] matrix, int col)
    {
        HashSet<Character> set = new HashSet<>();
        
        for(char[] row : matrix)
        {
            if(set.contains(row[col]))
                return false; // a repetition found
            else if(row[col] != '.')
                set.add(row[col]);
        }
        
        return true;
    }
    
    
}
