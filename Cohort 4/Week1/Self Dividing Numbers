/*
https://leetcode.com/problems/self-dividing-numbers/description/
*/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> nums = new ArrayList<>();
        
        for(; left <= right; left++)
        {
            if(isSelfDividing(left))
                nums.add(left);
        }
        
        return nums;
        
    }
    
    public boolean isSelfDividing(int num) {
        boolean itIs = true;
        
        int replica = num;
        
        while(replica > 0) 
        {
            int remainder = replica % 10;
            if(remainder == 0)
                return false;
            if(num % remainder != 0)
                return false;
            replica /= 10;
        }
        
        return true;
    }
}
