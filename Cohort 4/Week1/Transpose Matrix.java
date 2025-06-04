/*
https://leetcode.com/problems/transpose-matrix/description/
*/

class Solution {
    public int[][] transpose(int[][] A) {
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
