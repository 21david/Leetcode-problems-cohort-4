//  https://leetcode.com/problems/baseball-game/

class Solution {
    public int calPoints(String[] ops) {
        // 2 ms, faster than 94.49%
        // 39.2 MB, less than 8.96%
        
        if(ops[0].equals("+") || ops[0].equals("D") || ops[0].equals("C"))
            return -1;
        
        int total = 0; // keep track of total points
        
        Stack<Integer> rounds = new Stack<>(); // keep track of how many points given in each round
        
        for(int i = 0; i < ops.length; i++)
        {
            String curRound = ops[i];
            
            switch(curRound)
            {
                case "D":
                {
                    int last = rounds.pop();
                    total += 2 * last;
                    rounds.push(last);
                    rounds.push(2 * last);
                    
                    break;
                }
                case "C":
                {
                    int last = rounds.pop();
                    total -= last;
                    
                    break;
                }
                case "+":
                {
                    if(rounds.size() < 2)
                        return -1;
                    int sum = 0;
                    int last = rounds.pop();
                    int secondLast = rounds.pop();
                    sum = last + secondLast;
                    rounds.push(secondLast);
                    rounds.push(last);
                    total += last + secondLast;
                    rounds.push(sum);
                    
                    break;
                }
                default: // if its a number
                {
                    total += Integer.parseInt(curRound);
                    rounds.push(Integer.parseInt(curRound));
                    
                    break;
                }
                    
            }
        }
        
        return total;
    }
}

/*

Additional test cases:
["5","2","C","D","+", "+"]
should be 55

["12", "19", "5", "10", "7"]
should be 53


["5", "15", "+"]
should be 40


*/
