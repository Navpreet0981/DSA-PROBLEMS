package GRAPHS;

import java.util.ArrayList;

public class Bellman_Ford {
    static  class Edge{
        int srt;
        int dest;
        int weight;
        Edge(int s,int d,int w){
            this.srt = s;
            this.dest =d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0; i<graph.length ;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src){
        int dis[] = new int[graph.length];
        for (int i=0; i<dis.length; i++){
            if (i != src){
                dis[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        //Algo
        for (int i=0; i< V-1; i++){
            //edges  time complexity -- O(E)
            for (int j=0; j< graph.length ;j++){
                for (int k=0; k< graph[j].size() ; k++){
                    Edge e= graph[j].get(k);
                    // u,v,w
                    int u= e.srt;
                    int v = e.dest;
                    int w =e.weight;
                    //relaxation
                    if (dis[u] != Integer.MAX_VALUE && dis[u] + w < dis[v]){
                        dis[v] = dis[u] + w;
                    }
                }
            }
        }
        for (int i=0; i< dis.length; i++){
            System.out.print(dis[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v= 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        int src = 0;
        bellmanFord(graph,src);
    }
}
