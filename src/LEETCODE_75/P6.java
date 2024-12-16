package LEETCODE_75;

public class P6 {
//    Reverse Strings

    public String reverseWords(String s) {
// Trim leading and trailing spaces and split by whitespace
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        // Reverse the array of words
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
