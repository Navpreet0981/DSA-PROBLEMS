package SORTING;

public class binary_search {
    public static int BinarySearch(int numbers[], int key){
        int start =0, end = numbers.length -1;

        while(start <= end){
            int mid = (start + end)/2;

            //COMPARISON
            if(numbers[mid] == key ){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1; 
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        
        int numbers[] = {2, 4, 5, 6, 8, 9, 13};
        int key = 15;
        System.out.println("Index For Key Is:- "+ BinarySearch(numbers, key));
        
    }
    
}
