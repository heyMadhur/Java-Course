package L38_Graphs_Part_2;

import java.util.*;
import L38_Graphs_Part_2.pkg.*;

public class T1_Cycle_Detection_UnDirected_DFS {
    
    public static boolean isCyclic(ArrayList<Edge>[] graph){
        boolean [] visited= new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                if(isCyclicUtil(graph, visited, i, -1)){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static boolean isCyclicUtil(ArrayList<Edge> [] graph,  boolean [] visited, int curr, int parent) {
        visited[curr]=true;
        
        ArrayList<Edge> neighbors= graph[curr];
        for (int i = 0; i < neighbors.size(); i++) {
            Edge neighbor= neighbors.get(i);
            // Agr Visit Nahi hai toh jaake Visit kr
            if(!visited[neighbor.destination]){
                if(isCyclicUtil(graph, visited, neighbor.destination, curr)) {
                    return true;
                }
            }
            // Agr Visit hai toh check kr ki nighbor aur parent equal toh nahi, If Not, then it is a cycle for sure
            else if(visited[neighbor.destination] && neighbor.destination!=parent) {
                return true;
            }
        }

        return false;
    }
}
