/*
https://leetcode.com/problems/course-schedule-ii/description/
*/

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        // dfs approach: start a dfs at each node, and for each dfs, keep a list of already visited nodes
        // if one dfs ever reaches the node it started with, then there is a cycle and answer is false
        // if it never does and a dfs is performed for all nodes, then answer is true
        
        // will use adjacency list
        
        // set up adjacency list
        ArrayList[] adjList = new ArrayList[numCourses];
        
        for(int i = 0; i < prerequisites.length; i++)
        {
            if(adjList[prerequisites[i][0]] == null)
                adjList[prerequisites[i][0]] = new ArrayList<Integer>();
            
            adjList[prerequisites[i][0]].add(prerequisites[i][1]);
            
        }
        
        // perform DFS searches starting from each node
        
        // iterate through adjacency list (array of ArrayLists)
        for(int i = 0; i < adjList.length; i++)
        {
            boolean cycle = doesDFSFindACycle(adjList, i);
            
            if(cycle)
                return new int[] {};
            
        }
        
        // if no cycle was ever found, then create a Graph object w/ the graph and
        // return a topological sort of graph
        
        Graph courses = new Graph(numCourses);
        
        // add all edges into the graph
        for(int i = 0; i < prerequisites.length; i++)
        {
            courses.addEdge(prerequisites[i][0], prerequisites[i][1]);
        }
        
        
        return courses.topologicalSort();
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
            if(count > adjList.length * adjList.length) // stuck in a cycle
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


// code from GeeksforGeeks
// www.geeksforgeeks.org/given-sorted-dictionary-find-precedence-characters/
class Graph 
{ 
  
    // An array representing the graph as an adjacency list 
    private final LinkedList<Integer>[] adjacencyList; 
  
    Graph(int nVertices) 
    { 
        adjacencyList = new LinkedList[nVertices]; 
        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) 
        { 
            adjacencyList[vertexIndex] = new LinkedList<>(); 
        } 
    } 
  
    // function to add an edge to graph 
    void addEdge(int startVertex, int endVertex) 
    { 
        adjacencyList[startVertex].add(endVertex); 
    } 
  
    private int getNoOfVertices() 
    { 
        return adjacencyList.length; 
    } 
  
    // A recursive function used by topologicalSort 
    private void topologicalSortUtil(int currentVertex, boolean[] visited, 
                                     Stack<Integer> stack) 
    { 
        // Mark the current node as visited. 
        visited[currentVertex] = true; 
  
        // Recur for all the vertices adjacent to this vertex 
        for (int adjacentVertex : adjacencyList[currentVertex]) 
        { 
            if (!visited[adjacentVertex]) 
            { 
                topologicalSortUtil(adjacentVertex, visited, stack); 
            } 
        } 
  
        // Push current vertex to stack which stores result 
        stack.push(currentVertex); 
    } 
  
    // prints a Topological Sort of the complete graph 
    public int[] topologicalSort() 
    { 
        Stack<Integer> stack = new Stack<>(); 
  
        // Mark all the vertices as not visited 
        boolean[] visited = new boolean[getNoOfVertices()]; 
        for (int i = 0; i < getNoOfVertices(); i++) 
        { 
            visited[i] = false; 
        } 
  
        // Call the recursive helper function to store Topological  
        // Sort starting from all vertices one by one 
        for (int i = 0; i < getNoOfVertices(); i++) 
        { 
            if (!visited[i]) 
            { 
                topologicalSortUtil(i, visited, stack); 
            } 
        } 
  
        int[] ans = new int[stack.size()];
        int a = stack.size() - 1;
        
        // Print contents of stack 
        while (!stack.isEmpty()) 
        {
            ans[a] = stack.pop();
            a--;
         //   System.out.print((stack.pop()) + " "); 
        } 
        
        return ans;
    } 
} 
