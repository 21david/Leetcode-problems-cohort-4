/*
https://leetcode.com/problems/island-perimeter/
*/

class Solution {
    
    static int perimeter = 0;
    
    /*
     * Solution 1
     * Uses methods check() and outOfBounds()
     * Check every element in matrix, and check for borders if its a 1
     */
     public int islandPerimeter(int[][] grid) {
        
        // Accepted
        // 7 ms, faster than 52.46%
        // 41.8 mb, less than 100%
        
        perimeter = 0;
        
        // check every element in matrix, and check for borders if its a 1
        for(int r = 0; r < grid.length; r++)
        {
            for(int c = 0; c < grid[0].length; c++)
            {
                if(grid[r][c] == 0)
                    continue;
                
                check(grid, r - 1, c);
                check(grid, r + 1, c);
                check(grid, r, c - 1);
                check(grid, r, c + 1);
            }
        
        }
        
        return perimeter;
    }
    
    
    /*
     * Solution 2
     * Uses methods dfs() and outOfBounds()
     * Find the first 1, then do a dfs, going through all the other 1s, and checking for borders
     */
    public int islandPerimeter2(int[][] grid)
    {
        // Accepted
        // 11 ms, faster than 19.2%
        // 424.6 mb, less than 100%
        
        perimeter = 0;
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        // look for the first 1, then begin a dfs
        for(int r = 0; r < grid.length; r++)
        {
            for(int c = 0; c < grid[0].length; c++)
            {
                if(grid[r][c] == 1)
                    dfs(grid, visited, r, c);
            }
        
        }
        
        
        return perimeter;
        
    }
    
    public void dfs(int[][] grid, boolean[][] visited, int r, int c)
    {
        if(outOfBounds(grid, r, c))
        {
            perimeter++;
            return;
        }
        
        else if(visited[r][c])
        {
            return;
        }
        
        else if(grid[r][c] == 0)
        {
            perimeter++;
            return;
        }
        
        else if(grid[r][c] == 1)
        {
            visited[r][c] = true;
            
            
            dfs(grid, visited, r + 1, c);

            dfs(grid, visited, r - 1, c);

            dfs(grid, visited, r, c + 1);

            dfs(grid, visited, r, c - 1);
        }
        
        
        
    }
    
    public void check(int[][] grid, int r, int c)
    {
        if(outOfBounds(grid, r, c))
            perimeter++;
        else
        {
            if(grid[r][c] == 0)
                perimeter++;
        }
        
        return;
    }
    
    public boolean outOfBounds(int[][] grid, int r, int c)
    {
        return r < 0 || c < 0 || r >= grid.length || c >= grid[0].length;
    
    }
}
