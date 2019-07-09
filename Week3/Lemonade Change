/*
https://leetcode.com/problems/lemonade-change/
*/

class Solution {
    public boolean lemonadeChange(int[] bills) {
        // keep track of current bills
        int fives = 0;
        int tens = 0;
        
       for(int i = 0; i < bills.length; i++)
       {
           if(bills[i] == 5)
           {
               fives++;
               continue;
           }
           // must have a five
           else if(bills[i] == 10)
           {
               tens++;
               if(fives < 1)
                   return false;
               else
                   fives--;
           }
           // must have either a ten and a five, or three fives
           else if(bills[i] == 20)
           {
               if(tens >= 1 && fives >= 1)
               {
                   tens--;
                   fives--;
               }
               else if(fives >= 3)
               {
                   fives -= 3;
               }
               else
                   return false;
           }
           
       }
        
        // if all transactions were possible, return true
        return true;
    }
}
