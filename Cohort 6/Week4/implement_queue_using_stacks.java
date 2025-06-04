//  https://leetcode.com/problems/implement-queue-using-stacks/

/*
0 ms, faster than 100.00%
37.2 MB, less than 41.50%
*/
class MyQueue {
    Stack<Integer> mainStack, tempStack;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        mainStack = new Stack<>();
        tempStack = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        mainStack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // push all elements except the first one onto 'tempStack'
        while(mainStack.size() > 1)
            tempStack.push(mainStack.pop());
        
        // get the element we want (the 'first' one)
        int popped = mainStack.pop();
        
        // put all the remaining elements back onto 'mainStack'
        while(!tempStack.isEmpty())
            mainStack.push(tempStack.pop());
        
        return popped;
    }
    
    /** Get the front element. */
    public int peek() {
        // push all elements except the first one onto 'tempStack'
        while(mainStack.size() > 1)
            tempStack.push(mainStack.pop());
        
        // get the element we want (the 'first' one)
        int popped = mainStack.pop();
        
        // put all the remaining elements back onto 'mainStack'
        // but also put 'popped' in
        mainStack.push(popped);
        while(!tempStack.isEmpty())
            mainStack.push(tempStack.pop());
        
        return popped;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return mainStack.isEmpty();
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
