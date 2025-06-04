/*
https://leetcode.com/problems/permutations/
*/

class Solution {
    
    ArrayList<List<Integer>> permutations = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        
        // Accepted
        // 2 ms, faster than 47.5%
        // 41.3 mb, less than 5.68%
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for(int n : nums)
            numbers.add(n);
        
        permutations(new ArrayList<>(), numbers);
        
        
        return permutations;
    }
    
    public void permutations(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        if(b.size() == 0)
            permutations.add(a);
        
        for(int i = 0; i < b.size(); i++)
        {
            ArrayList<Integer> newA = new ArrayList<>();
            for(int n : a)
                newA.add(n);
            
            ArrayList<Integer> newB = new ArrayList<>();
            for(int n : b)
                newB.add(n);
            
            newA.add(newB.get(i));
            
            int temp = newB.remove(i);
            
            permutations(newA, newB);
            
            newB.add(i, temp);
        }
    
    }
}
