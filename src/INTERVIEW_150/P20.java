package INTERVIEW_150;

public class P20 {
//    Zigzag conversion
public String convert(String s, int numRows) {

    if (numRows == 1 || numRows >= s.length()) {
        return s;
    }
    StringBuilder[] rows = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) {
        rows[i] = new StringBuilder();
    }

    int currentRow = 0;
    boolean goingDown = false;

    for (char c : s.toCharArray()) {
        rows[currentRow].append(c);

        if (currentRow == 0 || currentRow == numRows - 1) {
            goingDown = !goingDown;
        }

        currentRow += goingDown ? 1 : -1;
    }

    StringBuilder result = new StringBuilder();
    for (StringBuilder row : rows) {
        result.append(row);
    }

    return result.toString();
}
/*
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
 */
}
