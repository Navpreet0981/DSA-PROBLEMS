package LEETCODE_75;

import java.util.HashSet;
import java.util.List;

public class P38 {
//    Keys And Rooms-- 841
public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    //Use DFS Algorithm
    HashSet<Integer> visited = new HashSet<>();

    DFS(rooms, 0, visited);

    if(visited.size() == rooms.size()){
        return true;
    }
    return false;
}

    public void DFS(List<List<Integer>> rooms, int currentRoom, HashSet<Integer> visited ){
        visited.add(currentRoom);

        List<Integer> keyOfRoom = rooms.get(currentRoom);

        for(int key : keyOfRoom){
            if(!visited.contains(key)){
                DFS(rooms, key, visited);
            }
        }
    }
}
