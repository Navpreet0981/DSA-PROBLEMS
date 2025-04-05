package AMCAT;


public class Cells {
    public static int[] cellCompete(int[] arr, int days){
        int n = arr.length;
        int[] temp = new int[n];
        while(days > 0){
            for(int i = 0; i < n; i++){
               temp[i] = arr[i];
            }
            for(int i = 0; i < n; i++){
                int left = (i == 0) ? 0 : arr[i - 1];
                int right = (i == n - 1) ? 0 : arr[i + 1];
                temp[i] = (left == right) ? 0 : 1;
            }

            for(int i = 0; i < n; i++){
                arr[i] = temp[i];
            }
            days--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,1,1,1};
        int[] res = cellCompete(arr, 2);
        for(int r : res){
            System.out.print(r + " ");
        }
    }
}
