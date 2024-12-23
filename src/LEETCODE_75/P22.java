package LEETCODE_75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P22 {
//    unique Number of occurences
public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (int num : arr) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    Set<Integer> frequencySet = new HashSet<>();

    for (int freq : frequencyMap.values()) {
        if (!frequencySet.add(freq)) {
            return false;
        }
    }

    return true;
}
/*
Example 1:
    Input: arr = [1,2,2,1,1,3]
    Output: true
    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
    Example 2:

    Input: arr = [1,2]
    Output: false

 */
}
