package GRAPHS.REVISION;

import java.util.ArrayList;
import java.util.List;

public class G1 {
    class Pair{
        int node;
        int weight;
        Pair(int n , int w){
            node = n;
            weight = w;
        }

        @Override
        public String toString(){
            return "(" + node +", " + weight + ")";
        }
    }
    int[][] adjMatrix;

    List<List<Integer>> adjList;
    List<List<Pair>> adjListWithWeight;

    G1(int nodes){
        adjMatrix = new int[nodes][nodes];
        adjList = new ArrayList<>();
        adjListWithWeight = new ArrayList<>();
        for(int i = 0; i < nodes; i++){
            adjList.add(new ArrayList<>());
            adjListWithWeight.add(new ArrayList<>());
        }
    }


//  IMPLEMENTATION OF GRAPH USING MATRIX
    public void addEdges(int[][] edges, boolean isDirected){
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            //directed
            if(isDirected){
                adjMatrix[u][v] = 1;
            }else{
//              undirected
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }

        }
    }

    public void addEdgesWithWeightInMatrix(int[][] edges, boolean isDirected){
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            //directed
            if(isDirected){
                adjMatrix[u][v] = w;
            }else{
//              undirected
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            }

        }
    }

    public void printMatrix(){
        for(int i = 0; i < adjMatrix.length; i++){
            System.out.print("Row -> " + i + " -> ");
            for(int j = 0; j < adjMatrix[i].length; j++){
                System.out.print(adjMatrix[i][j] +", ");
            }
            System.out.println();
        }
    }


//  IMPLEMENTATION OF GRAPH USING LIST
    public void addEdgesList(int[][] edges, boolean isDirected){
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            //directed
            if(isDirected){
                adjList.get(u).add(v);
            }else{
//              undirected
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }

    public void addEdgesWithWeightInList(int[][] edges, boolean isDirected){
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            //directed
            if(isDirected){
                Pair pair = new Pair(v, w);
                adjListWithWeight.get(u).add(pair);
            }else{
//              undirected
                Pair pair1 = new Pair(v, w);
                Pair pair2 = new Pair(u, w);
                adjListWithWeight.get(u).add(pair1);
                adjListWithWeight.get(v).add(pair2);
            }
        }
    }

    public void printList(){
        for(int i = 0; i < adjList.size(); i++){
            System.out.print(i + " -> ");
            System.out.print("[");
            for(int j = 0; j < adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j));
                if(j != adjList.get(i).size() - 1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public void printWeightedList(){
        for(int i = 0; i < adjListWithWeight.size(); i++){
            System.out.print(i + " -> ");
            System.out.print("[");
            for(int j = 0; j < adjListWithWeight.get(i).size(); j++){
                System.out.print(adjListWithWeight.get(i).get(j));
                if(j != adjListWithWeight.get(i).size() - 1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

//    DEGREE OF UN-DIRECTED GRAPH
    public void findUndirectedDegree(int[][] edges, int nodes){
        int[] degree = new int[nodes];
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            degree[u]++;
            degree[v]++;
        }

//        print
        for(int i = 0; i < nodes; i++){
            System.out.println("Node -> " + i + " -> Degree -> " +degree[i]);
        }
    }

//    DEGREE OF DIRECTED GRAPH
    public void findDirectedDegree(int[][] edges, int nodes){
        int[] inDegree = new int[nodes];
        int[] outDegree = new int[nodes];
        for(int[] edge: edges){
            int from = edge[0];
            int to = edge[1];
            inDegree[to]++;
            outDegree[from]++;
        }

//        print
        for(int i = 0; i < nodes; i++){
            System.out.print("Node -> " + i + " -> in-Degree -> " +inDegree[i] + " - ");
            System.out.print("Node -> " + i + " -> out-Degree -> " +outDegree[i]);
            System.out.println();
        }
    }


    
    public static void main(String[] args) {

//        GRAPH USING MATRIX
        /*
        int edges[][] = {{0,2}, {0,1}, {1,3}};
        int nodes = 4;
        G1 graph = new G1(nodes);
        G1 graph2 = new G1(nodes);
        System.out.println("Un-Directed Graph Using Matrix: - ");
        graph.addEdges(edges,false);
        graph.printMatrix();
        System.out.println();

        System.out.println("Directed Graph Using Matrix: - ");
        graph2.addEdges(edges, true);
        graph2.printMatrix();
         */

        /*
        int edges[][] = {{0,2,10}, {0,1,20}, {1,3,30}};
        int nodes = 4;
        G1 graph = new G1(nodes);
        G1 graph2 = new G1(nodes);
        System.out.println(" Weighted Un-Directed Graph Using Matrix: - ");
        graph.addEdgesWithWeightInMatrix(edges,false);
        graph.printMatrix();
        System.out.println();

        System.out.println("Weighted Directed Graph Using Matrix: - ");
        graph2.addEdgesWithWeightInMatrix(edges, true);
        graph2.printMatrix();
         */


//      GRAPH USING LIST
        /*
        int edges[][] = {{0,2,10}, {0,1,20}, {1,3,30}};
        int nodes = 4;
        G1 graph = new G1(nodes);
        G1 graph2 = new G1(nodes);
        System.out.println("Un-Directed Graph Using List:- ");
        graph.addEdgesList(edges,false);
        graph.printList();
        System.out.println();

        System.out.println("Directed Graph Using List:- ");
        graph2.addEdgesList(edges, true);
        graph2.printList();
        */

        /*
        int edges[][] = {{0,2,10}, {0,1,20}, {1,3,30}};
        int nodes = 4;
        G1 graph = new G1(nodes);
        G1 graph2 = new G1(nodes);
        System.out.println(" Weighted Un-Directed Graph Using list:- ");
        graph.addEdgesWithWeightInList(edges,false);
        graph.printWeightedList();
        System.out.println();

        System.out.println("Weighted Directed Graph Using list:- ");
        graph2.addEdgesWithWeightInList(edges, true);
        graph2.printWeightedList();

         */

//        DEGREE'S
        G1 graph = new G1(4);
        int edges[][] = {{0,2}, {0,1}, {1,3}};
        int nodes = 4;
        System.out.println("Un-Directed Graph");
        graph.findUndirectedDegree(edges, nodes);
        System.out.println();

        System.out.println("Directed Graph");
        graph.findDirectedDegree(edges, nodes);

    }
}
