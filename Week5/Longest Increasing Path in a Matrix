/*
https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
*/

/*
Passes 135/138 test cases
Time Limit Exceeds
*/
class Solution {
    int max = 0;
    
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length == 0)
            return 0;
        
        for(int r = 0; r < matrix.length; r++)
            for(int c = 0; c < matrix[0].length; c++)
                findIncreasingPath(matrix, r, c, 0);
        
        return max + 1;
    }
    
    public void findIncreasingPath(int[][] matrix, int r, int c, int ct)
    {
        if(ct > max)
            max = ct;
        
        if(inBounds(matrix, r - 1, c) && matrix[r-1][c] > matrix[r][c])
            findIncreasingPath(matrix, r - 1, c, ct + 1);
        
        if(inBounds(matrix, r + 1, c) && matrix[r+1][c] > matrix[r][c])
            findIncreasingPath(matrix, r + 1, c, ct + 1);
        
        if(inBounds(matrix, r, c - 1) && matrix[r][c-1] > matrix[r][c])
           findIncreasingPath(matrix, r, c - 1, ct + 1);
        
        if(inBounds(matrix, r, c + 1) && matrix[r][c+1] > matrix[r][c])
            findIncreasingPath(matrix, r, c + 1, ct + 1);
        
    }
    
    public boolean inBounds(int[][] matrix, int r, int c)
    {
        return r >= 0 && c >= 0 && r < matrix.length && c < matrix[0].length;
    }
}
