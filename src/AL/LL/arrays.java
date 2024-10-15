package AL.LL;

import java.util.Scanner;

/**
    *arrays
 */
public class arrays {
    public static int LinearSearch(int numbers[], int key){
        int i;
        for(i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                System.out.print(i);
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 7;

        int index = LinearSearch(numbers, key);
    }
}