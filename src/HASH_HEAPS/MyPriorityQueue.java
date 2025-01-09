package HASH_HEAPS;

import java.util.Collections;
import java.util.PriorityQueue;
class Students implements Comparable<Students>{
    int marks;
    String name;

    Students(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student Name:- " + this.name + ", marks:- " + this.marks;
    }

    @Override
    public int compareTo(Students that) {

        if(this.marks == that.marks){
            return this.name.compareTo(that.name); // Lex-graphically sort the elements
        }
        return this.marks - that.marks; // Arrange in Ascending Order or Increasing Order
//        return that.marks - this.marks; // Arrange in descending Order or decreasing Order

    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Students){
            Students that = (Students) obj;
            if(this.marks == that.marks && (this.name.compareTo(that.name)) == 0){
                return true;
            }
        }
        return false;
    }
}
public class MyPriorityQueue {
    public static void main(String[] args) {

        /*

    PriorityQueue<Integer> minPq = new PriorityQueue<>(); //Min Priority Queue
    minPq.offer(10);
    minPq.offer(0);
    minPq.offer(2);
    minPq.offer(52);
        System.out.println("Minimum max priority element:- "+minPq.peek());
        System.out.println("Element Deleted:- "+minPq.poll());


    PriorityQueue<Integer> maxPq =  new PriorityQueue<>(Collections.reverseOrder());//Max Priority Queue
        maxPq.offer(10);
        maxPq.offer(0);
        maxPq.offer(2);
        maxPq.offer(52);
        System.out.println("Minimum max priority element:- "+maxPq.peek());
        System.out.println("Element Deleted:- "+maxPq.poll());
         */

        PriorityQueue<Students> minStudentPQ= new PriorityQueue<>();
        Students ns = new Students("Palak", 100);
        minStudentPQ.offer(new Students("Navpreet", 50));
        minStudentPQ.offer(new Students("Jaspreet", 90));
        minStudentPQ.offer(new Students("Palak", 100));
        minStudentPQ.offer(new Students("A", 0));
        minStudentPQ.offer(new Students("c", 0));
        minStudentPQ.offer(new Students("B", 10));
        System.out.println(minStudentPQ.peek());
        System.out.println(minStudentPQ.contains(ns));
    }
}
