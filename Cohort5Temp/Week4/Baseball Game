/*
https://leetcode.com/problems/baseball-game/
*/

class Solution {
    public int calPoints(String[] ops) {
        // Accepted
        // 2 ms, faster than 91.89%
        // 37.7 mb, less than 7.69%
        
        if(ops[0].equals("C") || ops[0].equals("D") || ops[0].equals("+"))
            return 0;
        
        ArrayList<Integer> prev = new ArrayList<>();
        
        int sum = 0;
        
        for(int i = 0; i < ops.length; i++)
        {
            if( ops[i].charAt(0) == '-' || Character.isDigit(ops[i].charAt(0)) ) // if a number
                prev.add(Integer.parseInt(ops[i]));
            else if( ops[i].equals("C") )
            {
                prev.remove(prev.size() - 1);
            }
            else if( ops[i].equals("D") )
            {
                if(prev.size() == 0)
                    return 0;
                prev.add( prev.get(prev.size() - 1) * 2 );
            }
            else if( ops[i].equals("+") )
            {
                if(prev.size() < 2)
                    return 0;
                prev.add( prev.get(prev.size() - 1) + prev.get(prev.size() - 2) );
            }
                
        }
        
        for(int i = 0; i < prev.size(); i++)
            sum += prev.get(i);
        
        return sum;
    }
}
