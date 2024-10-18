package QUEUE_STACK;

import java.util.Stack;

public class queue {

    static  class Queue{
        static int arr[];
        static  int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        //IsEmpty
        public static boolean isEmpty(){
            return rear == -1;
        }

        //Add
        public static void add(int data){
            if (rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear +=1;
            arr[rear] = data;
        }

        //Remove
        public static int remove(){
            if (isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i=0; i<rear; i++){
                arr[i] = arr[i+1];

            }
            rear = rear-1;
            return front;
        }

        //Peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            return arr[0];

        }

    }
    static  class CirQueueArr{
        static int arr[];
        static  int size;
        static int rear;
        static int front;

        CirQueueArr(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front= -1;
        }

        //IsEmpty
        public static boolean isEmpty(){
            return rear == -1 && front ==-1;
        }

        //Full
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //Add
        public static void add(int data){
            if (isFull()){
                System.out.println("Queue is full");
                return;
            }
            //Add First Element
            if (front ==-1){
                front =0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //Remove
        public static int remove(){
            if (isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int result = arr[front];
            if (rear == front){
                rear = front =-1;
            }else {
                front = (front+1)%size;

            }
            return result;
        }

        //Peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            return arr[front];

        }

    }
    static class QueueStack{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        //IsEmpty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //Add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove
        public static int remove(){
            if (s1.isEmpty()){
                System.out.println("Queue Is Empty");
                return -1;
            }
            return s1.pop();
        }

        //peek
        public static int peek(){
            if (s1.isEmpty()){
                System.out.println("Queue Is Empty");
                return -1;
            }
            return s1.peek();
        }
    }




    public static void main(String[] args) {

       /* Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        */
       /* CirQueueArr q= new CirQueueArr(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);


        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        */
       /*
        //Queue Using Tow Stacks
        QueueStack q = new QueueStack();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

         */


    }

}
