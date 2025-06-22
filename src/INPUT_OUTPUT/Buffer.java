package INPUT_OUTPUT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Buffer  {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        int mul = 1;
        for(int i = 0; i < size; i++){
            mul *= arr[i];
        }

        int[] arr1 = new int[size];
        int j = 0;

        for(int i= 0; i < size; i++){
            if(mul % arr[i] == 0){ //then it is prime factor and add it to the result array
                arr1[j] = arr[i];
                j++;
            }
        }

        Arrays.sort(arr1);
        for(int n : arr1){
            System.out.print(n + " ");
        }

    }
}
