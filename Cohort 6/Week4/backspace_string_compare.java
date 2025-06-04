//  https://leetcode.com/problems/backspace-string-compare/

class Solution {
    public boolean backspaceCompare(String S, String T) {
        // 4 ms, faster than 12.57%
        // 38.8 MB, less than 12.58%
        
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        
        for(int i = 0; i < S.length(); i++)
        {
            if(S.charAt(i) == '#')
            {
                if(sStack.size() == 0)
                    continue;
                else
                    sStack.pop();
            }
            else
            {
                sStack.push(S.charAt(i));
            }
        }
        
        for(int i = 0; i < T.length(); i++)
        {
            if(T.charAt(i) == '#')
            {
                if(tStack.size() == 0)
                    continue;
                else
                    tStack.pop();
            }
            else
            {
                tStack.push(T.charAt(i));
            }
        }
        
        return sStack.equals(tStack);
        
    }
}

/*

Test cases:
"ab#c"
"ad#c"

"ab##"
"c#d#"

"a##c"
"#a#c"

"a#c"
"b"

"dazxy###vidd#"
"david"

"js#uh#mbb#leduio##pph#asy#l#sword"
"###jumbaa###blede#upu#pad#ss#swc#ordd#"

"#"
"#######"

"############"
"#"

*/
