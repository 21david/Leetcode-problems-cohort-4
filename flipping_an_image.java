class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        // 1 ms, faster than 30.9%
        // 42.4 mb, less than 5.03%
        
        // Pretend we are reversing the contents of a matrix:
        // Do that by swapping elements in the first half with elements in the second half (O(N/2))
        // Do this for every row in the input matrix
        // Also, as you swap, flip the bit
        
        // Time complexity: O(N * M)
        // - we visit about half of the elements of the input matrix
        // Space complexity: O(1)
        // - no extra space is allocated except an int variable
        
        int t = 0;
        
        for(int r = 0; r < A.length; r++)
        {
            for(int c = 0; c < A[0].length / 2; c++)
            {
                t = A[r][c];
                A[r][c] = flip(A[r][A[r].length - 1 - c]);
                A[r][A[r].length - 1 - c] = flip(t);
            }
            
            // flip the center bit since the for loop ignores it (for odd length rows)
            if(A[r].length % 2 == 1)
                A[r][A[r].length / 2] = flip(A[r][A[r].length / 2]);
        }
        
        return A;
        
    }
    
    // flip a 1 to a 0 and a 0 to a 1.
    public int flip(int input)
    {
        if(input == 0)
            return 1;
        else if(input == 1)
            return 0;
        else
            return -1;
    }
}
