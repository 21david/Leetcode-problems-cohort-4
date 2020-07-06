class Solution {
    public int numIslands(char[][] grid) {
        // 2 ms, faster than 54.61%
        // 44.5 mb, less than 16.93%
        
        // Time complexity: O(M * N)
        // - in the worst case, we visit each element twice, which is O(2 * M * N)
        // Space complexity: O(1)
        // - only one int variable is created 
        
        int numOfIslands = 0;
        
        for(int r = 0; r < grid.length; r++)
        {
            for(int c = 0; c < grid[0].length; c++)
            {
                if(grid[r][c] == '1')
                {
                    numOfIslands++;
                    fillWith0s(grid, r, c);
                }
            }
        }
        
        return numOfIslands;
    }
    
    // starting at grid[r][c], this method will fill
    // every 1 it can reach by going up, down, left, and right
    // with 0s, recursively.
    public static void fillWith0s(char[][] grid, int r, int c)
    {
        if(outOfBounds(grid, r, c) || grid[r][c] == '0')
            return;
        
        grid[r][c] = '0';
        
        fillWith0s(grid, r - 1, c);
        fillWith0s(grid, r + 1, c);
        fillWith0s(grid, r, c - 1);
        fillWith0s(grid, r, c + 1);
    }
    
    public static boolean outOfBounds(char[][] grid, int r, int c)
    {
        return r < 0 || c < 0 || r >= grid.length || c >= grid[0].length;
    }
}
