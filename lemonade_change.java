//  https://leetcode.com/problems/lemonade-change/

class Solution {
    public boolean lemonadeChange(int[] custBills) {
        // 3 ms, faster than 35.12%
        // 47.8 MB, less than 18.21%
        
        int[] bills = new int[3];  // [5s, 10s, 20s]
        
        for(int bill : custBills)
        {
            switch(bill)
            {
                case 5:
                    bills[0]++;
                    break;
                
                case 10:
                    // We need to have at least 1 five
                    bills[1]++;
                    
                    if(bills[0] > 0)
                        bills[0]--;
                    else
                        return false;
                    
                    break;
                    
                case 20:
                    //  We need either a 10 and a 5, or three 5s
                    bills[2]++;
                    
                    if(bills[1] > 0 && bills[0] > 0)
                    {
                        bills[1]--;
                        bills[0]--;
                    }
                    else if(bills[0] >= 3)
                        bills[0] -= 3;
                    else
                        return false;
                    
                    break;
            }
        }
        
        
        return true;  // if we never ran into problems
    }
}
