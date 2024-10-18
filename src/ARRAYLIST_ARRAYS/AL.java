package ARRAYLIST_ARRAYS;
import java.util.*;

//ARRAYLIST OPERATIONS
public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(11);
        l2.add(12);
        l2.add(14);
        l2.add(15);
        l2.add(2,13);


        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(3);
        l1.add(6);
        l1.add(0,5);
        l1.addAll(l2);
        System.out.println(l1.contains(9));
        // for(int i=0; i<l1.size(); i++){
        //     System.out.println(l1.get(i));

        // }
    }
    
}
