class Solution {
    public int[][] transpose(int[][] A) {
        // 1 ms, faster than 23.64%
        // 45.7 mb, less than 15.56%
        
        // Create a matrix with number of rows and columns swapped (T[A[0].length][A.length])
        // Iterate input matrix normally (with r and c variables)
        // For each element in input matrix A[r][c], assign it to 
        // the tranpose matrix at T[c][r]
        
        // Time complexity: O(N * M)
        // - we iterate through each element in the input matrix once
        // Space complexity O(N * M)
        // - we create a matrix with the same total size as the input matrix
        
        int[][] answer = new int[A[0].length][A.length];
        
        int t = 0;
        
        for(int r = 0; r < A.length; r++)
            for(int c = 0; c < A[0].length; c++)
                answer[c][r] = A[r][c];
        
        return answer;
    }
}
