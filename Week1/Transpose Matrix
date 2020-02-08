/*
https://leetcode.com/problems/transpose-matrix/
*/

class Solution {
    
    public int[][] transpose(int[][] A) {
        // Accepted
        // 0 ms, 100% faster
        // 41.6 mb, less than 8.33%
        
        
        // same as below solution, but
        // if it is a square, just swap to save memory
        // (which didn't actually improve performance)
        if(A.length == A[0].length)
        {
            int temp = 0;
            
            for(int r = 0; r < A.length; r++)
            {
                for(int c = r + 1; c < A[0].length; c++)
                {
                    temp = A[r][c];
                    A[r][c] = A[c][r];
                    A[c][r] = temp;
                }
            }
            
            return A;
        }
        
        else
        {
            int[][] ans = new int[A[0].length][A.length];

            for(int r = 0; r < A.length; r++)
            {
                for(int c = 0; c < A[0].length; c++)
                {
                    ans[c][r] = A[r][c];
                }
            }

            return ans;
        }
    }
    
    
    
    /*    public int[][] transpose(int[][] A) {
        // create new matrix with reverse dimensions,
        // and add all the elements in
        
        // Accepted
        // 0 ms, 100% faster
        // 41.6 mb, less than 8.33%
        
        int[][] ans = new int[A[0].length][A.length];
        
        int temp = 0;
        
        for(int r = 0; r < A.length; r++)
        {
            for(int c = 0; c < A[0].length; c++)
            {
                ans[c][r] = A[r][c];
            }
        }
        
        return ans;
        
    }
    */
    
}
