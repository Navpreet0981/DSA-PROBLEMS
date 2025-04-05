package ARRAYLIST_ARRAYS;

public class firstOcurrence {
    public static void firstOccur(int arr[], int key){
        int i =0;
        if (key == arr[i]){
            System.out.println(i);
        }else{
            System.out.println("Key Not Found");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,5};

        firstOccur(arr,5);
    }
}
