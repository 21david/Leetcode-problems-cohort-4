/*
https://leetcode.com/problems/intersection-of-two-arrays/
*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        // make a set of all the elements in the first array
        HashSet<Integer> set1 = new HashSet<>();
        
        for(int num : nums1)
            set1.add(num);
        
        // iterate through second array, if an element is in both lists,
        // it belongs in intersection
        ArrayList<Integer> intersection = new ArrayList<>();
        
        for(int num : nums2)
            if(set1.contains(num))
            {
                // add only if its not already in intersection
                if(!intersection.contains(num))
                    intersection.add(num);
            }
        
        int[] ans = new int[intersection.size()];
        
        for(int i = 0; i < intersection.size(); i++)
            ans[i] = intersection.get(i);
        
        return ans;
    }
    
    /*
        // O(N^2) solution
        
        Set<Integer> set = new HashSet<>();
        
        for(int num1 : nums1)
            for(int num2 : nums2)
                if(num1 == num2)
                    set.add(num1);
        
        // turn set into int[] array
        int[] ans = new int[set.size()];
        
        Iterator it = set.iterator();
        
        int i = 0;
        while(it.hasNext())
        {
            ans[i] = (Integer) it.next();
            i++;
        }
        
        return ans;
    }
    */
    
}
