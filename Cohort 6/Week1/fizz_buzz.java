class Solution {
    public List<String> fizzBuzz(int n) {
        // 1 ms, faster than 99.71%
        // 40.7 mb, less than 53.17%
        
        List<String> answer = new ArrayList<String>();
        
        for(int i = 1; i <= n; i++)
        {
            if(i % 15 == 0)
                answer.add("FizzBuzz");
            else if(i % 3 == 0)
                answer.add("Fizz");
            else if(i % 5 == 0)
                answer.add("Buzz");
            else
                answer.add(Integer.toString(i));
        }
        
        return answer;
        
    }
}
