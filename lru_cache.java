https://leetcode.com/problems/lru-cache/

/*
127 ms, faster than 12.28%
47.3 MB, less than 86.41%
*/

class LRUCache {
    
    /*
    We can use an ArrayList<int[]> to store the key-value pairs, and an integer to 
      keep track of the number of elements in the cache. The ArrayList will contain
      arrays of size 2 where the 1st element is the key and the 2nd element is the 
      value. A HashSet that stores the keys that we have can make it faster
      because we can know what to do after a O(1) operation, instead of an O(N) 
      search. (If we don't have the key, then we return -1 right away. If we do,
      then we search through thr ArrayList to find it.)
    Whenever an element is added, it is added to the end of the ArrayList. If we
      reached the capacity, we remove whatever is at the beginning of the ArrayList
      (index 0).
    Whenever an element is accesses, we will search thruogh the ArrayList to find it,
      and if we find it, move it to the end of the ArrayList and return the value.
      If we don't find it, we just return -1.
      
    (This does not give us optimal runtime complexity, because it would take
    O(N) to find an element in the cache, but it is a starting point.)
    */
    
    ArrayList<int[]> cache;
    HashSet<Integer> keys;
    int capacity, curSize;

    public LRUCache(int capacity) {
        cache = new ArrayList<>();
        keys = new HashSet<>();
        this.capacity = capacity;
        curSize = 0;
    }
    
    public int get(int key) {
        // O(N) search through the ArrayList to try to find the key-value pair
        // Whenever we find it, we also have to push that key-value pair to the back
        // (to the last index of ArrayList)
        for(int i = 0; i < cache.size(); i++)
        {
            if(cache.get(i)[0] == key)
            {
                // Here we must push it to the back of the ArrayList
                int[] keyValueRemoved = cache.remove(i);
                cache.add(keyValueRemoved);
                return keyValueRemoved[1];
            }
        }
        
        // if we never found it, return -1;
        return -1;
    }
    
    public void put(int key, int value) {
        // If we already have this key, then we should find it
        // and update it, instead of adding a duplicate
        
        if(keys.contains(key)) // if we know the key is in the ArrayList somewhere
        {
            // O(N) search for the key in the ArrayList
            for(int i = 0; i < cache.size(); i++)
            {
                if(cache.get(i)[0] == key) // if we found the key-value pair
                {
                    cache.set(i, new int[] {key, value}); // update the value
                    
                    // we also have to push it to the back
                    int[] keyValueRemoved = cache.remove(i);
                    cache.add(keyValueRemoved);
                    
                    // once we've found the key-value pair, we don't need
                    // to keep searching through the rest of the array
                    return;
                }
            }
        }
        else // if the key is not in the ArrayList
        {
            // put the key-value pair at the end of the ArrayList
            cache.add(new int[] {key, value});
            keys.add(key);
            curSize++;
            
            // if we surpassed capacity, we remove whatever
            // was at the front (index 0) of the ArrayList
            if(curSize > capacity)
            {
                int keyOfRemoved = cache.remove(0)[0];
                keys.remove(keyOfRemoved);
                curSize--;
            }
        }
            
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
