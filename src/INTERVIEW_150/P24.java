package INTERVIEW_150;

public class P24 {
//    To Rotate the matrix
public static void rotate(int[][] matrix) {

    // Transpose of Matrix
        /*
        [ [1, 2, 3],
          [4, 5, 6],   to
          [7, 8, 9] ]

        [ [1, 4, 7],
          [2, 5, 8], It Is transpose of the matrix
          [3, 6, 9] ]
        */

    for(int i =0;i < matrix.length; i++){
        for (int j = 0; j < i; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    // Reverse The Rows now
        /*

        [ [7, 4, 1],
          [8, 5, 2]; It Is a reversal each row of the matrix
          [9, 6, 3] ]
        */
    for(int i =0;i < matrix.length; i++){
        for (int j = 0; j < matrix[0].length / 2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][matrix[0].length - j -1];
            matrix[i][matrix[0].length - j -1] = temp;
        }
    }
}

/*
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
 */

}
