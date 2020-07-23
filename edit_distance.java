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


// dynamic programming approach, bottom up
class Solution {
    public int minDistance(String word1, String word2) {
        // 31 ms, faster than 5.37%
        // 43.7 MB, less than 5.01%
        
        if(word1.length() == 0)
            return word2.length();
        else if(word2.length() == 0)
            return word1.length();
        
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        
        for(int i = 0; i <= word1.length(); i++)
            dp[i][0] = i;
        
        for(int i = 0; i <= word2.length(); i++)
            dp[0][i] = i;
        
        for(int r = 1; r <= word1.length(); r++)
        {
            for(int c = 1; c <= word2.length(); c++)
            {
                if(word1.charAt(r-1) == word2.charAt(c-1)) // if they are equal
                    dp[r][c] = dp[r-1][c-1];
                else
                    dp[r][c] = min(dp[r-1][c-1], dp[r-1][c], dp[r][c-1]) + 1;
            }
        }
        System.out.println(Arrays.deepToString(dp).replace("],", "\n"));
        
        return dp[word1.length()][word2.length()];
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
