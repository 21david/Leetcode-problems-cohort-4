/*
https://leetcode.com/problems/merge-intervals/
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        // Accepted
        // 4 ms, faster than 95.77%
        // 41.5 mb, less than 55.08%
        
        if(intervals.length == 0)
            return new int[0][];
        
        // sort by the start points
        quickSort(intervals);
        
        ArrayList<int[]> list = new ArrayList<>();
        
        list.add(intervals[0]);
        boolean newInterval = true;
        
        
        for(int i = 1; i < intervals.length; i++)
        {
            newInterval = true;
            
            for(int j = 0; j < list.size(); j++)
            {
                if( withinBounds(intervals[i], list.get(j)) )
                {
                    int min = list.get(j)[0];
                    int max = Math.max(list.get(j)[1], intervals[i][1]);
                    
                    list.remove(list.get(j));
                    list.add(new int[] {min, max});
                    
                    newInterval = false;
                }
            }
            
            // if it didn't belong to any previous interval, then new interval
            if(newInterval)
                list.add(intervals[i]);
            
        }

        
        // Conversion from ArrayList to int[][]
        int[][] answer = new int[list.size()][2];
        
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        
        
        return answer;
        
    }
    
    // returns true if the start point of x1 lies inside the range of x2
    public boolean withinBounds(int[] x1, int[] x2)
    {
        if(x1[0] >= x2[0] && x1[0] <= x2[1])
            return true;
        else
            return false;
    }
    
    public boolean equal(int[] x1, int[] x2)
    {
        if(x1[0] == x2[0] && x1[1] == x2[1])
            return true;
        else
            return false;
        
        
    }
    
    // ***********************************************************
    // modified quick sort to sort by the start points
    // (sorts by the 1nd element of every array within the array)
    
    public static void quickSort(int[][] arr)
	{
		quickSort(arr, 0, arr.length - 1);
	}
	
	public static void quickSort(int arr[][], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);
	 
	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
	}
	
	private static int partition(int arr[][], int begin, int end) {
	    int pivot = arr[end][0];
	    int i = (begin-1);
	 
	    for (int j = begin; j < end; j++) {
	        if (arr[j][0] <= pivot) {
	            i++;
	 
	            // swap
	            int[] swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }
	 
	    // swap
	    int[] swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;
	 
	    return i+1;
	}
    
}
