package AL.LL;
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1 ,list.get(indx2));
        list.set(indx2 , temp);
    }
    public static void main(String[] args) {
        //Vectors Do Same work As ArrayList In C++

        //Java Collection FrameWork:- We Can easily use the Data Structures in java without Creating Them from Scratch
        // Names Of Classes TO Store the dta in teh ArrayList:- String | Boolean | Float |
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<Boolean> list2 = new ArrayList<>();

//        list.add(12);
//        list.add(5);
//        list.add(13);
//        list.add(6);
//        list.add(8);
//        list.add(2,7);

//        System.out.println(list.size());
//        System.out.println(list.reversed());

        //Maximun Number From ArrayList
//        int max = Integer.MIN_VALUE;
//        for (int i =0; i< list.size(); i++) {
//            //if (max < list.get(i)){
//              //  max= list.get(i);
//            //}
//            max = Math.max(max, list.get(i));
//        }
//        System.out.println("Maximum Elemnt In The List Is:- "+max);

        //Swapping
//        int indx1 =1, indx2 = 3;
//        System.out.println(list);
//        swap(list,indx1, indx2);
//        System.out.println(list);

        //Sorting ArrayList
//        Collections.sort(list);//Ascending Order
//        Collections.sort(list, Collections.reverseOrder());//Descending Order
        //reverseOrder:- Comparators are Inbuilt Methods In java teh code is already writen int the java for this
//        System.out.println(list);


//        System.out.println("To get Element At Particular Index:- "+list.get(3));
//        System.out.println("To Remove Element form Particular Index:- "+list.remove(4));
//        System.out.println("To Change Element from The Particular Index:- "+list.set(1, 20));
//        System.out.println("To Check The List Contain This Element Or Not:- "+list.contains(20));

        //MULTI DIMENSIONAL ARRAYLIST
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr4 = new ArrayList<>();

        //Elements For Arr1
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        //Elements For Arr2
        arr2.add(5);
        arr2.add(6);
        arr2.add(7);
        arr2.add(8);

        //Elements For Arr3
        arr3.add(9);
        arr3.add(10);
        arr3.add(11);
        arr3.add(12);

        //Elements For Arr4
        arr4.add(13);
        arr4.add(14);
        arr4.add(15);
        arr4.add(16);

        mainList.add(arr1);
        mainList.add(arr2);
        mainList.add(arr3);
        mainList.add(arr4);
        System.out.println(mainList);

        for (int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for (int j =0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
