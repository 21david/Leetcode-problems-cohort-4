/*
https://leetcode.com/problems/implement-stack-using-queues/
*/

class MyStack {
    Queue<Integer> queue = new LinkedList<>();
    // add()
    // remove()
    // element()
    
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        //temporarily pop all values to get the last one
        ArrayList<Integer> temp = new ArrayList<>();
        while(!queue.isEmpty())
        {
            temp.add(queue.remove());
        }
        
        int returnValue = temp.remove(temp.size() - 1);
        
        // put all values back
        for(int i = 0; i < temp.size(); i++)
        {
            queue.add(temp.get(i));
        }
        
        return returnValue;
    }
    
    /** Get the top element. */
    public int top() {
        int returnValue = pop();
        push(returnValue);
        return returnValue;
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
