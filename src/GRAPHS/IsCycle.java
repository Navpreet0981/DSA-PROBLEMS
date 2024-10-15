package GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsCycle {

    static class Edge{
        int start;
        int dest;
        Edge(int s, int d){
            this.start = s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0;i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }

//        graph[0].add(new Edge(0,1));
//        graph[0].add(new Edge(0,2));
//
//        graph[1].add(new Edge(1,3));
//
//        graph[2].add(new Edge(2,3));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));

    }

    public static boolean isCycle(ArrayList<Edge>[] graph){
        int curr;
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i=0;i< graph.length ;i++){
            if (!vis[i]){
                if (isCycleUtil(graph, i,vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (stack[e.dest]){
                return true;
            }
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis,stack) ){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void topSort(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack <Integer> s = new Stack<>();
        for (int i=0; i< graph.length;i++){
            if (!vis[i]){
                topSortUtil(graph, i, vis, s);
            }
        }
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> [] graph, int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;
        for (int i=0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void calculateInDeg(ArrayList<Edge>[] graph, int indeg[]){
        for (int i=0; i< graph.length; i++){
            int v =i;
            for (int j=0; j< graph[v].size(); j++){
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void topSortBFS(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<indeg.length ;i++){
            if (indeg[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");
            for (int i=0; i< graph[curr].size() ;i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));
        topSort(graph);
        System.out.println();
        topSortBFS(graph);
    }
}
