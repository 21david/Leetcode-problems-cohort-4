//  https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 9 ms, faster than 92.75%
        // 42.2 MB, less than 21.57%
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Put all the elements into a map that counts the frequency of each number, O(N)
        for(int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);
        
        
        // Put all the elements in the map into a PriorityQueue that has the max
        // element as the root (a max heap basically), O(N)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        Iterator it = map.keySet().iterator();
        while(it.hasNext())
        {
            int key = (int) it.next();
            
            int[] entry = new int[2];
            entry[0] = key;
            entry[1] = map.get(key);
            
            pq.add(entry);
        }
        
        // create array to store final answer
        int[] answer = new int[k];
        int a = 0;
        
        // Remove the top K elements and put the keys into the answer array, O(klogN)?
        while(k > 0)
        {
            answer[a] = pq.poll()[0];
            a++;
            k--;
        }
        
        return answer;
    }
    
    
    /* This solution takes the same approach as the above solution,
    but uses a customly implemented MaxHeap data structure, instead of
    the PriorityQueue data structure */
    public int[] topKFrequent2(int[] nums, int k) {
        // 11 ms, faster than 73.81%
        // 42.2 MB, less than 19.57%
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Put all the elements into a map that counts the frequency of each number, O(N)
        for(int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        
        // Put all the elements in the map into a MaxHeap, O(N)
        MaxHeap heap = new MaxHeap();
        Iterator it = map.keySet().iterator();
        while(it.hasNext())
        {
            int key = (int) it.next();
            
            int[] entry = new int[2];
            entry[0] = key;
            entry[1] = map.get(key);
            
            heap.add(entry);
        }
        
        int[] answer = new int[k];
        int a = 0;
        
        // Remove the top K elements and put the keys into the answer array, O(klogN)?
        while(k > 0)
        {
            answer[a] = heap.poll()[0];
            a++;
            k--;
        }
        
        
        return answer;
    }
    
    
}

/*

Test cases:

[1,1,1,2,2,3]
2

output should be:  [1, 2]
 - there are three 1s and two 2s

[1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 8, 9]
2

output should be: [5, 4]
 - there are four 5s and three 4s

[6, 2, 5, 2, 6, 4, 1, 5, 3, 2, 6, 4, 2, 6, 1, 2, 2, 3, 1, 1, 6, 3]
3

output should be: [2, 6, 1]
 - there are six 2s, five 6s, and four 1s
 
 [7]
 1
 
 output should be: [7]

*/

// Max heap implementation: 
// This implementation stores arrays of size two,
// and compares everything using the second element of each array
// So we can store key-value pairs with this and sort them by their
// value.
public class MaxHeap {
    private int capacity = 10;
    private int size = 0;

    int[][] items = new int[capacity][];

    private int getLeftChildIndex(int parentIndex) { return 2 * parentIndex + 1; }
    private int getRightChildIndex(int parentIndex) { return 2 * parentIndex + 2; }
    private int getParentIndex(int childIndex) { return (childIndex - 1) / 2; }

    private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index) { return getRightChildIndex(index) < size; }
    private boolean hasParent(int index) { return getParentIndex(index) >= 0; }

    private int leftChild(int index) { return items[getLeftChildIndex(index)][1]; }
    private int rightChild(int index) { return items[getRightChildIndex(index)][1]; }
    private int parent(int index) { return items[getParentIndex(index)][1]; }

    private void swap(int indexOne, int indexTwo) {
        int[] temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    private void ensureExtraCapacity() {
        if(size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }
    
    public int peek() {
        if(size == 0)
            throw new IllegalStateException();
        return items[0][1];
    }

    public int[] poll() {
        if(size == 0)
            throw new IllegalStateException();
        int[] item = items[0];
        items[0] = items[size - 1]; // put the last element in the root element spot
        size--; // decrease size by 1

        heapifyDown(); // this will "bubble" the element down to its correct spot

        return item;
    }
    
    public void add(int[] item) {
        ensureExtraCapacity(); // make sure there's actually space
        items[size] = item; // add element to the first available spot
        size++; // increase size

        heapifyUp(); // "bubble" the element up to its right spot
    }
    
    public void heapifyUp() {
        int index = size - 1;

        while(hasParent(index) && parent(index) < items[index][1]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }
    
    public void heapifyDown() {
        int index = 0;
        
        while(hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && rightChild(index) > leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if(items[index][1] > items[smallerChildIndex][1]) {
                break;
            }
            else {
                swap(index, smallerChildIndex);
            }

            index = smallerChildIndex;
        }
    }
}
