/*
https://leetcode.com/problems/implement-queue-using-stacks/
*/

/*
 * Accepted
 * 0 ms, faster than 100%
 * 37.3 mb, less than 6.25%
 */

class MyQueue {

    Stack<Integer> stack;
    Stack<Integer> tempStorage;
    int size;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<Integer>();
        tempStorage = new Stack<>();
        size = 0;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
        size++;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        for(int i = 0; i < size - 1; i++)
            tempStorage.push(stack.pop());
        
        // then only 1 element left, the one we want
        int popped = stack.pop();
        size--;
        
        // put temp storage back into main stack
        for(int i = 0; i < size; i++)
            stack.push(tempStorage.pop());
        
        return popped;
    }
    
    /** Get the front element. */
    public int peek() {
        for(int i = 0; i < size - 1; i++)
            tempStorage.push(stack.pop());
        
        // then only 1 element left, the one we want
        int peekedElement = stack.peek();
        
        // put temp storage back into main stack
        for(int i = 0; i < size - 1; i++)
            stack.push(tempStorage.pop());
        
        return peekedElement;
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return size == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
