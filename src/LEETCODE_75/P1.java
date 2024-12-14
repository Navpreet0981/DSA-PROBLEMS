package LEETCODE_75;

public class P1 {
//    To Merge String Alternatively
public String mergeAlternately(String word1, String word2) {
    StringBuilder merged = new StringBuilder(word1.length() + word2.length());
    int i=0, j=0;
    while(i < word1.length() || j<word2.length()){
        if(i<word1.length()){
            merged.append(word1.charAt(i));
            i++;
        }
        if(j < word2.length()){
            merged.append(word2.charAt(j));
            j++;
        }
    }

    return merged.toString();
}
}
