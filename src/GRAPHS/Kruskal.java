package GRAPHS;

import java.util.ArrayList;
import java.util.Collections;

//KRUSKAL ALGORITHM FOR FINDING THE MINIMAL SPANNING TREE
public class Kruskal {

    static class Edge implements Comparable<Edge>{
        int src;
         int dest;
         int weight;
         Edge(int s, int d, int wt){
             this.src = s;
             this.dest = d;
             this.weight = wt;
         }
         @Override
         public int compareTo(Edge e2){
             return this.weight - e2.weight;
         }
    }

    public static void createGraph(ArrayList<Edge> edge){
        //EDGES
        edge.add(new Edge(0, 1, 10));
        edge.add(new Edge(0, 2, 15));
        edge.add(new Edge(0, 3, 30));
        edge.add(new Edge(1, 3, 40));
        edge.add(new Edge(2, 3, 50));
    }

    static int n  =4;// No of Vertices
    static int part[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for (int i=0; i<n;i++){
            part[i] = i;
        }

    }

    public static int find(int x){
        if (x == part[x]){
            return x;
        }
        return part[x] =find(part[x]);
    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB= find(b);

        if (rank[parA] == rank[parB]){
            part[parB] = parA;
            rank[parA]++;
        }else if (rank[parA] < rank[parB]){
            part[parA] = parB;
        }else {
            part[parB] = parA;
        }
    }
    public static void kruskalsMST(ArrayList<Edge> edges, int v){
        Collections.sort(edges);
        int MSTcost = 0;
        int count = 0;
        for (int i=0; count < v-1 ; i++){
            Edge e = edges.get(i);
            //(src, dest ,wt)
            int parA =  find(e.src);
            int parB =  find(e.dest);
            if (parA != parB){
                union(e.src, e.dest);
                MSTcost += e.weight;
                count++;
            }
        }
        System.out.println(MSTcost);
    }

    public static void main(String[] args) {
        int v= 4;
        ArrayList<Edge> edges= new ArrayList<>();
        init();
        createGraph(edges);
        kruskalsMST(edges, v);
    }
}
