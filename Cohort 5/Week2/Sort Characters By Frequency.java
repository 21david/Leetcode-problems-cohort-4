/*
https://leetcode.com/problems/sort-characters-by-frequency/
*/

class Solution {
     public String frequencySort(String s) {
        // Accepted
        // 4 ms, faster than 98.45%
        // 41.4 mb, less than 7.41%
        
        // This method uses StringBuilder
         
        char[] chars = new char[128];
        int[] freq = new int[128];
        
        for(char c : s.toCharArray())
        {
            chars[c] = c;
            freq[c]++;
        }
        
        // sort the freq array decreasing, and make the exact same sorting on the chars array
        quickSort(freq, chars);
        
        
        // Construct the final string
        StringBuilder output = new StringBuilder();
        int i = 0; 
        while(i < 128)
        {
            if(freq[i] == 0)
                break;
            
            // add the corresponding number of characters to the string
            for(int j = 0; j < freq[i]; j++)
                output.append(chars[i]);
            
            i++;
        
        }
        
        return output.toString();
    }
    
    public String frequencySortString(String s) {
        // Accepted
        // 524 ms, faster than 5.04%
        // 42.3 mb, less than 7.41%
        
        // This method uses a strings and string concatenation
        
        
        char[] chars = new char[128];
        int[] freq = new int[128];
        
        for(char c : s.toCharArray())
        {
            chars[c] = c;
            freq[c]++;
        }
        
        // sort the freq array decreasing, and make the exact same sorting on the chars array
        quickSort(freq, chars);
        
        
        // Construct the final string
        String output = "";
        int i = 0; 
        while(i < 128)
        {
            if(freq[i] == 0)
                break;
            
            // add the corresponding number of characters to the string
            for(int j = 0; j < freq[i]; j++)
                output += chars[i];
            
            i++;
        
        }
        
        return output;
    }
    
    
    
    // Quick sort algorithm
    public static void quickSort(int[] arr, char[] arr2)
	{
		quickSort(arr, arr2, 0, arr.length - 1);
	}
	
	public static void quickSort(int arr[], char[] arr2, int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, arr2, begin, end);
	 
	        quickSort(arr, arr2, begin, partitionIndex-1);
	        quickSort(arr, arr2, partitionIndex+1, end);
	    }
	}
	
	private static int partition(int arr[], char[] arr2, int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);
	 
	    for (int j = begin; j < end; j++) {
	        if (arr[j] >= pivot) {
	            i++;
	 
	            // swap
	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
                
                // then corresponding swap on character array
                char swapTemp2 = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = swapTemp2;
	        }
	    }
	 
	    // swap
	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;
        
        // then corresponding swap on character array
        char swapTemp2 = arr2[i + 1];
        arr2[i + 1] = arr2[end];
        arr2[end] = swapTemp2;
	 
	    return i+1;
	}
}
