package LEETCODE_75;

public class P9 {

    public int compress(char[] chars) {
        int write = 0;
        int i = 0;
        while(i < chars.length){
            char currentChar = chars[i];
            int count = 0;
            while(i < chars.length && currentChar == chars[i]){
                i++;
                count++;
            }
            chars[write++] = currentChar;

            if (count > 1){
                String countStr = Integer.toString(count);
                for (char c: countStr.toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }

    /*
    ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
     */
}
