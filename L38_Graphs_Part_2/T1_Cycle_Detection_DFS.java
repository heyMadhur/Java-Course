package L38_Graphs_Part_2;

import java.util.*;
import L38_Graphs_Part_2.pkg.*;

public class T1_Cycle_Detection_DFS {
    
    public static boolean isCyclic(ArrayList<Edge>[] graph){

        boolean [] visited= new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                isCyclicUtil(graph, visited, i, -1);
            }
        }
        return false;
    }
    public static boolean isCyclicUtil(ArrayList<Edge> [] graph,  boolean [] visited, int curr, int parent) {
        
        visited[curr]=true;
        ArrayList<Edge> arr= graph[curr];
        for (int i = 0; i < arr.size(); i++) {
            Edge e= arr.get(i);
            if(visited[e.destination] && curr!=parent){
                return true;
            } else {
               return isCyclicUtil(graph, visited, e.destination, curr);
            }
            
        }
        return false;
    }
}
