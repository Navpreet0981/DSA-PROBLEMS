package GRAPHS;

public class DisjointSets {

    static int n  =7;
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
    //Path Comprasion

    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);
        System.out.println(find(5));
    }
}
