package L37_Graphs_Part_1;

import java.util.*;

import L37_Graphs_Part_1.pkg.*;

public class BFS {
    // BFS says to visit its neighbour first, then visit other nodes --> Similar to
    // that of Trees Level Order Traversal

    public static void bfsGandaMyWay(ArrayList<Edge>[] graph) {
        // Start with any edge, here starting with 0
        Queue<Edge> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        // Initally, add and print the source
        q.add(graph[0].get(0));
        visited[graph[0].get(0).source] = true;
        System.out.print(graph[0].get(0).source+" ");

        while (!q.isEmpty()) {
            Edge e = q.remove();

            if (!visited[e.destination]) {
                visited[e.destination] = true;
                System.out.print(e.destination + " ");

                ArrayList<Edge> arr = graph[e.destination];
                // Add its Children
                for (int i = 0; i < arr.size(); i++) {
                    q.add(arr.get(i));
                }
            }
        }

        // System.out.println("Source= "+e.source);
    }

    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q= new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();

            if(!visited[curr]){
                visited[curr]=true;
                System.out.print(curr+" ");
                ArrayList<Edge> arr= graph[curr];
                for(int i=0;i<arr.size();i++){
                    q.add(arr.get(i).destination);
                }
            }
        }
    }
    public static void main(String[] args) {
        MyGraph mg = new MyGraph();
        ArrayList<Edge>[] graph = mg.createMyGraph();

        bfsGandaMyWay(graph);
        bfs(graph);

    }
}
