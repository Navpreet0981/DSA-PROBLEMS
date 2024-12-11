// package DSA_PROBLEMS;/
// 
import java.util.*;
import java.util.Arrays;

public class Revision {
    public static void butter(int n){

      for (int i =1; i<= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          for (int j = 1; j <= (2*(n - i)); j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }

      for (int i =n; i>=1; i--){
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          for (int j = 1; j <= (2*(n - i)); j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
    }
    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static  void hollowRhombus(int n){
        for (int i=1; i <= n; i++){
            for (int j=1; j<= (n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                if (i ==1|| i == n|| j == 1|| j == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static  void Diamond(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void floyd(int n){
        int num=1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static int factorial(int n){
        int fact=1;
        if(n == 1|| n == 0){
            return fact;
        }
        int fnm1= factorial(n-1);
        int f = fnm1 * n;
        return f;

    }
    public static int Binarysearch(int num[], int key){
        int first=0, end= num.length-1;
        while(first <= end){
            int mid = (first + end)/2;
            if (num[mid] == key){
                return mid;
            }
            else if(num[mid] < key){
                first = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static int reverseArray(int num[]){
        int first2=0, end2=num.length-1;
        while(first2 < end2){
            int temp = num[first2];
            num[first2] = num[end2];
            num[end2] = temp;

            first2++;
            end2--;

        }
        return 0;
    }
    public static void pairArray(int num[]){
        for (int i=0; i< num.length; i++){
            int cur = num[i];
            for (int j = i+1; j< num.length; j++){
                System.out.print("("+cur+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void subArrays(int num[]){
        for (int i = 0; i< num.length; i++){
            for (int j =0; j<num.length; j++){
                for (int k =i; k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
                System.out.println();
        }
    }
    public static void bubbleSort(int num2[]){
        for (int i=0; i<= num2.length;i++){
            for (int j=0; j < num2.length-i-1; j++){
                if (num2[j] > num2[j+1]) {
                    int temp = num2[j];
                    num2[j] = num2[j+1];
                    num2[j+1] = temp;
                }
            }
        }
    } //Bubble Sort
    public static void printArray(int num2[]){
        for (int i=0; i< num2.length; i++){
            System.out.print(num2[i]+" ");
        }
    } //Print Array Sorted By Sorting Alog's
    public static void selectionSort(int num2[]){
        for (int i=0; i< num2.length; i++){
            int minPos = i;
            for (int j=i+1; j< num2.length; j++){
                if (num2[minPos] > num2[j]){
                    minPos = j;
                }
//                if (num2[minPos] < num2[j]){ // For Printing Array In decreasing Form
//                    minPos = j;
//                }
            }
            int temp = num2[minPos];
            num2[minPos] = num2[i];
            num2[i] = temp;
        }
    }



    public static void main(String[] args) {
        int num[] = {2,3,4,5,6,7};
        int num2[] = {4,67,18,59,0};
        int key = 5;
        //butter(4);

        //System.out.println();

        //rhombus(4);

        // hollowRhombus(4);

        //Diamond(4);

        //floyd(4);

        //System.out.print(factorial(5));

        //System.out.println(Binarysearch(num,key));

        /*reverseArray(num);
          for (int i=0; i<= num.length; i++){
                System.out.print(num[i]+" ");
          } */

        //pairArray(num);

        //subArrays(num);

        //bubbleSort(num2);
        //printArray(num2);

        //selectionSort(num2);
        //Arrays.sort(num);
        //printArray(num);

        //Arrays.sort(num2);
        //printArray(num2);



        


    }
}
