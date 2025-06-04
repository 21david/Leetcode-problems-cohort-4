//  https://leetcode.com/problems/valid-parentheses/

/*
1 ms, faster than 99.17%
37.7 MB, less than 22.49%
*/

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray())
        {
            if( isOpeningBracket(c) )
            {
                stack.push(c);
            }
            else // its a closing bracket
            {
                if(stack.size() == 0)
                    return false;
                
                char stackPop = stack.pop();
                
                if(c == ')')
                {
                    if(stackPop == '(')
                        continue;
                    else
                        return false;
                }
                else if(c == ']')
                {
                    if(stackPop == '[')
                        continue;
                    else
                        return false;
                }
                else if(c == '}')
                {
                    if(stackPop == '{')
                        continue;
                    else
                        return false;
                }
            }
        }
        
        // only return true if there is no chars left in the stack
        return stack.size() == 0;
    }
    
    public boolean isOpeningBracket(char c)
    {
        return c == '(' || c == '[' || c == '{';
    }
}

/*

Test cases:

expected 'true' output:
"()"
"[]"
"{}"
"(()[]{})"
"[()[]{}]"
"{()[]{}}"
"([{(())[]}[]]({{}}){[]})"
"[]{{{()}}}[{}(([{()()}]))]"

expected 'false' output:
"}"
"]"
")"
"(()"
"{[(())]"
"{(})"
"[([)]"
"({)}[(])[{]}"
"())"
"(([{(})}]))"
"(([[{[{{}()([])}[[{}]]]{}}]()()]){}){{}()()(()){]}}"

*/
