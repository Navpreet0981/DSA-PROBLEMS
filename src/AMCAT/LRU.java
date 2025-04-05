package AMCAT;

import java.util.ArrayList;
import java.util.List;

public class LRU {

    public static int missCache(int[] arr, int cap){
        int n = arr.length;
        int miss = 0;
        List<Integer> ls = new ArrayList<>(cap);
        for(int page: arr){
            if(ls.contains(page)){
                ls.remove(Integer.valueOf(page));
            }else {
                miss++;
                if(ls.size() >= cap){
                    ls.removeFirst();
                }
            }
            ls.add(page);
        }
        return miss;
    }
    public static void main(String[] args){
        int[] pages = {2, 3, 1, 3, 2, 1, 4, 3, 2};
        System.out.println("Total cache Misses: " + missCache(pages, 2));
    }
}
