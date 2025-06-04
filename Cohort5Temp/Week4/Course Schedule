/*
https://leetcode.com/problems/course-schedule/
*/

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Accepted
        // 83 ms, faster than 9.7%
        // 43.2 mb, less than 97.69%
        
        // dfs approach: start a dfs at each node, and for each dfs, keep a list of already visited nodes
        // if one dfs ever reaches the node it started with, then there is a cycle and answer is false
        // if it never does and a dfs is performed for all nodes, then answer is true
        
        // I think this is O(N^2) approach
        
        // will use adjacency list
        
        // set up adjacency list
        ArrayList[] adjList = new ArrayList[numCourses];
        
        for(int i = 0; i < prerequisites.length; i++)
        {
            if(adjList[prerequisites[i][0]] == null)
            {
                adjList[prerequisites[i][0]] = new ArrayList<Integer>();
            }
            
            adjList[prerequisites[i][0]].add(prerequisites[i][1]);
            
        }
        
        // perform DFS searches starting from each node
        
        // iterate through adjacency list (array of ArrayLists)
        for(int i = 0; i < adjList.length; i++)
        {
            boolean cycle = doesDFSFindACycle(adjList, i);
            
            if(cycle)
                return false;
            
            System.out.println(i + " found cycle: " + cycle);
            
        }
        
        
        System.out.println(Arrays.toString(adjList));
        
        return true;
    }
    
    public boolean doesDFSFindACycle(ArrayList[] adjacencyList, int startPos)
    {
        ArrayList<Integer>[] adjList = (ArrayList<Integer>[]) adjacencyList;
        
        Stack<Integer> stack = new Stack<>();
        
        stack.push(startPos);
        boolean doneWithFirstIteration = false;
        
        int count = 0; // dfs should do iterations for the length of the list
        // so if it reaches more, then it's stuck in a cycle
        
        while(!stack.isEmpty())
        {
            if(count > adjList.length) // stuck in a cycle
                return true;
            
            int node = stack.pop();
            
            if(node == startPos && doneWithFirstIteration) // then it reached the starting node, so a cycle
                return true;
            
            
            if(adjList[node] == null) // dead end
                continue;
            
            for(int i = 0; i < adjList[node].size(); i++)
            {
                stack.push(adjList[node].get(i));
            }
            
        
            doneWithFirstIteration = true;
            count++;
        }
        
        // if DFS finished without returning true, then no cycle is found
        return false;
    
    }
}
