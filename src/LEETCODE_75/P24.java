package LEETCODE_75;

public class P24 {

//    Delete the middle element from the Linked List
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteMiddle(ListNode head) {
            // Base case: if the list is empty or has only one node, return null
            if(head == null || head.next == null){
                return null;
            }

            // Calculate the size of the list
            ListNode temp = head;
            int size = 0;
            while (temp != null) {
                temp = temp.next;
                size++;
            }

            // Calculate the index of the middle node
            int mid = size / 2;

            // Traverse to the node before the middle node
            ListNode prev = head;
            int idx = 0;

            while(idx < mid - 1){
                prev = prev.next;
                idx++;
            }
            prev.next = prev.next.next;
            return head;
    }


}
