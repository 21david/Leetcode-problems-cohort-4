class Solution {
    public int[] sortArrayByParity(int[] A) {
        // 2 ms, faster than 21.5%
        // 45.5 mb, less than 11.67%
        
        // Runtime: O(N) (Two iterations across input array)
        // Space complexity: O(N). We created a new array the same size as the input array.
        
        int[] answer = new int[A.length];
        
        int a = 0;
        
        for(int i = 0; i < A.length; i++)
            //if even, add to next available index in Array
            if(A[i] % 2 == 0)
                answer[a++] = A[i];
        
        for(int i = 0; i < A.length; i++)
            if(A[i] % 2 == 1)
                answer[a++] = A[i];
        
        return answer;
    }
}
