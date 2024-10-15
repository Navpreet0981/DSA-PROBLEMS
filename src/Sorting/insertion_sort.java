public class insertion_sort {

    public static void InsertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int cur =arr[i] ;
            int prev = i-1;
            //Finding Out Current Element To Insert
            while (prev>= 0 && arr[prev] > cur) {
                arr[prev+1 ] = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev +1] = cur;
        }
    }
    public static void PrintArr(int arr[]){
        for(int i =0; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] =  {5, 4 ,3 ,2 ,1 };
        InsertionSort(arr);
        PrintArr(arr);

        //Time Complexity O(n^2)
    }
    
}
