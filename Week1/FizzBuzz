/*
https://leetcode.com/problems/fizz-buzz/description/
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> strings = new ArrayList<>();
        
        for(int i = 1; i <= n; i++)
        {
            if(i % 15 == 0)
                strings.add("FizzBuzz");
            else if(i % 5 == 0)
                strings.add("Buzz");
            else if(i % 3 == 0)
                strings.add("Fizz");
            else
                strings.add("" + i);
        }
        
        return strings;
        
    }
}
