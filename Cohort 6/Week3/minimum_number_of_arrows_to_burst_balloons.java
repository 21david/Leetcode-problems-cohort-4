// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/

class Solution {
    public int findMinArrowShots(int[][] points) {
        // 356 ms, faster than 5.14%
        // 48.3 MB, less than 19.51%
        
        /*
        Greedy approach works. 
        If we sort by xstart, and shoot an arrow to the right of each balloon starting from the left,
        then repeat for whatever balloons remain, we will pop all balloons with the minimum
        number of shots.
        
        O(N*logN) time complexity
        */
        
        // 1. Sort by end points
        quickSort(points);
        
        int shots = 0;
        
        // iterate through all the balloons
        for(int i = 0; i < points.length; i++)
        {
            int[] cur = points[i];
            
            // this loop finds all the balloons that would be popped
            // if we shot the end of the current balloon
            while(i + 1 < points.length && cur[1] >= points[i + 1][0])
                i++;
            
            shots++;
        }
        
        
        return shots;
    }
    
    public void quickSort(int[][] array)
    {
        quickSort(array, 0, array.length - 1);
    }
    
    public void quickSort(int[][] array, int beg, int end)
    {
        if(beg < end) {
            int partInd = partition(array, beg, end);
            
            quickSort(array, beg, partInd - 1);
            quickSort(array, partInd + 1, end);
        }
    }
    
    public int partition(int[][] array, int beg, int end)
    {
        int pivot = array[end][1];
        int i = beg - 1;
        
        for(int j = beg; j < end; j++)
        {
            if(array[j][1] <= pivot) {
                i++;
                
                // swap i & j
                int[] temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // swap i + 1 & end
        int[] temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        
        return i + 1;
    }
}

/*

Test cases:
imgur.com/a/Fm2VsFx

[[2,6],[5,8],[10,11],[7,12],[9,15],[17,18],[20,21],[16,22]]
[[1,6],[8,9],[11,15]]
[[12,14],[2,7],[19,21],[24,27],[18,19],[8,15],[23,25],[26,29],[20,21],[9,11],[1,3],[11,12],[4,5]]

Expected output:

4
3
8

*/
