package L37_Graphs_Part_1;

import L37_Graphs_Part_1.pkg.*;
import java.util.*;

public class T1_Has_Path {

    public static boolean hasPath(ArrayList<Edge> [] graph, int src, int des, boolean [] visited){
        if(visited[src]) return false;
        if(src==des) return true;

        visited[src]= true;
        ArrayList<Edge> arr= graph[src];
        for (int i = 0; i < arr.size(); i++) {
            Edge e= arr.get(i);
            if(hasPath(graph, e.destination, des, visited)) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        MyGraph mg= new MyGraph();
        ArrayList<Edge> [] graph= mg.createMyGraph();

        System.out.println(hasPath(graph, 0, 5, new boolean[graph.length]));


        
    }
}
