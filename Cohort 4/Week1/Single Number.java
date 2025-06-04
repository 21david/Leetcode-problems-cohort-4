/*
https://leetcode.com/problems/single-number/description/
*/

class Solution {
    public int singleNumber(int[] nums) {
        
        int bits = 0;
        
        for(int num : nums)
            bits ^= num;
        
        return bits;
    }
        
        /*
        // Solution using arrays, O(N^2)
        //114 ms run time
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : nums)
            if(list.contains(num))
                list.remove((Integer) num);
            else
                list.add(num);
        
        // by the preconditions, there should only be 1 left, otherwise the input is wrong
        if(list.size() != 1)
            throw null;
        
        return list.get(0);
        
    }
    */
}
