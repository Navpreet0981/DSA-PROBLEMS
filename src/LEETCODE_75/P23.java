package LEETCODE_75;

public class P23 {
//    To Make Send a Maximum twin sum from the Linked List

    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
 }
public int pairSum(ListNode head) {

    if(head == null || head.next == null){
        return 0;
    }

    ListNode fast = head, slow = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    ListNode curr = slow, prev = null;  // 1 -> 2 -> 3 -> 4 -> 5 -> 6
    while(curr != null){                //          ^(curr)
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;                // 1 -> 2 -> 3 -> 6 -> 5 -> 4
    }

    int maxSum = Integer.MIN_VALUE;
    ListNode first = head, second = prev;
    while(second != null){
        int sum = first.val + second.val;  //  1 -> 2 -> 3 -> 6 -> 5 -> 4   Sum will be = 7 and answer is also 7
        maxSum = Math.max(maxSum, sum);    //  f              s
        first = first.next;
        second = second.next;
    }

    return maxSum;
}

/*
Input: head = [5,4,2,1]
Output: 6
Explanation:
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6.
 */
}
