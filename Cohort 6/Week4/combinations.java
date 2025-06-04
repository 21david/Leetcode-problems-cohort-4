//  https://leetcode.com/problems/combinations/

/*
1 ms, faster than 100%
40.9 MB, less than 37.50%
*/

class Solution {

    List<List<Integer>> combinations = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        
        // nArray will just store the numbers 1 ... n
        int[] nArray = new int[n];
        for(int i = 0; i < n; i++)
            nArray[i] = i + 1;
        
        // pointers will store the indices of different numbers in nArray
        // so every time, pointers will represent a new combination
        // (ex. [0, 1, 3] represents the combination [1, 2, 4])
        int[] pointers = new int[k];
        for(int i = 0; i < k; i++)
            pointers[i] = i;
        
        // repeatedly increase 'pointers' to add a new combination, until the limit is reached
        while(notAtLimit(pointers, n))
        { 
            addCombination(nArray, pointers); // add permutation represented by 'pointers'
            increment(pointers,  n); // "add 1" to the pointers array
        
        }
        
        return combinations;
    }
    
    // will only return false when the 'pointers' array reaches the limit
    // (when it's gone through all the different combinations)
    public boolean notAtLimit(int[] pointers, int n)
    {
        for(int i = 0, p = pointers.length - 1; i < pointers.length && p >= 0; i++, p--)
        {
            if(pointers[p] >= (n - i))
                return false;
        }
        
        // if all #s in pointers are less than #s in limit
        return true;
    }

    
    /*
    Example values for 'pointers'
    when n = 5, k = 3
    [0,1,2]
    [0,1,3]
    [0,1,4]
    [0,2,3]
    [0,2,4]
    [1,2,3]
    [1,2,4]
    [1,3,4]
    [2,3,4]
    [3,4,5] - limit

    increment() takes in a value from above and moves it up to the next one.
    */
    public static void increment(int[] pointers, int n)
    {

        for(int p = pointers.length - 1, i = 0; p >= 0; p--, i++)
        {
            // increment the values
            int j = p;
            int val = pointers[j] + 1;
            while(j < pointers.length)
            {
                pointers[j] = val++;
                j++;
            }

            if(pointers[p] == (n - i))
            {
                // if we surpassed the limit
                // continue along the for loop
                continue;
            }
            else
            {
                // in this case, we simply
                // increment the last digit
                // and return out of the method
                return;
            }
        }
    }

    
    // the ints in pointer represent one permutation
    // add that permutation to 'combinations'
    public void addCombination(int[] nArray, int[] pointers)
    {
        ArrayList<Integer> comb = new ArrayList<>();

        for(int i = 0; i < pointers.length; i++)
            comb.add(nArray[pointers[i]]);

        combinations.add(comb);
    }
}
