//  https://leetcode.com/problems/implement-stack-using-queues/

/*
0 ms, faster than 100.00%
38.6 MB, less than 5.09%
*/
class MyStack {
    Queue<Integer> queue;
    Queue<Integer> tempStorage;
    
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
        tempStorage = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        // move all but the last one to the temp storage
        while(queue.size() > 1)
        {
            tempStorage.offer(queue.poll());
        }
        
        // take the last element (as a stack is supposed to do)
        int polledElement = queue.poll();
        
        // put the temp storage back into the main storage
        while(!tempStorage.isEmpty())
        {
            queue.offer(tempStorage.poll());
        }
        
        return polledElement;
    }
    
    /** Get the top element. */
    public int top() {
        // move all but the last one to the temp storage
        while(queue.size() > 1)
        {
            tempStorage.offer(queue.poll());
        }
        
        // take the last element
        int polledElement = queue.poll();
        
        // put the temp storage back into the main storage
        // and put the polledElement back into the main storage
        // (since its just a peek)
        while(!tempStorage.isEmpty())
        {
            queue.offer(tempStorage.poll());
        }
        
        queue.offer(polledElement);
        
        return polledElement;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
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
