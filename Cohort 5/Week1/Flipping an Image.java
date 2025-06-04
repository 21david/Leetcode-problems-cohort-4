/*
https://leetcode.com/problems/flipping-an-image/
*/

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        // Accepted
        // 0 ms, 100% faster
        // 41.4 mb, less than 48.28%
        
        
        // reverse each array in A[][], and flip each bit after
        // reverse using swaps
        byte temp = 0;
        
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[0].length / 2; j++)
            {
                temp = (byte) A[i][j];
                A[i][j] = Math.abs(A[i][A.length - 1 - j] - 1);
                A[i][A.length - 1 - j] = Math.abs(temp - 1);
            }
            
            if(A.length % 2 == 1)
                A[i][A.length / 2] = Math.abs(A[i][A.length / 2] - 1);
        }
        
        return A;
    }
}
