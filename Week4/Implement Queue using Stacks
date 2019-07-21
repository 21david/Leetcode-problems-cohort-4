/*
https://leetcode.com/problems/implement-queue-using-stacks/submissions/
*/

class MyQueue {
    Stack<Integer> stack = new Stack<>();
    
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // temporarily put all values into a temp list
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty())
        {
            list.add(stack.pop());
        }
        
        int returnValue = list.remove(list.size() - 1);
        
        for(int i = list.size() - 1; i >= 0; i--)
        {
            stack.push(list.get(i));
        }
        
        return returnValue;
    }
    
    /** Get the front element. */
    public int peek() {
        // temporarily put all values into a temp list
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty())
        {
            list.add(stack.pop());
        }
        
        int returnValue = list.get(list.size() - 1);
        
        for(int i = list.size() - 1; i >= 0; i--)
        {
            stack.push(list.get(i));
        }
        
        return returnValue;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
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
