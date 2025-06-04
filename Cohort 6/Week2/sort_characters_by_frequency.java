class Solution {
    public String frequencySort(String s) {
        // 6 ms, faster than 92.57%
        // 43.3 MB, less than 25.78%
        
        /* 
        1. Make a multiset that stores the frequency of each letter
        2. Make an array of size 75 that just contains all the possible input characters in order of ASCII value
           (['0', '1', '2', ... 'A', 'B', 'C', ... 'a', 'b', 'c', ... 'z'])
        3. Sort the multiset by descending order, but as you sort, make the same changes to the
           alphabet array as you do to the multiset. So the alphabet array will have
           the characters sorted by frequency in descending order in the end. 
        4. Use this array and the multiset to make the final string.
        
        Time complexity: O(NlogN)
        Space complexity: O(1) ?
        */
        
        int[] countFreq = new int[91];  // multiset that stores the frequency of each character in s
        char[] alphabet = new char[91]; // just stores the possible input characters
        
        // 1. fill up multiset
        for(char c : s.toCharArray())
            countFreq[c - ' ']++;
        
        // 2. fill up alphabet array
        char startLetter = ' ';
        for(char a = startLetter; a < startLetter + 91; a++)
            alphabet[a - ' '] = a;
        
        
        // 3. sort the multiset, while making the same changes to alphabet array
        quickSort(countFreq, alphabet);
        
        // 4. create the string
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        while(countFreq[i] > 0)
        {
            for(int n = 0; n < countFreq[i]; n++)
                sb.append(alphabet[i]);
            i++;
        }
        
        // return the answer
        return sb.toString();
    }
    
    public void quickSort(int[] array, char[] array2)
    {
        quickSort(array, array2, 0, array.length - 1);
    }
    
    public void quickSort(int[] arr, char[] arr2, int begin, int end)
    {
        if(begin < end)
        {
            int partitionIndex = partition(arr, arr2, begin, end);
            
            quickSort(arr, arr2, begin, partitionIndex - 1);
            quickSort(arr, arr2, partitionIndex + 1, end);
        }
    }
    
    public int partition(int[] arr, char[] arr2, int begin, int end)
    {
        int pivot = arr[end];
        int i = (begin - 1);
        
        for(int j = begin; j < end; j++)
        {
            if(arr[j] >= pivot)
            {
                i++;
            
                // swap i & j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // corresponding swap in arr2
                char tempCh = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = tempCh;
            }
        }
        
        // swap i + 1 & end
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        
        // corresponding swap in arr2
        char tempCh = arr2[i + 1];
        arr2[i + 1] = arr2[end];
        arr2[end] = tempCh;
        
        return i + 1;
    }
}
