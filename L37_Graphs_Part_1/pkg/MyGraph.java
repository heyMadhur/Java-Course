package L37_Graphs_Part_1.pkg;

import java.util.ArrayList;

public class MyGraph {

    public ArrayList<Edge>[] createMyGraph(){
        // Drawing this graph
        //     (5)
        // 0 ------ 1
        //         / \
        //    (1) /   \ (3)
        //       /     \
        //      2 ----- 3
        //      |   (1)
        //      |
        //  (2) |
        //      4

        // Currently hardcoding the graph
        ArrayList<Edge> [] graph= new ArrayList[5];

        for(int i=0; i< graph.length; i++) {
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        
        graph[4].add(new Edge(4, 2, 2));

        return graph;
    }
    
}
