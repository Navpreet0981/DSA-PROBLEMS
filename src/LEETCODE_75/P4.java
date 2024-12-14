package LEETCODE_75;

public class P4 {
//    To return true or false of we can add the flowwers in flowerbed in adjancy manner Count
public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count=0;
    int length= flowerbed.length;
    for(int i=0; i< length ;i++){
        if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == length - 1 || flowerbed[i + 1] == 0)) {
            flowerbed[i] =1;
            count++;
        }
        if(count >= n){
            return true;
        }
    }
    return count >= n;

}
/*
Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false

 */
}
