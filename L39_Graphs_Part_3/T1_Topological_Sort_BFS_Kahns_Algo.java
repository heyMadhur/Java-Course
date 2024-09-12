package L39_Graphs_Part_3;

import java.util.*;

import L37_Graphs_Part_1.pkg.Edge;

public class T1_Topological_Sort_BFS_Kahns_Algo {

    public void topoSort(ArrayList<Edge>[] graph) {
        int[] indegree = new int[graph.length];
        ArrayList<Integer> ans= new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {

            topoSortUtil(graph, ans, indegree);
        }

        System.out.println("Topological Sort= ");

    }

    public void topoSortUtil(ArrayList<Edge>[] graph, ArrayList<Integer> ans, int[] indegree) {
        Queue<Integer> q= new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            // If Indegree of i is 0, it means it is starting Node. Add it in Queue
            if(indegree[i]==0) q.add(i);
        }
        while (!q.isEmpty()) {
            int curr= q.remove();

            ans.add(curr);
            indegree[curr]=-1;
            
            ArrayList<Edge> neighbors= graph[curr];
            for (int i = 0; i < neighbors.size(); i++) {
                Edge neighbor= neighbors.get(i);
                indegree[neighbor.destination]--;
                if(indegree[neighbor.destination]==0){
                    q.add(neighbor.destination);
                }
            }
        }
    }

    public void findInDegree(ArrayList<Edge>[] graph, int[] indegree) {
        for (int curr = 0; curr < graph.length; curr++) {
            ArrayList<Edge> neighbors = graph[curr];
            for (int j = 0; j < neighbors.size(); j++) {
                Edge neighbor = neighbors.get(j);
                indegree[neighbor.destination]++;
            }
        }
    }

}
