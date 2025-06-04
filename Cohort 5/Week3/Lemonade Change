/*
https://leetcode.com/problems/lemonade-change/
*/

class Solution {
    final int FIVES = 0;
    final int TENS = 1;
    final int TWENTYS = 2;
    
    public boolean lemonadeChange(int[] bills) {
        // Accepted
        // 2 ms, faster than 78.67%
        // 42.1 mb, less tan 7.69%
        
        int[] cashier = new int[3]; // 5s, 10s, 20s
            
            for(int i = 0; i < bills.length; i++)
            {
                
                if(bills[i] == 5)
                {
                    cashier[FIVES]++;
                }
                
                else if (bills[i] == 10)
                {
                    if(cashier[FIVES] == 0) 
                        return false; // impossible to give change
                    else
                    {
                        cashier[FIVES]--;
                        cashier[TENS]++;
                    }
                }
                
                else if (bills[i] == 20)
                {
                    if(cashier[FIVES] == 0)
                        return false;
                    
                    else if(cashier[TENS] > 0 && cashier [FIVES] > 0)
                    {
                        cashier[TENS]--;
                        cashier[FIVES]--;
                        cashier[TWENTYS]++;
                    }
                    
                    else if (cashier[TENS] == 0 && cashier[FIVES] >= 3)
                    {
                        cashier[FIVES] -= 3;
                        cashier[TWENTYS]++;
                    }
                    
                    else
                        return false;
                    
                    
                }
                
                else // if bill is not 5, 10, or 20 (should never be the case though)
                    return false;
                
                
            } // end for loop
        
        // if after all customers, it hasn't return false, output is true
        return true;
    }
}
