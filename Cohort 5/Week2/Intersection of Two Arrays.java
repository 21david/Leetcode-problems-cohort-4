/*
https://leetcode.com/problems/intersection-of-two-arrays/
*/

class Solution {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        // Accepted
        // 11 ms, faster than 6.15%
        // 41.2 mb, less than 6.75%
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        Set<Integer> set1 = new HashSet<>();
        
        Set<Integer> set2 = new HashSet<>();
        
        // make a non-duplicate set of 1st array
        for(int n1 : nums1)
            set1.add(n1);
        
        // make a non-duplicate set of 2nd array
        for(int n2 : nums2)
            set2.add(n2);
        
        // add all to map including a count
        for(int n1 : set1)
            if(map.containsKey(n1))
                map.put(n1, map.get(n1) + 1);
            else
                map.put(n1, 1);
        
        // add all to map including a count
        for(int n2 : set2)
            if(map.containsKey(n2))
                map.put(n2, map.get(n2) + 1);
            else
                map.put(n2, 1);
        
        // map should have the number of times each element has appeared in either array
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(map);
        
        ArrayList<Integer> intersection = new ArrayList<>();
        
        Set<Integer> keySet = map.keySet();
        
        // find out which numbers appeared in both arrays
        for(Integer key : keySet)
        {
            if(map.get(key) > 1)
                intersection.add(key);
        }
        
        System.out.println(intersection);
        
        int[] ans = new int[intersection.size()];
        
        // convert arraylist with intersections into int[] array
        for(int i = 0; i < intersection.size(); i++)
            ans[i] = intersection.get(i);
        
        return ans;
        
    }
    
    
    public int[] intersection2(int[] nums1, int[] nums2) {
        // Accepted
        // 10 ms, faster than 6.15%
        // 39.8 mb, less than 6.75%
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int size = 0;
        
        for(int n1 : nums1)
            set.add(n1);
        
        for(int n2 : nums2)
            if(set.contains(n2))
                if(!list.contains(n2))
                {
                    list.add(n2);
                    size++;
                }
        
        int[] array = new int[size];
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
