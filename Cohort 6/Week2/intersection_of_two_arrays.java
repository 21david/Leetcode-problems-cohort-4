class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 4 ms, faster than 38.7%
        // 41.1 mb, less than 10.28%
        
        // If we make a hash set and store all the numbers of one array into that set
        // Then we can iterate through the other array, checking to see if each number is in the set
        // If it is, add it to another set that will store the intersection
        // Time complexity: O(N1 + N2), where N1 and N2 are # of elements in the input arrays
        
        HashSet<Integer> nums1Set = new HashSet<>();
        
        for(int i : nums1)
            nums1Set.add(i);
        
        HashSet<Integer> intersection = new HashSet<>();
        
        for(int i : nums2)
            if(nums1Set.contains(i))
                intersection.add(i);
        
        int[] answer = new int[intersection.size()];
        int a = 0; // keep track of curent index for answer array
        
        Iterator it = intersection.iterator();
        
        while(it.hasNext())
            answer[a++] = (int) it.next();
        
        return answer;
    }
}
