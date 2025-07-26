package JAVA_FEATURES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareObjects {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(29);
        arr.add(10);
        arr.add(44);
        arr.add(14);

        CompareObjects c1 = new CompareObjects();
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                if 1 than swap
//                if 0 Or -1 than don't swap
                  int u1 = o1 % 10;
                  int u2 = o2 % 10;
//                (u1 - u2)
                  if(u1 < u2){
                      return -1;
                  } else if (o1 > o2){
                      return 1;
                  } else {
                      if(u1 < u2){
                          return -1;
                      } else if (o1 > o2){
                          return 1;
                      }
                  }

                return 0;
            }
        };
        Collections.sort(arr);
        c1.display(arr);
    }

    public <T> void display(ArrayList<T> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
            if(i != list.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
