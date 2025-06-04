/*
https://leetcode.com/problems/fizz-buzz/
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        // Accepted
        // 5 ms, faster than 14.51%
        // 42.1 mb, less than 5.4%
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
        {
            if((i + 1) % 15 == 0)
                list.add("FizzBuzz");
            else if((i + 1) % 5 == 0)
                list.add("Buzz");
            else if((i + 1) % 3 == 0)
                list.add("Fizz");
            else
                list.add("" + (i+1));
        }
        
        return list;
    }
}
