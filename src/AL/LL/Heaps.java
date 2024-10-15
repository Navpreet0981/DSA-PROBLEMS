package AL.LL;


import java.util.Comparator;
import java.util.PriorityQueue;

//Priority Queue Using JCF
public class Heaps {

    static  class student implements Comparable<student>{
        String name ;
        int rank;
        student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new student("A", 2));
        pq.add(new student("B", 5));
        pq.add(new student("C", 3));
        pq.add(new student("E", 1));
        while(!pq.isEmpty()){
            System.out.print(pq.peek().name+"->"+pq.peek().rank+" ");
            pq.remove();
        }

    }
}
