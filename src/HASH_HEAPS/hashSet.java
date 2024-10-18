package HASH_HEAPS;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(1);
        hs.add(4);
        hs.add(2);
        hs.add(2);
        System.out.println(hs);
//        hs.remove(4);
        if (hs.contains(4)){
            System.out.println("Yes it Contains 2");
        }

        //Iterations on Sets
        //Using Iterator Interface
//        Iterator itr = hs.iterator();
//        while(itr.hasNext()){
//            System.out.print(itr.next()+" ");
//        }

        //Using Advanced for Loop
        for (Integer i : hs){
            System.out.print(i+" ");
        }

        
    }
}
