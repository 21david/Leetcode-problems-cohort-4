/*
https://leetcode.com/problems/implement-stack-using-queues/
*/

/*
 * Accepted
 * 1 ms, faster than 100%
 * 37.4 mb, less than 6.67%
*/

class MyStack {

    Queue<Integer> queue;
    Queue<Integer> tempStorage;
    int size;
    
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
        tempStorage = new LinkedList<>();
        size = 0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        size++;
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        // move all but the last one to the temp storage
        for(int i = 0; i < size - 1; i++)
        {
            tempStorage.add(queue.remove());
        }
        // take the last element (as a stack is supposed to do)
        int popped = queue.remove();
        size--;
        
        // put the temp storage back into the main storage
        for(int i = 0; i < size; i++)
            queue.add(tempStorage.remove());
        
        return popped;
    }
    
    /** Get the top element. */
    public int top() {
        // move all but the last one to the temp storage
        for(int i = 0; i < size - 1; i++)
            tempStorage.add(queue.remove());
        System.out.println(queue);
        System.out.println(tempStorage);
        
        // peek the last element
        int popped = queue.peek();
        
        tempStorage.add(queue.remove());
        
        // put the temp storage back into the main storage
        for(int i = 0; i < size; i++)
            queue.add(tempStorage.remove());
        System.out.println(queue);
        System.out.println(tempStorage);
        
        return popped;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
