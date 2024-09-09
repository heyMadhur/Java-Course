package L37_Graphs_Part_1;

import java.util.*;

import L37_Graphs_Part_1.pkg.*;

public class BFS {
    // BFS says to visit its neighbour first, then visit other nodes --> Similar to that of Trees Level Order Traversal

    public static void bfs(ArrayList<Edge>[] graph) {
        // Start with any edge, here starting with 0
        Queue<Edge> q= new LinkedList<>();
        boolean [] visited= new boolean[graph.length];
        q.add(graph[0].get(0));

        while (!q.isEmpty()) {
            Edge e= q.remove();

            System.out.print(e.source+" ");

            // Add its Children
            ArrayList<Edge> arr= graph[e.destination];
            System.out.println("Source= "+e.source);
            for (int i = 0; i < arr.size(); i++) {
                System.out.println("Des= "+ arr.get(i).destination);
                if(!visited[arr.get(i).source]){
                    visited[arr.get(i).source]= true;
                    q.add(arr.get(i));
                }
            }
        }

    }
    public static void main(String[] args) {
        MyGraph mg= new MyGraph();
        ArrayList<Edge>[] graph= mg.createMyGraph();

        bfs(graph);

    }
}
