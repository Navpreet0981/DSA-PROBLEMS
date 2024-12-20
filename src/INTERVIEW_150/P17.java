package INTERVIEW_150;

public class P17 {
//    Integer to roman
public String intToRoman(int num) {
    int[] intCode = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    String[] strCode = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    StringBuilder str = new StringBuilder();
    for (int i = 0; i < intCode.length; i++) {
        while (num >= intCode[i]) {
            str.append(strCode[i]);
            num -= intCode[i];
        }
    }
    return str.toString();
}
}
