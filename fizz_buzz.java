class Solution {
    public List<String> fizzBuzz(int n) {
        // 7 ms, faster than 25.27%
        // 40.7 mb, less than 46.48%
        
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 1; i <= n; i++)
        {
            if(i % 15 == 0)
                answer.add("FizzBuzz");
            else if(i % 3 == 0)
                answer.add("Fizz");
            else if(i % 5 == 0)
                answer.add("Buzz");
            else
                answer.add("" + i);
        }
        
        return answer;
        
    }
}
