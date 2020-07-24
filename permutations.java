class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // 1 ms, faster than 94.12%
        // 39.4 MB, less than 85.44%
        
        // convert int[] array to ArrayList<Integer>
        ArrayList<Integer> numsList = new ArrayList<>();
        for(int n : nums)
            numsList.add(n);
        
        
        permutations(numsList, new ArrayList<>());
        
        
        return perms;
    }
    
    // keep track of the found permutations
    List<List<Integer>> perms = new ArrayList<>();
    
    public void permutations(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        // base case: a is empty (if a is empty, b is one of the permutations)
        if(a.size() == 0)
        {
            perms.add(b);
        }
        
        // for each element of a, remove it, add the removed number to b, and do a recursive call
        for(int i = 0; i < a.size(); i++)
        {
            int removed = a.remove(i);
            
            ArrayList<Integer> newB = new ArrayList<>(b);
            newB.add(removed);
            
            ArrayList<Integer> newA = new ArrayList<>(a);
            
            permutations(newA, newB);
            
            a.add(i, removed); // add the removed int back to its original spot
        }
    }
}
