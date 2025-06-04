/*
https://leetcode.com/problems/sort-array-by-parity/
*/

class Solution {
    
    public int[] sortArrayByParity(int[] A) {
        // Accepted
        // Runtime: 1ms, faster than 99.97%
        // Memory: 41.5 mb, less than 76.39% (varies)
        
        // using pointers and swapping
        // left pointer looks for odd number
        // right pointer looks for even numbers
        // then swap
        // stop when left pointer >= right pointer or either pointer is out of bounds
        
        int temp = 0;
        int l = 0;
        int r = A.length - 1;
        
        while(l < r)
        {
            // look for odds
            while(l < A.length && A[l] % 2 == 0) l++;
            
            if(l >= A.length)
                break;
            
            // look for evens
            while(r > 0 && A[r] % 2 == 1) r--;
            
            if(r < 0)
                break;
            
            if(l >= r)
                break;
            
            // swap
            temp = A[l];
            A[l] = A[r];
            A[r] = temp;
        }
        
        
        return A;
    }
    
    
    
    /*
    public int[] sortArrayByParity(int[] A) {
        // Accepted
        // Runtime: 1ms, faster than 99.97%
        // Memory: 41.6 mb, less tan 75.70%
        
        
        // create new array, add all evens, then add all odds
        int[] ans = new int[A.length];
        int a = 0;
        
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] % 2 == 0)
                ans[a++] = A[i];
        }
        
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] % 2 == 1)
                ans[a++] = A[i];
        }
        
        return ans;
    }
    */
    
}
