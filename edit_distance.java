//  https://leetcode.com/problems/edit-distance/


// recursive solution
class Solution {
    public int minDistance(String word1, String word2) {/
        // Time Limit Exceeded
        // Passes 25/1142 test cases
        
        return minDistanceHelper(word1, word2, word1.length() - 1, word2.length() - 1);
    }
    
    
    public int minDistanceHelper(String w1, String w2, int i, int j)
    {
        if(i == -1)
            return j + 1;
        else if(j == -1)
            return i + 1;
        
        // if last letters are equal, chop the last letters off of each word, and return the answer to that subproblem
        if(w1.charAt(i) == w2.charAt(j))
        {
            return minDistanceHelper(w1, w2, i-1, j-1);
        }
        
        // if not equal, take the minimum of replace, insert, and delete operations, and add 1
        else
        {
            int insert = minDistanceHelper(w1, w2, i, j-1);
            int replace = minDistanceHelper(w1, w2, i-1, j-1);
            int delete = minDistanceHelper(w1, w2, i-1, j);
            
            return min(insert, replace, delete) + 1;
        }
    }
    
    
    
    public static int min(int... args)
    {
        int min = args[0];
        
        for(int i = 1; i < args.length; i++)
            if(min > args[i])
                min = args[i];
        
        return min;
    }
}




/*

Test cases:
"horse"
"ros"
"zoologicoarchaeologist"
"zoogeologist"

"dinitrophenylhydrazine"
"benzalphenylhydrazone"
*/
