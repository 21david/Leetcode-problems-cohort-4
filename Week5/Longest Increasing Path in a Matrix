/*
https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
*/

class Solution {
    int maxVal = 0;
    public int longestIncreasingPath(int[][] inputMatrix) {
        // Accepted
        // 18 ms, faster than 21.07%
        // 41.6 mb, less than 24.49%
        
        if(inputMatrix.length == 0 || inputMatrix[0].length == 0)
            return 0;
        
        int[][] dp = new int[inputMatrix.length][inputMatrix[0].length];
        
        long[][] matrix = new long[inputMatrix.length][inputMatrix[0].length];
        
        // convert int[][] matrix to long[][] matrix
        // (i had to do this for an edge case involving 2147483647)
        for(int r = 0; r < matrix.length; r++)
            for(int c = 0; c < matrix[0].length; c++)
                matrix[r][c] = inputMatrix[r][c];
        
        
        for(int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i], -1);
        
        // iterate through each element in the matrix
        for(int r = 0; r < matrix.length; r++)
        {
            for(int c = 0; c < matrix[0].length; c++)
            {
                if(dp[r][c] >= 0)
                    continue;
                
                findPath(matrix, dp, r, c, 0, matrix[r][c] + 1);
                
            }
        }
        
        System.out.println(Arrays.deepToString(dp)); // the cached longest decreasing paths at each spot (largest value is answer)
        
        
        return maxVal + 1;
    }
    
    
    // this will travel in all directions, looking for decreasing numbers
    // and it will store the longest decreasing path in dp[][] if it knows for sure
    public int findPath(long[][] matrix, int[][] dp, int r, int c, int count, long prev)
    {
        if(outOfBounds(matrix, r, c))
            return 0;
        // else it's in bounds
        
        
        if( !(matrix[r][c] < prev) ) // if the new number did not decrease
            return 0;
        
        if(dp[r][c] >= 0)
            return dp[r][c] + 1;
        
        
        dp[r][c] = max( findPath(matrix, dp, r + 1, c, count + 1, matrix[r][c]),
                        findPath(matrix, dp, r - 1, c, count + 1, matrix[r][c]),
                        findPath(matrix, dp, r, c + 1, count + 1, matrix[r][c]),
                        findPath(matrix, dp, r, c - 1, count + 1, matrix[r][c]) );
        
        maxVal = Math.max(dp[r][c], maxVal);
        
        
        return dp[r][c] + 1;
        
    }
    
    
    // returns the maximum of an array of numbers
    public int max(int... nums)
    {
        if(nums.length == 0)
            return -1;
        
        int max = nums[0];
        
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] > max)
                max = nums[i];
        }
        
        return max;
    
    }
    
    
    // returns true if the coordinates r, c are out of bounds in matrix
    public boolean outOfBounds(long[][] matrix, int r, int c)
    {
        return r < 0 || c < 0 || r >= matrix.length || c >= matrix[0].length;
    }
    
}
