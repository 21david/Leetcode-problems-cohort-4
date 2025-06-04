/*
40 ms, faster than 23.25%
66.6 mb, less than 6.38%
*/

class MyHashMap {
    boolean[] keys;
    int[] values;

    /** Initialize your data structure here. */
    public MyHashMap() {
        keys = new boolean[100000];
        values = new int[100000];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        keys[key] = true;
        values[key] = value;
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        // we check if keys[key] is true. if it is, there is a value in the hash map to return
        
        if(keys[key])  // if we have a value for key
            return values[key];
        else  // if we don't
            return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        // we can only remove if there's a value for key in the hash map
        if(keys[key])
            values[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
