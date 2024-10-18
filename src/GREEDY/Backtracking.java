package GREEDY;

public class Backtracking {
    public static void changeArray(int arr[], int i, int vol){
        //Base Case
        if (i ==arr.length){
            PrintArr(arr);
            return;
        }

        //Recursion
         arr[i] = vol;
         changeArray(arr, i+1, vol+1); //Fxn Call
         arr[i] = arr[i] -2;//Backtracking
    }
    public static  void PrintArr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void FindSubsets(String str, String ans, int i){
        //Base Case
        if (i == str.length()){
            if (ans.length() == 0){
                System.out.println("Null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        //Recursion
        //Yes Choice
        FindSubsets(str, ans+str.charAt(i), i+1);
        //No Choice
        FindSubsets(str,ans, i+1);
    }
    public static void findPermutation(String str, String ans){
        //Base Case
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }

        //Recursion -->
        for (int i=0; i<str.length() ; i++){
            char curr = str.charAt(i);
            //"ABCDE" = "AB"+"DE"
            String Newstr = str.substring(0,i) + str.substring(i+1);
            findPermutation(Newstr, ans+curr);


        }
        // Time Complexity--> O(n * n!)
    }
    public static int gridWays(int i, int j, int n, int m){
        if (i == n-1 && j == m-1){  //Last Cell Case
            return 1;
        }
        else if( i == n || j == m){ //Boundary Cross Case
            return 0;
        }
        int W1 = gridWays(i+1, j, n,m);
        int W2 = gridWays(i, j+1,n,m);
        return W1 + W2;
    }
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //Column
        for (int i=0; i<=8; i++){
            if (sudoku[i][col] == digit){
                return false;
            }
        }
        //row
        for (int j=0; j<=8; j++){
            if (sudoku[row][j] ==digit){
                return  false;
            }
        }
        //Grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        //3x3 Grid
        for (int i=sr; i<sr+3; i++){
            for (int j = sc; j <sc+3; j++){
                if (sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;

    }
    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //Base Case
        if (row == 9){
            return true;
        }
        //recursion
        int nextRow = row, nextCol = col+1;
        if (col+1 ==9){
            nextRow = row+1;
            nextCol =0;
        }
        if (sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (int digit =1; digit<=9; digit++){
            if (isSafe(sudoku ,row,col,digit)){
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col] =0;
            }
        }
        return false;

    }
    public static void PrintSudoku(int sudoku[][]){
        for (int i=0; i<9; i++){
            for (int j=0; j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int arr[] = new int[5];
//        changeArray(arr,0,1);
//        String str = "ABC";
//        FindSubsets(str, "", 0);
//        findPermutation(str,"");
//        int n =5, m=3;
//        System.out.println(gridWays(0,0, n, m));


        int sudoku[][] = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}};
        if (sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution Exists:- \n");
            PrintSudoku(sudoku);
        }else {
            System.out.println("Solution don't Exists");
        }



    }
}
