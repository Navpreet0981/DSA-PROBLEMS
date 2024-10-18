package GREEDY;

public class DividenConquer {
    public static void PrintArr(int arr[]){
        for (int i=0; i<= arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
  /*  public static void MergeSort(int arr[], int si, int ei){

        if (si >= ei){
            return;
        }
        int mid = si + (ei -si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid +1, ei);
        Merging(arr, si, mid,ei);

    }
    public static void Merging(int arr[], int si,int mid, int ei ){
        //left (0,3)=4  right(4,6) = 3 -> 6-0+1
        int temp[] = new int[ei - si + 1];
        int i =si;        //iterator for left part
        int j = mid+1;   //iterator for right part
        int k =0;        // iterator for temp arr

        while (i <= mid && j <= ei){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }
            else{
                temp[k] = arr[j];
                j++; k++;
            }
        }
        //left Part
        while (i<= mid){
            temp[k++] = arr[i++];
        }

        //Right Part
        while (j <= ei){
            temp[k++] = arr[j++];
        }

        //Copy to Original Arr
        for (k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
   */   //MergeSort Code

   /* public static void QuickSort(int arr[], int si, int ei){
        if (si >= ei) {
            return;
        }
        //last element
        int pIndx = partition(arr, si, ei);
        QuickSort(arr, si, pIndx-1); //Left Part
        QuickSort(arr, pIndx+1, ei);  //Right Part
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1; // To Make Space For elements Smaller Than Pivot
        for (int j = si; j < ei; j++){
            if (arr[j] <= pivot){
                i++;
                //Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        //Swap
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }*/  //Quick Sort Code

    public static int search(int array[], int target, int si, int ei){
        //BAse Case
        if (si > ei){
            return-1;
        }
         //Mid
        int mid = si + (ei-si)/2;

        //Case:1 -> Element At Mid
        if (array[mid] == target){
            return mid;
        }

        //Case:2 -> Mid On L1
        if (array[si] <= array[mid]){
            //Case:A -> Searh In Left
            if (array[si] <= target && target <= array[mid]){
                return search(array, target, si, mid);
            }else {
                //Case:B -> Right Side
                return search(array, target, mid+1, ei);
            }
        }

        //Case:3 Mid On L2
        else {
            //Case:C -> Right Side Of L2
            if (array[mid] >= target && target <= array[ei]){
               return search(array, target, mid+1, ei);
            }
            else {
                //Case:D -> Left Side Means All Over L1 And Left Side OF Mid Of L2
                return search(array, target, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]= {2,6,5,7,8,9,1};
        int array[] = {4,5,6,7,0,1,2};
        int target = 1;
//        MergeSort(arr, 0, arr.length-1);
//        QuickSort(arr, 0, arr.length-1);
        int targetIndx = search(array, target,0, array.length-1);
        System.out.println(targetIndx);
//        PrintArr(arr);
    }
}
