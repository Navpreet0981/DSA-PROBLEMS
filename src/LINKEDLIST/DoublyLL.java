package LINKEDLIST;

public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node (int data){
            this.data =  data;
            this.next = next;
            this.prev = prev;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }
    //Print
    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data +"<->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public int removeFirst(){
        if (head == null){
            System.out.println("List Is Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1){
            int val = head.data;
            head =tail= null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void reverseDll(){

        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLL dll =  new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
//        System.out.println(dll.size);

//        dll.reverseDll();
//        dll.print();

//
//        dll.removeFirst();
//        dll.print();
//        System.out.println(dll.size);


    }
}
