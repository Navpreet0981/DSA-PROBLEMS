package LEETCODE_75;

public class P39 {
//    Number Of Provinces
public int findCircleNum(int[][] isConnected) {
    int n = isConnected.length;
    boolean[] visited = new boolean[n];
    int count = 0;

    for(int i = 0; i < n; i++){
        if(!visited[i]){
            dfs(isConnected, visited, i);
            count++;
        }
    }
    return count;
}
    public void dfs(int[][] isConnected, boolean[] visited, int currentCity){
        visited[currentCity] = true;
        for (int nextCity = 0; nextCity < isConnected.length; nextCity++) {
            if (isConnected[currentCity][nextCity] == 1 && !visited[nextCity]) {
                dfs(isConnected, visited, nextCity);
            }
        }
    }
}
