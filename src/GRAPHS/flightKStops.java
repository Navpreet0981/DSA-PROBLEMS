package GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//USING DIJKSTRA'S ALGORITHM --> FINDING BEST ROUTE WITH K(NUMBER OF STOPS)
public class flightKStops {

    static class Edge{
        int src;
        int dest;
        int  weight;
        Edge(int s, int d, int wt){
            this.src= s;
            this.dest = d;
            this.weight=wt;

        }
    }
    public static void createGraph(ArrayList<Edge> graph[], int flight[][]){
        for (int i=0; i< graph.length ;i++){
            graph[i] = new ArrayList<>();
        }
        for (int i=0; i< flight.length;i++){
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];


            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    static class Info {
        int vertex;
        int cost;
        int stops;
        public Info(int v, int c, int s){
            this.vertex = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlight(int n, int flight[][], int src, int dest, int k){
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph,flight);
        int dist[] = new int[n];
        for (int i=0; i<n;i++){
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> q = new LinkedList<Info>();
        q.add(new Info(src, 0, 0));
        while(!q.isEmpty()){
            Info curr = q.remove();
            if (curr.stops > k){
                break;
            }

            for (int i=0; i<graph[curr.vertex].size(); i++){
                Edge e= graph[curr.vertex].get(i);
                int u = e.src;
                int v  = e.dest;
                int wt =  e.weight;

                if (curr.cost + wt <dist[v] && curr.stops <= k){
                    dist[v] = curr.cost+ wt;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }
         if (dist[dest] == Integer.MAX_VALUE){
             return -1;
         }
         else {
             return dist[dest];
         }
    }

    public static void main(String[] args) {
        int n=4;
        int flight[][]={{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}};
        int src=0, dst=3, k=1;

        System.out.println(cheapestFlight(n, flight, src, dst, k));
    }
}