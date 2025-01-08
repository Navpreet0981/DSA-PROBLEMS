package INTERVIEW_150;

import java.util.HashSet;

public class P26 {
//    valid Sudoku
public boolean isValidSudoku(char[][] board) {
    // Hashset Of Strings

    HashSet<String> numbersFound = new HashSet<>();
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if(board[i][j] != '.'){
                if(!numbersFound.add(i + "row" + board[i][j])){
                    return false;
                }
                if(!numbersFound.add(j + "column" + board[i][j])){
                    return false;
                }
                int boxNumber = ((i / 3) * 3) + (j / 3);
                if(!numbersFound.add(boxNumber + "box" + board[i][j])){
                    return false;
                }
            }
        }
    }
    return true;

}

}
