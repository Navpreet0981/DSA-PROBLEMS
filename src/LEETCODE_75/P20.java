package LEETCODE_75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P20 {
//    Find Difference between two arrays or simply find union
public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    for(int num : nums1){
        set1.add(num);
    }
    for(int num : nums2){
        set2.add(num);
    }

    Set<Integer> uniqueOfNum1 = new HashSet<>(set1);
    uniqueOfNum1.removeAll(set2);

    Set<Integer> uniqueOfNum2 = new HashSet<>(set2);
    uniqueOfNum2.removeAll(set1);

    List<Integer> list1 = new ArrayList<>(uniqueOfNum1);
    List<Integer> list2 = new ArrayList<>(uniqueOfNum2);

    List<List<Integer>> answer = new ArrayList<>();
    answer.add(list1);
    answer.add(list2);

    return answer;

}
/*
Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
Example 2:

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 */
}
