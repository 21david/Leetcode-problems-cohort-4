/*
 https://leetcode.com/problems/valid-sudoku
 */

class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // check rows
        for(int r = 0; r < 9; r++)
        {
            if(!isValidRow(board, r))
                return false;
        }
        
        // check columns
        for(int c = 0; c < 9; c++)
        {
            if(!isValidColumn(board, c))
                return false;
        }
        
        // check boxes
        for(int r = 0; r < 9; r += 3)
        {
            for(int c = 0; c < 9; c += 3)
            {
                if(!isValidBox(board, r, c))
                    return false;
            }
        }
        
        
        // if any of the methods returned false, method will have returned false
        // else it will return true
        return true;
        
    }
    
    /*
     * r and c should be multiples of 3, not greater than or equal to 9
     */
    public boolean isValidBox(char[][] board, int r, int c)
    {
        HashSet<Character> set = new HashSet<>();
        
        for(int a = r; a < r + 3; a++)
        {
            for(int b = c; b < c + 3; b++)
            {
                char current = board[a][b];
                
                if(current == '.')
                    continue;
                
                if(set.contains(current))
                    return false;
                else
                    set.add(current);
            }
        }
        
        return true;
    }
    
    public boolean isValidRow(char[][] board, int r)
    {
        HashSet<Character> set = new HashSet<>();
        
        for(int a = 0; a < 9; a++)
        {
            char current = board[r][a];
            
            if(current == '.')
                continue;
            
            if(set.contains(current))
                return false;
            else
                set.add(current);
        }
        
        return true;
    }
    
    public boolean isValidColumn(char[][] board, int c)
    {
        HashSet<Character> set = new HashSet<>();
        
        for(int a = 0; a < 9; a++)
        {
            char current = board[a][c];
            
            if(current == '.')
                continue;
            
            if(set.contains(current))
                return false;
            else
                set.add(current);
        }
        
        return true;
    }
}
