/*
https://leetcode.com/problems/partition-labels/
*/

class Solution {
    public List<Integer> partitionLabels(String S) {
        // Accepted
        // 8 ms, faster than 19.61%
        // 38.2 mb, less than 5.19%
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int end = 0;
        
        for(int i = 0; i < S.length(); i = i)
        {
            char c = S.charAt(i);
            
            // find the last occurrence of c in S
            end = S.lastIndexOf(c);
            
            for(int j = i + 1; j < end; j++)
            {
                char c2 = S.charAt(j);
                
                if(S.lastIndexOf(c2) > end)
                    end = S.lastIndexOf(c2);
                
            }
            
            // end of interval found at this point in code
            
            list.add(end - i + 1);
            i = end + 1;
        
        }
        
        
        return list;
    }
}
