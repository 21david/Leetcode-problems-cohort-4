/*
https://leetcode.com/problems/number-of-islands/
*/

class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0)
            return 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int islands = 0;
        
        for(int r = 0; r < grid.length; r++)
        {
            for(int c = 0; c < grid[0].length; c++)
            {
                if(grid[r][c] == '1' && !visited[r][c])
                {
                    islands++;
                    fill(visited, grid, r, c);
                }
                
            }
        }
        
        return islands;
        
    }
    
    public void fill(boolean[][] visited, char[][] grid, int r, int c)
    {
        if(!inBounds(grid, r, c) || visited[r][c] || grid[r][c] == '0')
            return;
        
        visited[r][c] = true;
        
        fill(visited, grid, r + 1,  c);
        fill(visited, grid, r,      c + 1);
        fill(visited, grid, r - 1,  c);
        fill(visited, grid, r,      c - 1);
    }
    
    public boolean inBounds(char[][] grid, int r, int c)
    {
        if(r >= grid.length || r < 0 || c >= grid[0].length || c < 0)
            return false;
        else
            return true;
    }
}
