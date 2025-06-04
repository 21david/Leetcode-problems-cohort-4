/*
https://leetcode.com/problems/sort-array-by-parity/description/
*/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int k = 0;
        
        // Iterate through array, adding all evens to new array and setting them to -1
        for(int i = 0; i < A.length; i++)
        {
            if((A[i] & 1) == 0)
            {
                ans[k++] = A[i];
                A[i] = -1;
            }
        }
        
        // Iterate through array again, add remaining odd ints to new array
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] >= 0)
                ans[k++] = A[i];
        }
        
        return ans;
            
    }


    /*
      // Another way
        int l = 0;
        int r = A.length - 1;
        
        while(l < r)
        {
            if(A[l] % 2 == 1 && A[r] % 2 == 0)
            {
                int t = A[l];
                A[l] = A[r];
                A[r] = t;
            }
            
            if(A[l] % 2 == 0) l++;
            if(A[r] % 2 == 1) r--;
        }
        
        return A;
    }
    */
    
    
    /*
     // Another way
        int[] separated = new int[A.length];
        
        int a = 0;
        int b = A.length - 1;
        for(int i = 0; i < A.length; i++)
            if(A[i] %2 == 0)
                separated[a++] = A[i];
            else
                separated[b--] = A[i];
        
        return separated;
        
    }
    */
}
