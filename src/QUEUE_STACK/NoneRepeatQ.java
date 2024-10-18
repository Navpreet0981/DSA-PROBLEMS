package QUEUE_STACK;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NoneRepeatQ {
    public static void printNonRepeating(String s){
        int freq[] = new int[26];

        Queue<Character> q = new LinkedList<>();

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek() - 'a']>1){
                q.remove();
            }
            if (q.isEmpty()){
                System.out.println(-1+"");
            }else {
                System.out.println(q.peek()+"");
            }
        }
            System.out.println();
    }

    public static void InterLeave(Queue<Integer> q){
        Queue<Integer> firstHalf= new LinkedList<>();
        int size = q.size();

        for (int i=0; i<size/2; i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

    }

    public static void ReverseQ(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        int size = q.size();

        for (int i =0; i<size; i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();


    }


    public static void main(String[] args) {
//        String s = "aabccxb";
//        printNonRepeating(s);

       /* Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        InterLeave(q);
        while (!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();

        */
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        ReverseQ(q);

    }

}
