/*
https://leetcode.com/problems/course-schedule-ii/
*/

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        // Make and fill an adjacency list from the given input
        ArrayList[] adj = new ArrayList[numCourses];
        
        for(int[] pair : prerequisites)
        {
            if(adj[ pair[0] ] == null)
                adj[ pair[0] ] = new ArrayList<>();
            
            adj[ pair[0] ].add( pair[1] );
        }
        
        // Find the indegrees of every node. O(V+E) time 
        int indegree[] = new int[numCourses];         
        for(int i = 0; i < numCourses; i++) 
        { 
            ArrayList<Integer> temp = (ArrayList<Integer>) adj[i]; 
            if(temp == null)
                continue;
            for(int node : temp) 
            { 
                indegree[node]++; 
            } 
        } 
          
        // Create a queue add all nodes that have no nodes pointing to it (indegree 0)
        Queue<Integer> S = new LinkedList<Integer>(); 
        for(int i = 0;i < numCourses; i++) 
        { 
            if(indegree[i]==0) 
                S.add(i); 
        } 
          
        // count of visited nodes 
        int cnt = 0; 
          
        // List to store nodes
        ArrayList <Integer> L = new ArrayList<Integer>(); 
        
        
        while(!S.isEmpty()) 
        { 
            // Take node from front of queue
            // and add it to the end of list L 
            int u = S.poll(); 
            L.add(u); 
            
            // iterate through all nodes that point to current node u, decrease indegree of it by 1
            if(adj[u] != null)
                for(int i = 0; i < adj[u].size(); i++) 
                { 
                    int node = (Integer) adj[u].get(i);

                    // If in-degree becomes zero, add it to queue 
                    if(--indegree[node] == 0) 
                        S.add(node); 
                } 
            cnt++; 
        } 
          
          
        // Print topological order             
        for(int i : L)
            System.out.print(i+" ");
        
        // If count differs from the number of courses, there is a cycle
        // if they are equal, there is no cycle in the graph
        if(cnt == numCourses)
        {
            int[] solution = new int[L.size()];

            for(int i = 0; i < L.size(); i++)
                solution[i] = L.get(L.size() - 1 - i);

            return solution;
        }
        else
        {
            return new int[0];
        }
    }
    
}
