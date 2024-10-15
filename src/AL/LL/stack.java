package AL.LL;

import java.util.ArrayList;
import java.util.Stack;

public class stack {
    /*static class stackAL{
        static ArrayList<Integer> list =  new ArrayList<>();

        //IsEmpty() Method
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //Push
        public void Push(int data){
            list.add(data);
        }

        //Pop
        public int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //Peek
        public int peek(){
            return list.get(list.size()-1);
        }
    }*/

   /* static class Node { //LinkedList Created
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
        static class stackll{
            static Node head = null;

            //IsEmpty
            public static boolean isEmpty(){
                return head==null;
            }
            //push
            public static void push(int data){
                Node newNode = new Node(data);
                if (isEmpty()){
                    head = newNode;
                    return;
                }
                newNode.next= head;
                head = newNode;
            }
            //POP
            public static int pop(){
                if (isEmpty()){
                    return -1;
                }
                int top= head.data;
                head = head.next;
                return top;
            }
            //PEEK
            public static int peek(){
                if (isEmpty()){
                    return -1;
                }
                return head.data;
            }

        }
    */


   //To Push data at the bottom
    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top =  s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
    }

    public static void StockSpan(int stocks[], int span[]){
        Stack<Integer> s= new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if (s.isEmpty()){
                span[i] = i+1;
            }else {
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }


    }

    public static void NextGreater(int arr[]){
        int nextgrtr[] = new int[arr.length];
        Stack<Integer> g = new Stack<>();
         

    }

    public static void main(String[] args) {
       /*
       //Using ArrayList
       stackAL s = new stackAL();
        s.Push(1);
        s.Push(2);
        s.Push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        */

        /*
        //Using Linked List
        stackll s2 = new stackll();
        s2.push(1);
        s2.push(2);
        s2.push(3);

        while(!s2.isEmpty()){
            System.out.println(s2.peek());
            s2.pop();
        }
         */

        //Using Java Collection Frameworks
//        Stack<Integer> s3 = new Stack<>();
//        s3.push(1);
//        s3.push(2);
//        s3.push(3);
//
//        //pushAtBottom(s3,4);
//        reverseStack(s3);
//        printStack(s3);
        /*
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        System.out.println("Original Stack:");
//        printStack(stack); // Printing original stack (This will empty the stack)
//
//        // Re-push the elements since printStack() emptied the stack
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        reverseStack(stack);
//
//        System.out.println("Reversed Stack:");
//        printStack(stack);
        */

        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        StockSpan(stocks, span);

        for (int i=0; i< span.length; i++){
            System.out.print(span[i]+" ");
        }




    }
}
