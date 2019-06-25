/*
https://leetcode.com/problems/flipping-an-image/submissions/
*/

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
     
        for(int r = 0; r < A.length; r++)
        {
            int[] row = A[r];
            
            // reverse array and flip bits
            int temp = 0;
            int length;
            
            for(int a = 0; a <= (row.length - 1) / 2; a++)
            {
                temp = Math.abs( row[a] - 1 );
                row[a] = Math.abs( row[row.length - 1 - a] - 1 );
                row[row.length - 1 - a] =  temp; 
            }
        }
        
        return A;
    }
}
