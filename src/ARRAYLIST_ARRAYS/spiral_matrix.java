package ARRAYLIST_ARRAYS;
public class spiral_matrix {

    public static void printSpiral(int matrix[][]){
         int startRow =0;
         int endRow = matrix.length-1;
         int startCol = 0;
         int endCol = matrix[0].length-1;

         while (startRow <= endRow && startCol <= endCol) {

            //Top
            for(int j = startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+ " ");
            }

            //Right
            for(int i= startRow+1; i<= endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //Bottom
            for(int j = endCol-1; j>= startCol; j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i = endRow-1; i >= startRow+1; i--){
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
         }
    }

    public static void main(String[] args) {
        int matrix[][] = { {1,2,3},
                           {5,6,7},
                           {9,10,11}};
        printSpiral(matrix);
    }
    
}
