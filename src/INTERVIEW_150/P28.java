package INTERVIEW_150;

import java.util.ArrayList;
import java.util.List;

public class P28 {
//    Print in Spiral form

public List<Integer> spiralOrder(int[][] matrix) {
    int sr = 0;
    int er = matrix.length - 1;
    int sc = 0;
    int ec = matrix[0].length - 1;

    List<Integer> li = new ArrayList<>();

    while (sr <= er && sc <= ec) {
        // Will Print The Top
        for (int j = sc; j <= ec; j++) {
            li.add(matrix[sr][j]);
        }

        // Will Print Right
        for (int i = sr + 1; i <= er; i++) {
            li.add(matrix[i][ec]);
        }

        if(sr < er){
            // Will Print Bottom
            for (int j = ec - 1; j >= sr; j--) {
                li.add(matrix[er][j]);
            }
        }

        if(sc < ec){

            // Will Print Left
            for (int i = er - 1; i >= sr + 1; i--) {
                li.add(matrix[i][sc]);
            }
        }

        sr++;
        sc++;
        er--;
        ec--;
    }
    return li;
}
}
