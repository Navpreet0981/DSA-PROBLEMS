package AMCAT;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertInCL {
    public static int size = 0;
    static Node head = null;
    static Node tail = null;
    public static void addEnd(int data){
        Node newnode = new Node(data);
        if(head ==null){
            head = tail = newnode;
            tail.next = head;
        } else {
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }
        size++;
    }

    public static void insertInSorted(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
            tail.next = head;
            return;
        }
        if(val < head.data){
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
            return;
        }
        if(val > tail.data){
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            if(temp.data <= val && temp.next.data >= val){
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
    }

    public static void print(){
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data +"->");
            temp = temp.next;
        }while(temp != head);
        System.out.print("Back To Head");
    }


    public static void main(String[] args){
        addEnd(1);
        addEnd(2);
        addEnd(3);
        addEnd(5);

        insertInSorted(4);

        print();
    }
}
