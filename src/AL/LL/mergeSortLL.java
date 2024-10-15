package AL.LL;

public class mergeSortLL    {

    public static class Node{
        int data;
        LinkedList.Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static LinkedList.Node head;
    public static LinkedList.Node tail;
    public static int size;

    public void addFirst(int data){
        //step-1 create new node
        LinkedList.Node newNode = new LinkedList.Node(data);
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
        LinkedList.Node newNode =  new LinkedList.Node(data);
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
    public static void printlist(LinkedList ll){
        //O(N) TC
        LinkedList.Node temp =head;
        while( temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigZag(){
        //Find Mid
        LinkedList.Node slow =head;
        LinkedList.Node fast =  head;
        while(fast != null && fast != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        LinkedList.Node mid = slow;
        //Reverse 2nd half
        LinkedList.Node curr = mid.next;
        mid.next = null;
        LinkedList.Node prev =  null;
        LinkedList.Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        LinkedList.Node left = head;
        LinkedList.Node right = prev;
        LinkedList.Node nextL, nextR;

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
