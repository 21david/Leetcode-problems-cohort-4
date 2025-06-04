//  https://leetcode.com/problems/merge-intervals/

class Solution {
    public int[][] merge(int[][] intervals) {
        // 8 ms, faster than 44.65%
        // 42.5 MB, less than 6.47%
        
        /*
        1. Sort the intervals by their start points
        2. Iterate through the intervals, merging interval i and i + 1 if they overlap
        */
        
        // 1. Sort by start point
        Arrays.sort(intervals, new Comparator<int[]>()
        {
           public int compare(int[] a, int[] b)
           {
                if(a[0] < b[0])
                    return -1;
               else if(a[0] > b[0])
                   return 1;
               else
                   return 0;
           }
        });
        
        
        // 2. Merge intervals wherever possible
        ArrayList<int[]> newIntervals = new ArrayList<>();
        int[] temp;
        int i = 0;
        
        while(i < intervals.length)
        {
            temp = intervals[i];
            
            // merge as many as possible into one interval
            while(i < intervals.length - 1 && (temp[1] <= intervals[i+1][1] && temp[1] >= intervals[i+1][0]
                 || intervals[i+1][1] >= temp[0] && intervals[i+1][1] <= temp[1]))
            {
                temp[0] = Math.min(temp[0], intervals[i+1][0]);
                temp[1] = Math.max(temp[1], intervals[i+1][1]);

                i++;
            }

            newIntervals.add(new int[] {temp[0], temp[1]});
            
            i++;
        }
        
        
        // convert answer to int[][] and return
        int[][] ans = new int[newIntervals.size()][];
        
        int a = 0;
        for(int[] intv : newIntervals)
            ans[a++] = intv;
        
        return ans;
    }
}
