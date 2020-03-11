/*
https://leetcode.com/problems/is-graph-bipartite/
*/

class Solution {
    public static boolean isBipartite(int[][] graph) {
        // Accepted
        // 18 ms, faster than 5.43%
        // 42.6 mb, less than 65.85%
        
	    Map<Integer, Boolean> map = new HashMap<>();
	    map.put(0, false);
	    
	    Queue<Integer> queue = new LinkedList<>();
	    
	    HashSet<Integer> visited = new HashSet<>();
	    
	    while(visited.size() != graph.length) // this outer loop makes sure all disjoint graphs get a BFS, not just the initial one
	    {
            // look to see if any graphs need a bfs
	        for(int i = 0; i < graph.length; i++)
	        {
	            if(!visited.contains(i))
	            {
	                queue.add(i);
	                map.put(i, false);
	                break;
	            }
	        }
	    
	        // BFS
    	    while(!queue.isEmpty())
    	    {
    	        
    	        int node = queue.remove();
    	        if(visited.contains(node))
    	            continue;
                
                visited.add(node);
    	        
    	        // iterate through adjacent nodes
    	        for(int i = 0; i < graph[node].length; i++)
                {
                    if(!visited.contains(graph[node][i]))
                    {
                        queue.add(graph[node][i]);
                        map.put(graph[node][i], !map.get(node));
                    }
                    else
                    {
                    	
                    	if(map.get(node) == map.get(graph[node][i]))
                    	{
                    		System.out.println(node + " " + map.get(node) + "\n" + graph[node][i] + "  " + map.get(graph[node][i]));
                    		return false;
                    	}
                    }
                    
                }
    	        
    	    }
    	    
	    }
	    
	//    System.out.println(map.toString().replace(", ", "\n")); // prints colors of nodes   
	    
	    return true;
	}
}
