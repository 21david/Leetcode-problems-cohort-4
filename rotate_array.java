//  https://leetcode.com/problems/rotate-array/

/*
1 ms, faster than 54.10%
39.9 MB, less than 60.31%
*/

class Solution {
    public void rotate(int[] nums, int k) {
        
        if(k % nums.length == 0)
            return;
        else if (k >= nums.length)
            k = k % nums.length;
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < nums.length - k; i++)
        {
            queue.offer(nums[i]);
        }
        
        
        // copy the last k elements to the first k spots in array
        int[] ans = new int[nums.length];
        
        for(int i = nums.length - k, j = 0; i < nums.length; i++, j++)
        {
            ans[j] = nums[i];
        }
        
        // put the elements in the queue into the answer array
        int q = k;
        while(queue.size() > 0)
        {
            ans[k++] = queue.poll();
        }
        
        // copy all back to original array
        for(int i = 0; i < ans.length; i++)
            nums[i] = ans[i];
    }
}
