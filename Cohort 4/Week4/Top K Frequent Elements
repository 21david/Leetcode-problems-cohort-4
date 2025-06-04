/*
https://leetcode.com/problems/top-k-frequent-elements/
*/

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        ArrayList<Integer> set = new ArrayList<>();
        
        for(int n : nums)
            if(!set.contains(n))
                set.add(n);
        
        int[] arraySet = new int[set.size()];
        int[] frequencies = new int[arraySet.length];
        
        for(int i = 0; i < arraySet.length; i++)
            arraySet[i] = set.get(i);
        
        for(int i = 0; i < arraySet.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(arraySet[i] == nums[j])
                    frequencies[i]++;
            }
        }
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < k; i++)
        {
            // find max and remove
            int max = frequencies[0];
            int maxI = 0;
            for(int j = 1; j < frequencies.length; j++)
            {
                if(frequencies[j] > max) {
                    max = frequencies[j];
                    maxI = j;
                }
            }
            System.out.println(Arrays.toString(frequencies) + " " + maxI);
            answer.add(arraySet[maxI]);
            frequencies[maxI] = -1;
            
        }
        
        return answer;
        
    }
}
