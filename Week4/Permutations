/*
https://leetcode.com/problems/permutations
*/

class Solution {
    
    
    public List<List<Integer>> permute(int[] nums) {
        
        ArrayList<Integer> numsList = new ArrayList<>();
        for(int n : nums)
            numsList.add(n);
        
        System.out.println(numsList);
        
        List<List<Integer>> found = permutations(numsList, new ArrayList<>(), new ArrayList<>());
        
        return found;
        
    }
    
    public List<List<Integer>> permutations(ArrayList<Integer> a, ArrayList<Integer> b, List<List<Integer>> found)
    {
        System.out.println(a + " .. " + b);
        if(a.size() == 0) {
            found.add(b);
        }
        int temp;
        
        for(int i = 0; i < a.size(); i++)
        {   
            
            // remove element temporarily
            temp = a.get(i);
            a.remove(i);
            
            ArrayList<Integer> b2 = new ArrayList<>();
            b2.addAll(b);
            b2.add(temp);
            
            permutations(a, b2, found);
            
            
            // add the element back at its original spot
            a.add(i, temp);
            
        }
        
        return found;
    }
}
