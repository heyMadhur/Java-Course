package L38_Graphs_Part_2;

import java.util.*;
import L38_Graphs_Part_2.pkg.*;

public class T3_Cycle_Detection_Directed_DFS {

    public boolean isCyclic(ArrayList<Edge> [] graph) {
        boolean [] visited= new boolean[graph.length];
        boolean [] path= new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]) {
                if(isCyclicUtil(graph, visited, path, i)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCyclicUtil(ArrayList<Edge> [] graph, boolean [] visited, boolean [] path, int curr) {
        
        visited[curr]=true;
        path[curr]= true;

        ArrayList<Edge> neighbors= new ArrayList<>();
        for (int i = 0; i < neighbors.size(); i++) {
            Edge neighbor= neighbors.get(i);
            if(!visited[neighbor.destination]){
                if(isCyclicUtil(graph, visited, path, curr)) {
                    return true;
                }
            }
            if(path[neighbor.destination]) {
                return true;
            }
        }
        path[curr]= false;
        return false;

    }
    
}
