/*
https://leetcode.com/problems/island-perimeter/
*/

class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int perimeter = 0;
        
        // go through each block
        for(int r = 0; r < grid.length; r++)
        {
            for(int c = 0; c < grid[0].length; c++)
            {
                // if water, skip
                if(grid[r][c] == 0)
                    continue;
                
                // add amount of sides that touch water
                perimeter += checkSides2(grid, r, c);
            }
        }
        
        
        return perimeter;
        
    }
    
    // check all 4 sides
    // return the amount of sides that are water or out of bounds
    public int checkSides2(int[][] grid, int r, int c)
    {
        int isWater = 0;
        
        if(outOfBounds(grid, r - 1, c) || grid[r - 1][c] == 0)
            isWater++;
        if(outOfBounds(grid, r + 1, c) || grid[r + 1][c] == 0)
            isWater++;
        if(outOfBounds(grid, r, c + 1) || grid[r][c + 1] == 0)
            isWater++;
        if(outOfBounds(grid, r, c - 1) || grid[r][c - 1] == 0)
            isWater++;
        
        return isWater;
    }
    
    // check all 4 sides
    // return the amount of sides that are water or out of bounds
    public int checkSides(int[][] grid, int r, int c)
    {
        int isWater = 0;
        
        try {
            if(grid[r - 1][c] == 0) // if water
                isWater++;
        }
        catch(ArrayIndexOutOfBoundsException ex) // if out of bounds
        {
            isWater++;
        }
        
        try {
            if(grid[r + 1][c] == 0) // if water
                isWater++;
        }
        catch(ArrayIndexOutOfBoundsException ex) // if out of bounds
        {
            isWater++;
        }
        
        try {
            if(grid[r][c + 1] == 0) // if water
                isWater++;
        }
        catch(ArrayIndexOutOfBoundsException ex) // if out of bounds
        {
            isWater++;
        }
        
        try {
            if(grid[r][c - 1] == 0) // if water
                isWater++;
        }
        catch(ArrayIndexOutOfBoundsException ex) // if out of bounds
        {
            isWater++;
        }
        
        return isWater;
    }
    
    public boolean outOfBounds(int[][] grid, int r, int c)
    {
        return (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length);
    }
}
