package AL.LL;

import javax.crypto.spec.PSource;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step-1 create new node
            Node newNode = new Node(data);
            size++;
        if (head == null){
            head = tail = newNode;
            return;
        }

        //Step-2 newNode next = head
        newNode.next = head; //Link

        //Step-3 head = newNode
        head = newNode;
    }
    public void addLast(int data){
        //Step-1 cerate a new node
        Node newNode =  new Node(data);
        size++;
        if (head == null){
             head = tail = newNode;
            return;
        }
        //Step-2
        tail.next = newNode;
        //Step -3
        tail = newNode;
    }
    /*
    public void addMiddle(int idx, int data){
        if (idx ==0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp= head;
        int i=0;
        while(i < idx -1){
            temp = temp.next;
            i++;
        }
        //i == idx-1; temp -> Prev
        newNode.next = temp.next;
        temp.next = newNode;



    }
    public int removeFirst(){
        if (size ==0){
            System.out.println("Linked Is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size == 0){
            System.out.println("Linked List Empty");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        //Prev
        Node prev = head;
        for (int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val =  prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static void printlist(LinkedList ll){
        //O(N) TC
        Node temp =head;
        while( temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static int iterativesearch(int key, LinkedList ll){// O(n)
        int i=0;
        Node temp =head;
        while(temp != null){
            if (temp.data == key){
                return i;
            }
            temp= temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if (head == null){
            return -1;
        }
        if (head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){// O(n) for both Time and Space Complexity
        return helper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail =  head;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;

        }
        head = prev;
    }
    public void delete(int n){
        Node temp = head;
       // while(temp != null){
       //     temp = temp.next;
       //     size++;
       // }
        //Size - n
        if (n == size){
            head= head.next;
            return;
        }
        int idx =1;
        int indxtofnd = size -n;
        Node prev = head;
        while(idx  < indxtofnd ){
            prev = prev.next;
            idx++;
        }
        prev.next = prev.next.next;
        return;
    }
    public boolean isCycle(){//Floyds Cycle Finding Algo
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                System.out.println("yes");
                return true;
            }
        }
                System.out.println("No");
        return false;
    }
    public void removingCycle(){
        //Detect Cycle
        Node slow = head;
        Node fast =  head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                cycle = true;
                break;
            }
        }
        if (cycle == false){
            System.out.println("Cycle Don't Exist");
            return;
        }
        //Meeing Point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //Removing cycle Last.next = null;
        prev.next = null;
    }

    public Node MergeSort(Node head){

        if (head == null || head.next == null){
            return head;
        }

        // Find Mid
        Node mid = getMid(head);

        // Split the list into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Sort each half
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(rightHead);

        // Merge sorted halves
        return merge(newLeft, newRight);
    }
    public Node getMid(Node head) {
        if (head == null) return head;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    private Node merge(Node left,Node  right){
        Node mergedll = new Node(-1);
        Node temp =  mergedll;

        while (left != null && right != null){
            if (left.data <= right.data){
                temp.next = left;
                left = left.next;
            }else {
                temp.next = right;
                right =  right.next;
            }
                temp = temp.next;
        }
        while(left != null ){
            temp.next = left;
        }
        while (right != null){
            temp.next = right;
        }
        return mergedll.next;
    }
*/
    public static void printlist(LinkedList ll){
        //O(N) TC
        Node temp =head;
        while( temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigZag(){
        //Find Mid
        Node slow =head;
        Node fast =  head;
        while(fast != null && fast != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        Node mid = slow;
        //Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev =  null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt Merge -> ZigZag
        while (left != null && right != null){
            nextL= left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
        }
    }
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        //From First
//        printlist(ll);
//        ll.addFirst(2);
//        ll.addFirst(1);
//        //From Last
//        ll.addLast(3);
//        ll.addLast(4);
        //On Particular Index
//        ll.addMiddle(2,9);
//        printlist(ll);
//        System.out.println("Size Of Linked List Is:- " + size);
//        System.out.println("After Removing First Element");
//        ll.removeFirst();
//        printlist(ll);
//        System.out.println("Size Of Linked List After Removing First Element:- " + size);
//        ll.removeLast();
//        printlist(ll);
//        System.out.println("Size Of Linked List After Removing Last Element:- " + size);

//        System.out.println("Key Found At Index:- "+ iterativesearch(4, ll));

//        System.out.println(ll.recSearch(4));
//        ll.reverse();
//        printlist(ll);
//
//        ll.delete(3);
//        printlist(ll);

//        ll.isCycle();

        LinkedList ll2 = new LinkedList();
        ll2.addLast(1);
        ll2.addLast(2);
        ll2.addLast(3);
        ll2.addLast(4);
        ll2.addLast(5);
        //1->2->3->4->5

        printlist(ll2);
        ll2.zigZag();
        printlist(ll2);



    }
}
