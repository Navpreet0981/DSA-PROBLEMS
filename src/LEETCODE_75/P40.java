package LEETCODE_75;

import java.util.LinkedList;
import java.util.Queue;

public class P40 {
//    Nearest ExitFrom THe Maze
public int nearestExit(char[][] maze, int[] entrance) {
    // Initialize BFS queue
    Queue<int[]> q = new LinkedList<>();
    q.offer(entrance);

    // Directions for movement: down, right, up, left
    int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    // Mark the entrance as visited in the maze itself
    maze[entrance[0]][entrance[1]] = '+';

    int steps = 0;

    while (!q.isEmpty()) {
        steps++; // Increment level
        int size = q.size(); // Nodes at the current level

        for (int i = 0; i < size; i++) {
            int[] current = q.poll();
            int r = current[0];
            int c = current[1];

            // Explore all four possible directions
            for (int[] dir : dirs) {
                int nextR = r + dir[0];
                int nextC = c + dir[1];

                // Check if the next cell is within bounds and open
                if (nextR >= 0 && nextR < maze.length && nextC >= 0 && nextC < maze[0].length && maze[nextR][nextC] == '.') {

                    // If it's an exit, return steps
                    if (nextR == 0 || nextR == maze.length - 1 || nextC == 0 || nextC == maze[0].length - 1) {
                        return steps;
                    }

                    // Mark it as visited and enqueue
                    maze[nextR][nextC] = '+';
                    q.offer(new int[] { nextR, nextC });
                }
            }
        }
    }

    // If no exit is found, return -1
    return -1;
}


}
