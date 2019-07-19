/*
https://leetcode.com/problems/valid-parentheses/submissions/
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '[' || c == '{' )
                stack.push(c);
            else if(c == ')' || c == ']' || c == '}')
            {
                if(c == ')' && (stack.isEmpty() || stack.pop() != '('))
                    return false;
                else if(c == ']' && (stack.isEmpty() ||stack.pop() != '['))
                    return false;
                else if(c == '}' && (stack.isEmpty() ||stack.pop() != '{'))
                    return false;
            }
        }
        
        return stack.size() == 0;
    }
}
