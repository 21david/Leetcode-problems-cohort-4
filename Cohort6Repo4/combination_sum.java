//  https://leetcode.com/problems/combination-sum/

/*
I could probably optimize this with dynamic programming/memoization
*/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // 105 ms, faster than 5.06%
        // 40 MB, less than 55.82%
        
        // Combinations will be stored in this set
        // HashSet so that no duplicate combinations will be stored
        HashSet<List<Integer>> resultSet = new HashSet<>();
        
        
        // Recursive function to find the combinations
        help(candidates, target, new ArrayList<>(), resultSet);
        
        
        // Convert answer to List<List<Integer>> and return
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> r : resultSet)
            result.add(r);
        
        return result;
    }
    
    
    /*
    Recursive function that will subtract all candidates from the target, and repeat
    again with all candidates, until base case of 0 (meaning we found a combination)
    or < 0 (meaning we didn't find a combination).
    */
    public void help(int[] candidates, int target, List<Integer> temp, HashSet<List<Integer>> result) {
        if(target == 0) {
            Collections.sort(temp);
            result.add(temp);
            return;
        }
        else if(target < 0)
            return;
        else {
            
            for(int num : candidates) {
                ArrayList<Integer> temp2 = new ArrayList(temp);
                temp2.add(num);
                help(candidates, target - num, temp2, result);
            }
            
        }
    }
}

/*

Test cases:

[2,3,6,7]
7

[3,6]
6

[2,3,6]
12


Expected outputs (inner arrays can be in any order):
[[2,2,3],[7]]

[[3,3],[6]]

[[2,2,2,3,3],[6,6],[3,3,6],[2,2,2,6],[2,2,2,2,2,2],[3,3,3,3]]

*/
