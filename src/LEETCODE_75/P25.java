package LEETCODE_75;

public class P25 {
//    To Replace elements of the Linked List By adding odd index elements at the end and even on front..

     class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     public ListNode oddEvenList(ListNode head) {
            if(head == null || head.next == null) return head;

            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;

            while( even != null && even.next != null){
                odd.next = even.next;
                odd = odd.next;

                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
            return head;
     }

     /*
     Input: head = [2,1,3,5,6,4,7]
     Output: [2,3,6,7,1,5,4]
      */
}
