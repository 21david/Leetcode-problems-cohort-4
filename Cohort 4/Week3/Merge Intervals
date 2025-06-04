/*
https://leetcode.com/problems/merge-intervals/
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0)
            return new int[0][];
        
        // sort the intervals by their starting point
        Integer[][] list = new Integer[intervals.length][];
        
        for(int i = 0; i < intervals.length; i++)
            list[i] = new Integer[] {intervals[i][0], intervals[i][1]};
        
       Arrays.sort(list, new SortByFirst()); // (using a Comparator)
        
        // we're gonna iterate through the intervals, finding consecutively overlapping intervals, keeping track of a start and end point for those. When a new interval doesn't overlap with the previous start/end point, we add the start/end to a list as a merged interval, and start the process again.
        
        // Keep track of merged intervals
        ArrayList<int[]> merged = new ArrayList<>();
        
        // start and end points
        int start = list[0][0];
        int end = list[0][1];
        
        // iterate through intervals
        for(int i = 1; i < list.length; i++)
        {
            if( overlap(start, end, list[i][0], list[i][1]) ) // if the next interval overlaps, update end
            {
                end = Math.max(end, list[i][1]);
            }
            else // else it is a completely separate interval from the previous intervals
            {
                // add previous merged interval to a list
                System.out.println(start + " - " + end);
                merged.add(new int[] {start, end});
                
                // set start and end to the new interval
                start = list[i][0];
                end = list[i][1];
                
            }
        }
        
        // loop doesn't get to save last interval, so manually save it
        System.out.println(list[list.length - 1][0] + " - " + list[list.length - 1][1]);
        merged.add(new int[] {start, end});
        
        // Convert the data structures used into an int[][]
        int[][] mergedIntervals = new int[merged.size()][];
        for(int i = 0; i < merged.size(); i++)
        {
            mergedIntervals[i] = merged.get(i);
        }
        
        return mergedIntervals;    
    }
    
    // checks if [a1, a2] overlaps with [b1, b2]
    public boolean overlap(int a1, int a2, int b1, int b2)
    {
        if(a2 >= b1 && a1 <= b2)
            return true;
        else
            return false;
    }
}

// Comparator to sort the intervals by their beginning
class SortByFirst implements Comparator<Integer[]>
{
    public int compare(Integer[] o1, Integer[] o2)
    {
        if(o1[0] < o2[0])
            return -1;
        else if(o1[0] > o2[0])
            return 1;
        else return 0;
    }
}
