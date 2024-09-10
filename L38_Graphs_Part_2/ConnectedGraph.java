package L38_Graphs_Part_2;

import java.util.*;

import L38_Graphs_Part_2.pkg.*;

public class ConnectedGraph {
    public static void bfs(ArrayList<Edge> [] graph){
        boolean [] visited= new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            
            if(!visited[i]){
                bfsUtil(graph, visited, i);
            }
            
        }
    }
    public static void bfsUtil(ArrayList<Edge> [] graph,  boolean [] visited, int src){
        Queue<Integer> q= new LinkedList<>();
        q.add(src);
        
        while (!q.isEmpty()) {
            int curr= q.remove();
            
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]= true;
                
                ArrayList<Edge> arr= graph[curr];
                for (int i = 0; i < arr.size(); i++) {
                    q.add(arr.get(i).destination); 
                }
            }
        }
    }
    
    public static void dfs(ArrayList<Edge> [] graph){
        boolean [] visited= new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]) {
                dfsUtil(graph, visited, i);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> [] graph,  boolean [] visited, int curr) {
        if(visited[curr]) return;

        System.out.print(curr+" ");
        visited[curr]= true;

        ArrayList<Edge> arr= graph[curr];
        for (int i = 0; i < arr.size(); i++) {
            dfsUtil(graph, visited, arr.get(i).destination);
        }
    }



}
