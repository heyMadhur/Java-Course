package L38_Graphs_Part_2;

import java.util.ArrayList;
import java.util.Stack;

import L37_Graphs_Part_1.pkg.Edge;

public class T4_Topological_Sort_DFS {
    
    public void topoSort(ArrayList<Edge> [] graph){
        boolean [] visited= new boolean[graph.length];
        Stack<Integer> st= new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                topoSortUtil(graph, visited, st, i);
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        System.out.println("Topological Sort= "+ans);
        
    }

    public void topoSortUtil(ArrayList<Edge> [] graph, boolean [] visited, Stack<Integer> st, int curr){
        visited[curr]= true;

        ArrayList<Edge> neighbors= graph[curr];
        for (int i = 0; i < neighbors.size(); i++) {
            Edge neighbor= neighbors.get(i);
            // Agr Visit Nahi hai toh jaake Visit kr
            if(!visited[neighbor.destination]){
                topoSortUtil(graph, visited, st, neighbor.destination);
            }
        }
        st.add(curr);
    }
}
