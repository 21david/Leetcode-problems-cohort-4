/*
https://leetcode.com/problems/rotate-array/
*/

class Solution {
    public void rotate(int[] nums, int k) {
        
    //  Runtime: 2 ms, faster than 25.95% of all java
        
        k = k % nums.length;
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = nums.length - k; i < nums.length; i++)
        {
            queue.add(nums[i]);
        }
        
        for(int i = 0; i < nums.length - k; i++)
        {
            queue.add(nums[i]);
        }
        
        
        int i = 0;
        while(!queue.isEmpty())
        {
            nums[i++] = queue.remove();
        }
        
    }
    
    
    /*
         
    // Runtime: 49.42% of all java
        
        k = k % nums.length;
        
        int[] temp = Arrays.copyOf(nums, nums.length);
        int t = 0;
        
        for(int i = nums.length - k; i < nums.length; i++)
        {
            temp[t++] =  nums[i];
        }
        
        for(int i = 0; i < nums.length - k; i++)
        {
            temp[t++] =  nums[i];
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = temp[i];
        }
        
    }
    */
    
    
    /*
    //  Runtime: 92ms, faster than 10.42% of all java
    //  36.7 MB, less than 100%
        
        k = (k % nums.length); // improve runtime for k >= nums.length
        
        for(int i = 0; i < k; i++)
        {
            // repeat k times: 
            // hold onto last element, move each element to the right 1, put last element into 1st element
            
            int temp = nums[nums.length - 1];
            
            for(int j = nums.length - 1; j >= 1; j--)
            {
                nums[j] = nums[j - 1];
            }
            
            nums[0] = temp;
        }
        
    }
    */
    
    
    /*
        Runtime: 4ms, faster than 24.41% of java
        37.4 MB, less than 100% of java
        
        k = (k % nums.length);
        
        // save the last k elements
        int[] temp = new int[k];
        int t = 0;
        
        for(int i = nums.length - k; i < nums.length; i++)
        {
            temp[t] = nums[i];
            t++;
        }
        
        System.out.println(Arrays.toString(temp));
        
        // shift all elements by k to the right
        
        for(int i = nums.length - k - 1; i >= 0; i--)
        {
            nums[i + k] = nums[i];
        }
        
        System.out.println(Arrays.toString(nums));
        
        
        // put the saved elements into the first k spots
        
        for(int i = 0; i < temp.length; i++)
        {
            nums[i] = temp[i];
        }
    }
    */
}
