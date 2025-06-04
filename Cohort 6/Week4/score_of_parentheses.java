//  https://leetcode.com/problems/score-of-parentheses/

class Solution {
    public int scoreOfParentheses(String S) {
        // 2 ms, faster than 13.26%
        // 38.9 MB, less than 5.00%
        
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        
        // iterate through each parenthesis
        for(int i = 0; i < S.length(); i++)
        {
            if(S.charAt(i) == '(')
            {
                stack.push(total);
                total = 0;
            }
            else // if we found a closing parenthesis
            {
                // We add 1 to the current total value if it was a ()
                // Or we multiply the total value by 2
                // If we run into a '(' after, total gets pushed onto the stack
                // But if we run into a ')', total will get multiplied by 2 again
                total = stack.pop() + Math.max(2 * total, 1);
            }
        
        }
        
        
        return total;
    }
}

/*

Test cases:
"()"
expected: 1

"(()()()()())"
expected: 10

"(()(()())())"
expected: 12

"()(()()())(()())()()"
expected: 13

"((((()))))()(((()())(()())))()()(()(())((())))()(())()((()))((()))()()()"
expected: 80

*/
