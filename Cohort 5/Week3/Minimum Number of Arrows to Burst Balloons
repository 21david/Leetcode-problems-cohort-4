/*
https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
*/

class Solution {
    public int findMinArrowShots(int[][] points) {
        // Accepted
        // 554 ms, faster than 5.13%
        // 47.3 mb, less than 14.29%
        
        // Runtime could probably be improved by changing the for loop(s) in the while loop
        
        
        if(points.length == 0)
            return 0;
        
        // first sort the balloons by their start points
        quickSort(points);
        
        int[] pop = points[0];
        int arrow = pop[1];
        
        int popCount = 0;
        int arrowCount = 0;
        
        while(popCount < points.length)
        {
            arrowCount++;
            
            // O(N) for this loop
            for(int i = 0; i < points.length; i++)
            {
                if(points[i] == null)
                    continue;
                
                if(points[i][0] <= arrow && points[i][1] >= arrow)
                {
                    points[i] = null; // pop balloon
                    popCount++; // add to count
                }
            }
            
            // then find the next non-popped balloon, and set arrow to the end point of that balloon
            for(int i = 0; i < points.length; i++)
            {
                if(points[i] == null)
                    continue;
                else
                {
                    pop = points[i];
                    arrow = pop[1];
                    break;
                }
            }
            
        }
        
        return arrowCount;
        
    }
    
    
    // modified quick sort to sort by the end points
    // (sorts by the 2nd element of every array within the array)
    
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
	    int pivot = arr[end][1];
	    int i = (begin-1);
	 
	    for (int j = begin; j < end; j++) {
	        if (arr[j][1] <= pivot) {
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
