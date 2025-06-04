/*
https://leetcode.com/problems/baseball-game/
*/

class Solution {
    public int calPoints(String[] ops) {
        // keep track of the rounds
        Stack<Integer> stack = new Stack<>();
        
        int totalScore = 0;
        
        for(int i = 0; i < ops.length; i++)
        {
            String current = ops[i];
            
            if(Character.isDigit( current.charAt(0) ) || current.charAt(0) == '-') // if digit
            {
                // add current round
                stack.push(Integer.parseInt(current));
                
                // add to total score
                totalScore += stack.peek();
            
            }
            else if(current.charAt(0) == 'C')
            {
                // subtract last round
                totalScore -= stack.peek();
                
                // remove last round
                stack.pop();
            }
            else if(current.charAt(0) == 'D')
            {
                // add twice the last round
                totalScore += stack.peek() * 2;
                
                // add twice the last round to stack
                stack.push(stack.peek() * 2);
            }
            else if(current.charAt(0) == '+')
            {
                // temporarily take the last 2 out
                int one = stack.pop();
                int two = stack.pop();
                
                // add to total score
                totalScore += one + two;
                
                // put them back, and put the newest added score
                stack.push(two);
                stack.push(one);
                stack.push(two + one);
            }
        }
        
        return totalScore;
        
    }
        
    /*
        Wrong solution, does not work except for small cases 
        
        int previous = 0;
        int secondPrevious = 0;
        int thirdPrevious = 0;
        
        int totalScore = 0;
        
        for(int i = 0; i < ops.length; i++)
        {
            String current = ops[i];
            
            if(Character.isDigit( current.charAt(0) ) || current.charAt(0) == '-') // if digit
            {
                thirdPrevious = secondPrevious;
                secondPrevious = previous;
                previous = Integer.parseInt(current); // convert from String to number
                
                totalScore += previous; // add to total score
                
                
            }
            else if(current.charAt(0) == 'C')
            {
                totalScore -= previous;
                
                previous = secondPrevious;
                secondPrevious = thirdPrevious;
                thirdPrevious = 0;
                
            }
            else if(current.charAt(0) == 'D')
            {
                totalScore += previous * 2;
                
                thirdPrevious = secondPrevious;
                secondPrevious = previous;
                previous = previous * 2;
            }
            else if(current.charAt(0) == '+')
            {
                totalScore += previous + secondPrevious;
                
                int temp = secondPrevious;
                
                thirdPrevious = secondPrevious;
                secondPrevious = previous;
                previous = temp + secondPrevious;
                
            }
            
            
        }
        
        return totalScore;
    }
    */
}
