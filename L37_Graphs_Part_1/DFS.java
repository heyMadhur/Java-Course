package L37_Graphs_Part_1;

import L37_Graphs_Part_1.pkg.*;
import java.util.*;

public class DFS {

    public static void dfs(ArrayList<Edge> [] graph, int curr, boolean [] visited){
        if(visited[curr]) return;

        System.out.print(curr+" ");
        visited[curr]=true;
        
        ArrayList<Edge> arr= graph[curr];
        for(int i=0; i<arr.size(); i++){
            Edge e= arr.get(i);
            dfs(graph, e.destination, visited);
        }
    }

    public static void main(String[] args) {
        MyGraph mg= new MyGraph();
        ArrayList<Edge> [] graph= mg.createMyGraph();

        dfs(graph, 0, new boolean[graph.length]);



    }
    
}
